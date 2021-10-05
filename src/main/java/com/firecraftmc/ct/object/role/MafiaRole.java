package com.firecraftmc.ct.object.role;

import com.firecraftmc.ct.enums.Attack;
import com.firecraftmc.ct.enums.Defense;
import com.firecraftmc.ct.enums.Faction;
import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.target.Target;

public abstract class MafiaRole extends FactionRole implements TargetingRole {
    
    protected Target target;
    
    public MafiaRole(Role type) {
        this(type, Attack.NONE, Defense.NONE);
    }

    public MafiaRole(Role type, Attack attack, Defense defense) {
        super(type, Faction.ANARCHY, attack, defense, true);
    }

    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }
}
