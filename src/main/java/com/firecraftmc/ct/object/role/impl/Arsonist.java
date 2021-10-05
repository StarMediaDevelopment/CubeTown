package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Attack;
import com.firecraftmc.ct.enums.Defense;
import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.role.AnarchyRole;
import com.firecraftmc.ct.object.role.TargetingRole;
import com.firecraftmc.ct.object.target.Target;

import java.util.ArrayList;
import java.util.List;

public class Arsonist extends AnarchyRole implements TargetingRole {
    private Target target;
    private List<Target> dousedTargets = new ArrayList<>();

    public Arsonist() {
        super(Role.ARSONIST, Attack.UNSTOPPABLE, Defense.BASIC);
    }

    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }
}
