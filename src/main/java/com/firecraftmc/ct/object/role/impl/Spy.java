package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Alignment;
import com.firecraftmc.ct.enums.RoleType;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.role.TargetingRole;
import com.firecraftmc.ct.object.role.TownRole;
import com.firecraftmc.ct.object.game.Target;

public class Spy extends TownRole implements TargetingRole {
    
    private Target target;
    
    public Spy(Game game) {
        super(game, RoleType.SPY, 6, Alignment.INVESTIGATIVE);
        
        addAbilities("You may bug a player's house to see what happens to them that night.");
        addAttributes("You will know who the Mafia and Coven visit each night.");
    }
    
    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }
}
