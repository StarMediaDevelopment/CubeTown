package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Attack;
import com.firecraftmc.ct.enums.Defense;
import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.role.TargetingRole;
import com.firecraftmc.ct.object.role.TownRole;
import com.firecraftmc.ct.object.target.Target;

import java.util.List;

public class Vigilante extends TownRole implements TargetingRole {
    
    private Target target;
    
    public Vigilante(Game game) {
        super(game, Role.VIGILANTE, Attack.BASIC, Defense.NONE);
        setPriority(5);
        
        this.abilities.add("Choose to take justice into your own hands and shoot someone");
        this.attributes.addAll(List.of("If you shoot another Town member you will commit suicide over the guilt.", "You can only shoot your gun 3 times."));
    }
    
    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }
}
