package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.role.NeutralRole;

public class Jester extends NeutralRole {
    public Jester() {
        super(Role.JESTER);
        setPriority(1);
    }
}
