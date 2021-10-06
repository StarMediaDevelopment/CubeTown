package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.GameState;
import com.firecraftmc.ct.object.NightPhase;
import com.firecraftmc.ct.object.role.TargetingRole;
import com.firecraftmc.ct.object.role.TownRole;
import com.firecraftmc.ct.object.target.Target;

public class Mayor extends TownRole implements TargetingRole {
    
    private Target target;
    
    public Mayor() {
        super(Role.MAYOR);
    }

    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        if (target.isSelf()) {
            this.target = target;
        } else {
            this.target = null;
        }
    }

    public boolean canTarget(GameState state, NightPhase nightPhase) {
        return state == GameState.DAY;
    }
}
