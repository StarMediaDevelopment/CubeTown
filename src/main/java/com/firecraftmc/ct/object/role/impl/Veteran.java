package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Immunity;
import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.role.TargetingRole;
import com.firecraftmc.ct.object.role.TownRole;
import com.firecraftmc.ct.object.target.Target;

import java.util.List;

public class Veteran extends TownRole implements TargetingRole {
    
    private Target target;
    private int alerts = 3;
    
    public Veteran(Game game) {
        super(game, Role.VETERAN);
        setPriority(1);
        
        this.immunities.addAll(List.of(Immunity.CONTROL, Immunity.ROLEBLOCK));
        
        this.abilities.add("Decide if you will go on alert.");
        this.attributes.addAll(List.of("While on alert you gain Basic Defense.", "While on alert, you will deliver a Powerful attack to anyone who visits you.", 
                "You can only go on alert 3 times.", "You cannot be role blocked."));
    }
    
    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        if (target.isSelf()) {
            this.target = target;
        } else {
            this.target = null;
        }
    }
}
