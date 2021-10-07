package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Attack;
import com.firecraftmc.ct.enums.Defense;
import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.role.MafiaRole;

public class Ambusher extends MafiaRole {
    public Ambusher() {
        super(Role.AMBUSHER, Attack.BASIC, Defense.NONE);
        setPriority(1);
    }
}
