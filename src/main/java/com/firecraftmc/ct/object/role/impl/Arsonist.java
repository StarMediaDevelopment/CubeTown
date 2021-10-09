package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Attack;
import com.firecraftmc.ct.enums.Defense;
import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.role.AnarchyRole;
import com.firecraftmc.ct.object.role.TargetingRole;
import com.firecraftmc.ct.object.target.Target;

public class Arsonist extends AnarchyRole implements TargetingRole {
    private Target target;
    
    //Douses are tracked in the player class

    public Arsonist() {
        super(Role.ARSONIST, Attack.UNSTOPPABLE, Defense.BASIC);
    }

    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }

    public int getPriority() {
        if (target.isSelf()) {
            return 5;
        } else {
            return 3;
        }
    }
}
