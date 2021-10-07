package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Attack;
import com.firecraftmc.ct.enums.Defense;
import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.role.TargetingRole;
import com.firecraftmc.ct.object.role.TownRole;
import com.firecraftmc.ct.object.target.Target;

public class Jailor extends TownRole implements TargetingRole {
    
    private Target target;
    private int executions = 3;
    
    public Jailor() {
        super(Role.JAILOR, Attack.UNSTOPPABLE, Defense.NONE);
        setPriority(5); //Jailing is a day ability that happens before anything else, not covered by this priority system
    }
    
    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }
}
