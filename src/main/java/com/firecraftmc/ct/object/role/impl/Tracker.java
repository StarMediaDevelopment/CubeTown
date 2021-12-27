package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.role.TargetingRole;
import com.firecraftmc.ct.object.role.TownRole;
import com.firecraftmc.ct.object.target.Target;

public class Tracker extends TownRole implements TargetingRole {
    
    private Target target;
    
    public Tracker(Game game) {
        super(game, Role.TRACKER);
        setPriority(3);
        
        this.abilities.add("Track one person at night to see who they visit.");
    }
    
    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }
}
