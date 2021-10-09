package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.role.CovenRole;

public class Necromancer extends CovenRole {
    
    public Necromancer() {
        super(Role.NECROMANCER);
        setPriority(1);
    }
}
