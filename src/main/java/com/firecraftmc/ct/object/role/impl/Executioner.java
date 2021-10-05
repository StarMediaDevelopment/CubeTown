package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Attack;
import com.firecraftmc.ct.enums.Defense;
import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.role.NeutralRole;

public class Executioner extends NeutralRole {
    public Executioner() {
        super(Role.EXECUTIONER, Attack.NONE, Defense.BASIC);
    }
}
