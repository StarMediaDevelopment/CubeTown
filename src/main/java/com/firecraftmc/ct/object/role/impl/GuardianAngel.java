package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.role.NeutralRole;
import com.firecraftmc.ct.object.role.TargetingRole;
import com.firecraftmc.ct.object.target.Target;

public class GuardianAngel extends NeutralRole implements TargetingRole {
    
    private Target target;
    
    public GuardianAngel() {
        super(Role.GUARDIAN_ANGEL);
    }
    
    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }
}
