package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.role.MafiaRole;

public class Janitor extends MafiaRole {
    public Janitor() {
        super(Role.JANITOR);
        setPriority(3);
    }
}
