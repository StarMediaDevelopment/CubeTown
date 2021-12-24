package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.role.TargetingRole;
import com.firecraftmc.ct.object.role.TownRole;
import com.firecraftmc.ct.object.target.Target;

public class Investigator extends TownRole implements TargetingRole {
    
    private Target target;
    
    public Investigator() {
        super(Role.INVESTIGATOR);
        setPriority(4);
        
        this.abilities.add("Investigate one person each night for a clue to their role.");
        this.attributes.add("None.");
    }
    
    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }
}
