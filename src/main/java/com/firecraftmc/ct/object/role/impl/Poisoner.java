package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Attack;
import com.firecraftmc.ct.enums.Defense;
import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.role.CovenRole;

public class Poisoner extends CovenRole {
    public Poisoner() {
        super(Role.POISONER, Attack.BASIC, Defense.NONE);
    }
}
