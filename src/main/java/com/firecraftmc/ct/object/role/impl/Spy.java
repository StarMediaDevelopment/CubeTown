package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.role.TargetingRole;
import com.firecraftmc.ct.object.role.TownRole;
import com.firecraftmc.ct.object.target.Target;

import java.util.List;

public class Spy extends TownRole implements TargetingRole {
    
    private Target target;
    
    public Spy(Game game) {
        super(game, Role.SPY);
        setPriority(6);
        
        this.abilities.add("You may bug a player's house to see what happens to them that night.");
        this.attributes.add("You will know who the Mafia and Coven visit each night.");
    }
    
    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }
}
