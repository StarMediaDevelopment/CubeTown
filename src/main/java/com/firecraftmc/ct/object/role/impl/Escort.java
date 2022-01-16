package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Alignment;
import com.firecraftmc.ct.enums.RoleType;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.role.TargetingRole;
import com.firecraftmc.ct.object.role.TownRole;
import com.firecraftmc.ct.object.game.Target;

public class Escort extends TownRole implements TargetingRole {
    
    private Target target;
    
    public Escort(Game game) {
        super(game, RoleType.ESCORT, 2, Alignment.SUPPORT);
        addAbilities("Distract someone each night.");
        addAttributes("Distraction blocks your target from using their role's night ability.", "You cannot be role blocked.");
    }
    
    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }
}
