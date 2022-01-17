package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Attack;
import com.firecraftmc.ct.enums.RoleType;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.role.CovenRole;
import com.firecraftmc.ct.object.role.KillingRole;
import com.firecraftmc.ct.object.game.Target;

import java.util.ArrayList;
import java.util.List;

public class HexMaster extends CovenRole {
    
    private List<Target> hexedTargets = new ArrayList<>();
    
    public HexMaster(Game game) {
        super(game, RoleType.HEX_MASTER, 3);
        
        addAbilities("You may choose to Hex a player each night.");
        addAttributes("With the Necronomicon you gain Astral and Basic attacks.", 
                "Players are still Hexed when you have the Necronomicon.");
    }
    
    protected void neconomiconActions() {
        this.attack = Attack.BASIC;
    }
    
    public String getKillMessage() {
        return "{pronown} was hexed by the {rolename}.";
    }
}
