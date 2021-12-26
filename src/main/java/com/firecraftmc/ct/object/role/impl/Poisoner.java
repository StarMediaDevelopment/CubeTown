package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Attack;
import com.firecraftmc.ct.enums.Defense;
import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.role.CovenRole;

import java.util.List;

public class Poisoner extends CovenRole {
    public Poisoner(Game game) {
        super(game, Role.POISONER, Attack.BASIC, Defense.NONE);
        setPriority(5);
        
        this.abilities.add("You may choose to poison a player each night.");
        this.attributes.addAll(List.of("Your poisons take one day to take effect.", 
                "Poison can be removed by Heals."));
    }
    
    public String getKillMessage() {
        return "{pronown} was poisoned by the poisoner.";
    }
}
