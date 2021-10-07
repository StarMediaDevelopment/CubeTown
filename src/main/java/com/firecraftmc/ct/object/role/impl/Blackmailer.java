package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.role.MafiaRole;

public class Blackmailer extends MafiaRole {
    public Blackmailer() {
        super(Role.BLACKMAILER);
        setPriority(3);
    }
}