package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.role.MafiaRole;

public class Consort extends MafiaRole {
    public Consort() {
        super(Role.CONSORT);
        setPriority(2);
    }
}
