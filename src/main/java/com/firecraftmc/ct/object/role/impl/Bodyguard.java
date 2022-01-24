package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.*;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.game.Player;
import com.firecraftmc.ct.object.game.Target;
import com.firecraftmc.ct.object.role.TownRole;

public class Bodyguard extends TownRole {
    
    private boolean vestUsed;
    
    public Bodyguard(Game game, Player player) {
        super(game, RoleType.BODYGUARD, player, Attack.POWERFUL, Defense.NONE, 3, Alignment.PROTECTIVE);
        addAbilities("Protect a player from direct attacks at night.");
        addAttributes("If your target is directly attacked or is the victim of a harmful visit, you and the visitor will fight.", 
                "If you successfully protect someone you can still be Healed.");
        setProtectiveDefense(Defense.INVINCIBLE);
        setKillMessage("{pronown} {verb} killed by a {rolename}.");
    }
    
    @Override
    public boolean isValidTarget(GameState state, DayPhase dayPhase, NightPhase nightPhase, Target target) {
        boolean validSelfTarget = true;
        if (target.isSelf()) {
            if (vestUsed) {
                validSelfTarget = false;
            }
        }
        return state == GameState.NIGHT && target != null && target.isAlive() && validSelfTarget;
    }
    
    public Defense getDefense() {
        if (target.isSelf() && !vestUsed) {
            return Defense.BASIC;
        }
        return super.getDefense();
    }
}
