package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.*;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.role.TargetingRole;
import com.firecraftmc.ct.object.role.TownRole;
import com.firecraftmc.ct.object.game.Target;

public class Veteran extends TownRole implements TargetingRole {
    
    private Target target;
    private int alerts = 3;
    
    public Veteran(Game game) {
        super(game, RoleType.VETERAN, Attack.POWERFUL, Defense.NONE, 1, Alignment.KILLING);
        
        addImmunities(Immunity.CONTROL, Immunity.ROLEBLOCK);
        
        addAbilities("Decide if you will go on alert.");
        addAttributes("While on alert you gain Basic Defense.", "While on alert, you will deliver a Powerful attack to anyone who visits you.", 
                "You can only go on alert 3 times.", "You cannot be role blocked.");
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
