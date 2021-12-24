package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Attack;
import com.firecraftmc.ct.enums.Defense;
import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.role.ApocalypseRole;

import java.util.List;

public class Merchant extends ApocalypseRole {
    
    public Merchant() {
        super(Role.MERCHANT, Attack.NONE, Defense.BASIC); 
        setPriority(1);
        
        this.abilities.add("Choose someone at night to starve.");
        this.attributes.addAll(List.of("Starving will stop the target from using their night abiltiy.", "Starve 4 players to become Famine."));
    }
}