package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.role.TownRole;

import java.util.List;

public class Psychic extends TownRole {
    public Psychic(Game game) {
        super(game, Role.PSYCHIC);
        setPriority(4);
        
        this.abilities.add("Receive a vision every night.");
        this.attributes.addAll(List.of("On odd nights you will have a vision of three players, at least one will be Evil.", 
                "On even nights you will have a vision of two players, at least one will be Good."));
    }
}
