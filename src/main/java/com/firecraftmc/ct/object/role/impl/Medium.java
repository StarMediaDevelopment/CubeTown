package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.role.TownRole;

import java.util.List;

public class Medium extends TownRole {
    public Medium(Game game) {
        super(game, Role.MEDIUM);
        this.abilities.add("You can speak to the dead at night.");
        this.attributes.addAll(List.of("When speaking to the dead, you will remain anonymous.", "You may only speak to a living person once"));
    }
}
