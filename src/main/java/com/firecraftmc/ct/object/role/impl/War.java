package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Attack;
import com.firecraftmc.ct.enums.Defense;
import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.role.ApocalypseRole;
import com.firecraftmc.ct.object.role.RampagingRole;

public class War extends ApocalypseRole {
    public War() {
        super(Role.WAR, Attack.POWERFUL, Defense.INVINCIBLE);
        setPriority(5);
    }
}
