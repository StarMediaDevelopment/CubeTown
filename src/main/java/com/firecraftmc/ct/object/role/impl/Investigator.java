package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Alignment;
import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.role.TargetingRole;
import com.firecraftmc.ct.object.role.TownRole;
import com.firecraftmc.ct.object.target.Target;

public class Investigator extends TownRole implements TargetingRole {
    
    private Target target;
    
    public Investigator(Game game) {
        super(game, Role.INVESTIGATOR, 4, Alignment.INVESTIGATIVE);
        
        addAbilities("Investigate one person each night for a clue to their role.");
    }
    
    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }
}
