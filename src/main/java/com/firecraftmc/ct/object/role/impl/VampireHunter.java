package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Immunity;
import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.role.TargetingRole;
import com.firecraftmc.ct.object.role.TownRole;
import com.firecraftmc.ct.object.target.Target;

import java.util.List;

public class VampireHunter extends TownRole implements TargetingRole {
    
    private Target target;
    
    public VampireHunter(Game game) {
        super(game, Role.VAMPIRE_HUNTER);
        setPriority(5);
        
        this.immunities.add(Immunity.BITE);
        
        this.abilities.add("Check for Vampires each night.");
        this.attributes.addAll(List.of("If you visit a Vampire you will attack them", "If a Vampire visits you, you will attack them.", 
                "You can hear Vampires at night", "If all Vampires die, you will become a Vigilante with one bullet."));
    }
    
    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }
}
