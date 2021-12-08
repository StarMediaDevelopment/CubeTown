package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.role.TargetingRole;
import com.firecraftmc.ct.object.role.TownRole;
import com.firecraftmc.ct.object.target.Target;

import java.util.Arrays;

public class Escort extends TownRole implements TargetingRole {
    
    private Target target;
    
    public Escort() {
        super(Role.ESCORT);
        setPriority(2);
        this.abilities.add("Distract someone each night.");
        this.attributes.addAll(Arrays.asList("Distraction blocks your target from using their role's night ability.", "You cannot be role blocked."));
    }
    
    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }
}
