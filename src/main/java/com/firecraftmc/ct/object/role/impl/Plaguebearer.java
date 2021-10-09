package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Attack;
import com.firecraftmc.ct.enums.Defense;
import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.role.ApocalypseRole;

public class Plaguebearer extends ApocalypseRole {
    
    //Infections are tracked in the GamePlayer or whatever the name of the Player class is
    
    public Plaguebearer() {
        super(Role.PLAGUEBEARER, Attack.NONE, Defense.BASIC); 
        setPriority(1);
    }
    
    //Infections take place on priority 1, Transforming into Pestilence is Priority 2
}
