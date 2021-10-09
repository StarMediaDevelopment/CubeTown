package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Attack;
import com.firecraftmc.ct.enums.Defense;
import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.role.ApocalypseRole;
import com.firecraftmc.ct.object.role.RampagingRole;

public class Famine extends ApocalypseRole implements RampagingRole {
    public Famine() {
        super(Role.FAMINE, Attack.POWERFUL, Defense.INVINCIBLE);
        setPriority(5);
    }
}
