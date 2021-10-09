package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.role.TargetingRole;
import com.firecraftmc.ct.object.role.TownRole;
import com.firecraftmc.ct.object.target.Target;

import java.util.ArrayList;
import java.util.List;

public class Retributionist extends TownRole implements TargetingRole {
    
    private Target target;
    private List<Target> usedTargets = new ArrayList<>();
    
    public Retributionist() {
        super(Role.RETRIBUTIONIST);
        setPriority(1);
    }

    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }
}
