package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Alignment;
import com.firecraftmc.ct.enums.Goal;
import com.firecraftmc.ct.enums.Immunity;
import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.role.MythicalRole;
import com.firecraftmc.ct.object.role.TargetingRole;
import com.firecraftmc.ct.object.game.Target;

public class Vampire extends MythicalRole implements TargetingRole {
    
    private Target target;
    private boolean youngest;
    
    public Vampire(Game game) {
        super(game, Role.VAMPIRE, 5, Alignment.CHAOS, Goal.CONVERT, "7B8867");
        
        addImmunities(Immunity.DETECTION);
        addAbilities("Convert others to Vampires at night.");
        addAttributes("Vampires vote at night to bite a target.", "The youngest Vampire will visit the target at night.");
    }
    
    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }
}
