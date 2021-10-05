package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Attack;
import com.firecraftmc.ct.enums.Defense;
import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.role.MafiaRole;

public class Godfather extends MafiaRole {
    public Godfather() {
        super(Role.GODFATHER, Attack.BASIC, Defense.BASIC);
    }
}
