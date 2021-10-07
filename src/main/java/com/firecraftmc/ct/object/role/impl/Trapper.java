package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.role.TargetingRole;
import com.firecraftmc.ct.object.role.TownRole;
import com.firecraftmc.ct.object.target.Target;

public class Trapper extends TownRole implements TargetingRole {
    
    private Target target;
    
    public Trapper() {
        super(Role.TRAPPER);
    }
    
    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }
}
