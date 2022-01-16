package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Alignment;
import com.firecraftmc.ct.enums.Immunity;
import com.firecraftmc.ct.enums.RoleType;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.role.TargetingRole;
import com.firecraftmc.ct.object.role.TownRole;
import com.firecraftmc.ct.object.game.Target;

public class Transporter extends TownRole implements TargetingRole {
    
    private Target target;
    
    public Transporter(Game game) {
        super(game, RoleType.TRANSPORTER, 1, Alignment.SUPPORT);
        
        addImmunities(Immunity.CONTROL, Immunity.ROLEBLOCK);
        
        addAbilities("Choose two people to transport at night.");
        addAttributes("Transporting two people swaps all targets against them.", 
                "You may transport yourself.", "Your targets will know they were transported.");
    }
    
    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }
}
