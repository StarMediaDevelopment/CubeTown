package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Alignment;
import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.role.TownRole;

import java.util.List;

public class Psychic extends TownRole {
    public Psychic(Game game) {
        super(game, Role.PSYCHIC, 4, Alignment.INVESTIGATIVE);
        
        addAbilities("Receive a vision every night.");
        addAttributes("On odd nights you will have a vision of three players, at least one will be Evil.", 
                "On even nights you will have a vision of two players, at least one will be Good.");
    }
}
