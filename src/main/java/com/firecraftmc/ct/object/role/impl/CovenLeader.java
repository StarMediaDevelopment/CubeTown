package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.role.CovenRole;

public class CovenLeader extends CovenRole {
    public CovenLeader() {
        super(Role.COVEN_LEADER);
        setPriority(2);
    }
}
