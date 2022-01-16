package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Alignment;
import com.firecraftmc.ct.enums.RoleType;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.role.TargetingRole;
import com.firecraftmc.ct.object.role.TownRole;
import com.firecraftmc.ct.object.game.Target;

public class Sheriff extends TownRole implements TargetingRole {
    
    private Target target;
    
    public Sheriff(Game game) {
        super(game, RoleType.SHERIFF, 4, Alignment.INVESTIGATIVE);
        
        addAbilities("Interrogate one person each night for suspicious activity.");
        addAttributes("You will know if your target is suspicious.");
    }
    
    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }
}
