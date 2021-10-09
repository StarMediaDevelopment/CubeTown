package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Attack;
import com.firecraftmc.ct.enums.Defense;
import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.role.CovenRole;

public class Medusa extends CovenRole {
    
    private int stoneGazes = 3;
    
    public Medusa() {
        super(Role.MEDUSA, Attack.POWERFUL, Defense.NONE);
    }

    public int getPriority() {
        if (target.isSelf()) {
            return 3;
        }
        return 5;
    }
}
