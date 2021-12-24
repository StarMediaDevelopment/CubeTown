package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Attack;
import com.firecraftmc.ct.enums.Defense;
import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.role.CovenRole;

import java.util.List;

public class Medusa extends CovenRole {
    
    private int stoneGazes = 3;
    
    public Medusa() {
        super(Role.MEDUSA, Attack.POWERFUL, Defense.NONE);
        this.abilities.add("You may choose to Stone Gaze all visitors at night.");
        this.attributes.addAll(List.of("You may choose to stone gaze thrice.", 
                "With the Necronomicon, you may visit players and turn them to stone."));
    }

    public int getPriority() {
        if (target.isSelf()) {
            return 3;
        }
        return 5;
    }
    
    public String getKillMessage() {
        return "{pronown} was turned to stone by the Medusa";
    }
}
