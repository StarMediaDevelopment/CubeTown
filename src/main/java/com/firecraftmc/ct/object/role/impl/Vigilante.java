package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Alignment;
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
        super(game, Role.VIGILANTE, Attack.BASIC, Defense.BASIC, 5, Alignment.KILLING);
        
        addAbilities("Choose to take justice into your own hands and shoot someone");
        addAttributes("If you shoot another Town member you will commit suicide over the guilt.", "You can only shoot your gun 3 times.");
    }
    
    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }
}
