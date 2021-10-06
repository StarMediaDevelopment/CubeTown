package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Attack;
import com.firecraftmc.ct.enums.Defense;
import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.role.ApocalypseRole;

public class Plaguebearer extends ApocalypseRole {
    public Plaguebearer() {
        super(Role.PLAGUEBEARER, Attack.NONE, Defense.BASIC);
    }
}
