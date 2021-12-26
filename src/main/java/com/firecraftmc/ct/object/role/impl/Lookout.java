package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.role.TargetingRole;
import com.firecraftmc.ct.object.role.TownRole;
import com.firecraftmc.ct.object.target.Target;

public class Lookout extends TownRole implements TargetingRole {
    
    private Target target;
    
    public Lookout(Game game) {
        super(game, Role.LOOKOUT);
        setPriority(4);
        this.abilities.add("Watch one person at night to see who visits them.");
    }
    
    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }
}
