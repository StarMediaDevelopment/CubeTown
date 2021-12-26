package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Attack;
import com.firecraftmc.ct.enums.Defense;
import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.role.ApocalypseRole;

import java.util.List;

public class Plaguebearer extends ApocalypseRole {
    
    //Infections are tracked in the GamePlayer or whatever the name of the Player class is
    //Infections take place on priority 1, Transforming into Pestilence is Priority 2
    
    public Plaguebearer(Game game) {
        super(game, Role.PLAGUEBEARER, Attack.NONE, Defense.BASIC); 
        setPriority(1);
        //Detection immunity with 2 or more members
        this.abilities.add("You may choose to infect a player with the Plague each night");
        this.attributes.addAll(List.of("Players will not know they are infected", "Infect all players to become Pestilence"));
    }
    
}
