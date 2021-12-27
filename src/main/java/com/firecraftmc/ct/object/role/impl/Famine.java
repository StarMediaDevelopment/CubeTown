package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.role.Horseman;

import java.util.Arrays;

public class Famine extends Horseman {
    public Famine(Game game) {
        super(game, Role.FAMINE, "010302");
    }
    
    public String getSummoningMessage() {
        return "The town has been starved, summoning Famine, Horseman of the Apocalypse.";
    }
}
