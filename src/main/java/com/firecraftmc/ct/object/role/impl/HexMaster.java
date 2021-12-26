package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.role.CovenRole;
import com.firecraftmc.ct.object.role.KillingRole;
import com.firecraftmc.ct.object.target.Target;

import java.util.ArrayList;
import java.util.List;

public class HexMaster extends CovenRole implements KillingRole {
    
    private List<Target> hexedTargets = new ArrayList<>();
    
    public HexMaster(Game game) {
        super(game, Role.HEX_MASTER);
        setPriority(3);
        
        this.abilities.add("You may choose to Hex a player each night.");
        this.attributes.addAll(List.of("With the Necronomicon you gain Astral and Basic attacks.", 
                "Players are still Hexed when you have the Necronomicon."));
    }
    
    public String getKillMessage() {
        return "{pronown} was hexed by the Hex Master";
    }
}
