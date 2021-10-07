package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.role.MafiaRole;

public class Forger extends MafiaRole {
    public Forger() {
        super(Role.FORGER);
        setPriority(3);
    }
}
