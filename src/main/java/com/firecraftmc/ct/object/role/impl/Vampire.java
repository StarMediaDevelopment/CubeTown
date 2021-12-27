package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Immunity;
import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.role.MythicalRole;
import com.firecraftmc.ct.object.role.TargetingRole;
import com.firecraftmc.ct.object.target.Target;

import java.util.List;

public class Vampire extends MythicalRole implements TargetingRole {
    
    private Target target;
    private boolean youngest;
    
    public Vampire(Game game) {
        super(game, Role.VAMPIRE);
        setPriority(5);
        
        this.immunities.add(Immunity.DETECTION);
        this.abilities.add("Convert others to Vampires at night.");
        this.attributes.addAll(List.of("Vampires vote at night to bite a target.", "The youngest Vampire will visit the target at night."));
    }
    
    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }
}
