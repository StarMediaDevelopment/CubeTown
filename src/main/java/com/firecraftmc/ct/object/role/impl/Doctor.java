package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Defense;
import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.role.ProtectiveRole;
import com.firecraftmc.ct.object.role.TargetingRole;
import com.firecraftmc.ct.object.role.TownRole;
import com.firecraftmc.ct.object.target.Target;

import java.util.Arrays;

public class Doctor extends TownRole implements ProtectiveRole {
    
    private Target target;
    
    public Doctor() {
        super(Role.DOCTOR);
        setPriority(3);
        
        this.abilities.add("Heal one person each night, granting them Powerful defense");
        this.attributes.addAll(Arrays.asList("You may only Heal yourself once.", "You will know if your target is attacked."));
    }
    
    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }
    
    public String getKillMessage() {
        return null;
    }
    
    public Defense getTemporaryDefense() {
        return Defense.POWERFUL;
    }
}
