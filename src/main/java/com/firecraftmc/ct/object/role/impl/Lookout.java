package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Alignment;
import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.role.TargetingRole;
import com.firecraftmc.ct.object.role.TownRole;
import com.firecraftmc.ct.object.game.Target;

public class Lookout extends TownRole implements TargetingRole {
    
    private Target target;
    
    public Lookout(Game game) {
        super(game, Role.LOOKOUT, 4, Alignment.INVESTIGATIVE);
        addAbilities("Watch one person at night to see who visits them.");
    }
    
    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }
}
