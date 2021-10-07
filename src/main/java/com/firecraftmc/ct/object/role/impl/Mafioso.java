package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Attack;
import com.firecraftmc.ct.enums.Defense;
import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.role.MafiaRole;

public class Mafioso extends MafiaRole {
    public Mafioso() {
        super(Role.GODFATHER, Attack.BASIC, Defense.NONE);
        //This gains control immunity when a godfather orders the mafioso 
        setPriority(5);
    }
}
