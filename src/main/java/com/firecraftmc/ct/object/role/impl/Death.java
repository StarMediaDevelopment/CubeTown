package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Attack;
import com.firecraftmc.ct.enums.Defense;
import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.role.ApocalypseRole;
import com.firecraftmc.ct.object.role.RampagingRole;

public class Death extends ApocalypseRole implements RampagingRole {
    public Death() {
        super(Role.DEATH, Attack.POWERFUL, Defense.INVINCIBLE);
        setPriority(5);
    }
}
