package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Attack;
import com.firecraftmc.ct.enums.Defense;
import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.role.CovenRole;

import static com.firecraftmc.ct.enums.Immunity.*;

public class CovenLeader extends CovenRole {
    public CovenLeader(Game game) {
        super(game, Role.COVEN_LEADER, 2);
        addImmunities(ROLEBLOCK); //TODO Detection with necro
        addAbilities("You may choose to Control someone each night.");
        addAttributes("Your victim will know they are being controlled.", 
                "You will know the role of the player you control.");
    }
    
    protected void neconomiconActions() {
        this.attack = Attack.BASIC;
        this.defense = Defense.BASIC;
    }
    
    public String getKillMessage() {
        return "{pronown} was drained by the Coven Leaders";
    }
}
