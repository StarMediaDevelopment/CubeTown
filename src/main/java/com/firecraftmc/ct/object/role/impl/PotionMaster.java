package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Attack;
import com.firecraftmc.ct.enums.Defense;
import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.role.CovenRole;

public class PotionMaster extends CovenRole {
    public PotionMaster() {
        super(Role.POTION_MASTER, Attack.NONE, Defense.NONE);
    }
}