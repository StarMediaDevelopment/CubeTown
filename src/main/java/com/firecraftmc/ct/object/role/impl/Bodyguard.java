package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Attack;
import com.firecraftmc.ct.enums.Defense;
import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.role.TargetingRole;
import com.firecraftmc.ct.object.role.TownRole;
import com.firecraftmc.ct.object.target.Target;

public class Bodyguard extends TownRole implements TargetingRole {
    
    private Target target;
    private boolean vestUsed;
    
    public Bodyguard() {
        super(Role.BODYGUARD, Attack.POWERFUL, Defense.NONE);
    }
    
    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }

    public Defense getDefense() {
        if (target.isSelf() && !vestUsed) {
            return Defense.BASIC;
        }
        return super.getDefense();
    }
}
