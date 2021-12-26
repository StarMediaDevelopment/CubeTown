package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.role.TargetingRole;
import com.firecraftmc.ct.object.role.TownRole;
import com.firecraftmc.ct.object.target.Target;

public class Sheriff extends TownRole implements TargetingRole {
    
    private Target target;
    
    public Sheriff(Game game) {
        super(game, Role.SHERIFF);
        setPriority(4);
        
        this.abilities.add("Interrogate one person each night for suspicious activity.");
        this.attributes.add("You will know if your target is suspicious.");
    }
    
    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }
}
