package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.role.TargetingRole;
import com.firecraftmc.ct.object.role.TownRole;
import com.firecraftmc.ct.object.target.Target;

public class Veteran extends TownRole implements TargetingRole {
    
    private Target target;
    private int alerts = 3;
    
    public Veteran() {
        super(Role.VETERAN);
    }
    
    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        if (target.isSelf()) {
            this.target = target;
        } else {
            this.target = null;
        }
    }
}
