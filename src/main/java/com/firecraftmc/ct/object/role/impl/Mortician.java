package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Attack;
import com.firecraftmc.ct.enums.Defense;
import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.role.ApocalypseRole;

import java.util.List;

public class Mortician extends ApocalypseRole {
    
    public Mortician() {
        super(Role.MORTICIAN, Attack.NONE, Defense.BASIC); 
        setPriority(1);
        
        this.abilities.add("Mark two players at night for burial.");
        this.attributes.addAll(List.of("Marks will last for two days and nights", "Players will not know they are marked", 
                "If a marked town member is lynched, you will transform into Death"));
    }
}