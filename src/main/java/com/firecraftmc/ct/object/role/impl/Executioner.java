package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Attack;
import com.firecraftmc.ct.enums.Defense;
import com.firecraftmc.ct.enums.Immunity;
import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.role.NeutralRole;
import com.firecraftmc.ct.object.target.Target;

import java.util.Arrays;

public class Executioner extends NeutralRole {
    
    public Target target;
    
    public Executioner(Game game, Target target) {
        super(game, Role.EXECUTIONER, Attack.NONE, Defense.BASIC);
        this.target = target;
        
        this.immunities.add(Immunity.DETECTION);
        this.abilities.add("Trick the Town into lynching your target.");
        this.attributes.addAll(Arrays.asList("Your target is " + target.getName(), "If you target is killed at night you will become a Jester"));
    }
    
    public Target getTarget() {
        return target;
    }
}
