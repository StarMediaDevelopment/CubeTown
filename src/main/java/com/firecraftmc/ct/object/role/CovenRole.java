package com.firecraftmc.ct.object.role;

import com.firecraftmc.ct.enums.*;
import com.firecraftmc.ct.object.target.Target;

public abstract class CovenRole extends FactionRole implements KillingRole {
    
    protected boolean hasNecronomicon;
    protected Target target;
    
    public CovenRole(Role type) {
        this(type, Attack.NONE, Defense.NONE);
    }

    public CovenRole(Role type, Attack attack, Defense defense) {
        super(type, Faction.COVEN, attack, defense, true);
    }

    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }
    
    public void setHasNecronomicon(boolean value) {
        this.hasNecronomicon = value;
        
        if (hasNecronomicon) {
            this.immunities.add(Immunity.DETECTION);
        }
    }
}
