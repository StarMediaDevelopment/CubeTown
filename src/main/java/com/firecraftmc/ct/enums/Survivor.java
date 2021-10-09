package com.firecraftmc.ct.enums;

import com.firecraftmc.ct.object.role.NeutralRole;
import com.firecraftmc.ct.object.role.TargetingRole;
import com.firecraftmc.ct.object.target.Target;

public class Survivor extends NeutralRole implements TargetingRole {
    
    private Target target;
    private int vests = 4;
    
    public Survivor() {
        super(Role.SURVIVOR);
        setPriority(3);
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

    public Defense getDefense() {
        if (vests > 0) {
            return Defense.BASIC;
        }
        return Defense.NONE;
    }
}
