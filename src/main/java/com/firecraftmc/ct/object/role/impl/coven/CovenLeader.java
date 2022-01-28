package com.firecraftmc.ct.object.role.impl.coven;

import com.firecraftmc.ct.enums.*;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.game.Player;

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
    
    protected void neconomiconActions() {
        this.attack = Attack.BASIC;
        this.defense = Defense.BASIC;
        this.immunities.add(DETECTION);
    }
    
    public String getKillMessage() {
        return "{pronown} {verb} drained by the {rolename}.";
    }
}
