package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Immunity;
import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.role.TargetingRole;
import com.firecraftmc.ct.object.role.TownRole;
import com.firecraftmc.ct.object.target.Target;

import java.util.List;

public class Transporter extends TownRole implements TargetingRole {
    
    private Target target;
    
    public Transporter(Game game) {
        super(game, Role.TRANSPORTER);
        setPriority(1);
        
        this.immunities.addAll(List.of(Immunity.CONTROL, Immunity.ROLEBLOCK));
        
        this.abilities.add("Choose two people to transport at night.");
        this.attributes.addAll(List.of("Transporting two people swaps all targets against them.", 
                "You may transport yourself.", "Your targets will know they were transported."));
    }
    
    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }
}
