package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Attack;
import com.firecraftmc.ct.enums.Defense;
import com.firecraftmc.ct.enums.Immunity;
import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.role.ApocalypseRole;

import java.util.List;

public class General extends ApocalypseRole {
    
    public General(Game game) {
        super(game, Role.GENERAL, Attack.NONE, Defense.BASIC); 
        setPriority(1);
        
        this.immunities.add(Immunity.DETECTION);
        this.abilities.add("Choose 2 people each n ight to mark as a foe.");
        this.attributes.addAll(List.of("The 2 people will not be notified that they have been marked as a foe.", 
                "Being marked as a foe will last for 2 nights.", 
                "When 3 marked foes die, you will become War."));
    }
}