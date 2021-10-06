package com.firecraftmc.ct.object.role;

import com.firecraftmc.ct.enums.Attack;
import com.firecraftmc.ct.enums.Defense;
import com.firecraftmc.ct.enums.Faction;
import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.target.Target;

import java.util.ArrayList;
import java.util.List;

public abstract class ApocalypseRole extends FactionRole implements TargetingRole {
    
    protected Target target;
    protected static List<Target> infected = new ArrayList<>();
    
    public ApocalypseRole(Role type) {
        this(type, Attack.NONE, Defense.NONE);
    }

    public ApocalypseRole(Role type, Attack attack, Defense defense) {
        super(type, Faction.APOCALYPSE, attack, defense, true);
    }

    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }
}