package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.*;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.game.MultiTarget;
import com.firecraftmc.ct.object.game.Player;
import com.firecraftmc.ct.object.game.Target;
import com.firecraftmc.ct.object.role.CovenRole;

import static com.firecraftmc.ct.enums.Immunity.DETECTION;
import static com.firecraftmc.ct.enums.Immunity.ROLEBLOCK;

public class CovenLeader extends CovenRole {
    public CovenLeader(Game game, Player player) {
        super(game, RoleType.COVEN_LEADER, player, 2);
        addImmunities(ROLEBLOCK);
        addAbilities("You may choose to Control someone each night.");
        addAttributes("Your victim will know they are being controlled.", 
                "You will know the role of the player you control.");
    }
    
    @Override
    public boolean isValidTarget(GameState state, DayPhase dayPhase, NightPhase nightPhase, Target target) {
        boolean validBase = state == GameState.NIGHT && target != null, isValidFirstTarget = true, isValidSecondTarget = true;
        Player firstTargetPlayer = game.getPlayer(target.getName());
        if (target.isSelf() || firstTargetPlayer.getRoleInstance() instanceof CovenRole) {
            isValidFirstTarget = false;
        }
        
        return validBase && isValidFirstTarget && isValidSecondTarget;
    }
    
    protected void neconomiconActions() {
        this.attack = Attack.BASIC;
        this.defense = Defense.BASIC;
        this.immunities.add(DETECTION);
    }
    
    public String getKillMessage() {
        return "{pronown} {verb} drained by the {rolename}.";
    }
}
