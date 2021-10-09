package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Attack;
import com.firecraftmc.ct.enums.Defense;
import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.role.ApocalypseRole;

public class Merchant extends ApocalypseRole {
    
    public Merchant() {
        super(Role.MERCHANT, Attack.NONE, Defense.BASIC); 
        setPriority(1);
    }
}