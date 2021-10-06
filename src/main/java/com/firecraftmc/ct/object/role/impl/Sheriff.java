package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.role.TargetingRole;
import com.firecraftmc.ct.object.role.TownRole;
import com.firecraftmc.ct.object.target.Target;

public class Sheriff extends TownRole implements TargetingRole {
    
    private Target target;
    
    public Sheriff() {
        super(Role.SHERIFF);
    }
    
    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }
}
