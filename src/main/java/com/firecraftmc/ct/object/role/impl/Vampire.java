package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.role.MythicalRole;
import com.firecraftmc.ct.object.role.TargetingRole;
import com.firecraftmc.ct.object.target.Target;

public class Vampire extends MythicalRole implements TargetingRole {
    
    private Target target;
    private boolean youngest;
    
    public Vampire() {
        super(Role.VAMPIRE);
    }
    
    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }
}
