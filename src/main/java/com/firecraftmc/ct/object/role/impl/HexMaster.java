package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.role.CovenRole;
import com.firecraftmc.ct.object.target.Target;

import java.util.ArrayList;
import java.util.List;

public class HexMaster extends CovenRole {
    
    private List<Target> hexedTargets = new ArrayList<>();
    
    public HexMaster() {
        super(Role.HEX_MASTER);
        setPriority(3);
        
        this.abilities.add("You may choose to Hex a player each night.");
        this.attributes.addAll(List.of("With the Necronomicon you gain Astral and Basic attacks.", 
                "Players are still Hexed when you have the Necronomicon."));
    }
}
