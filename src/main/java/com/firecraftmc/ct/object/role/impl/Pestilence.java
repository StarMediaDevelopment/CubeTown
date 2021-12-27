package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.role.Horseman;

public class Pestilence extends Horseman {
    public Pestilence(Game game) {
        super(game, Role.PESTILENCE, "010302");
    }
    
    public String getSummoningMessage() {
        return "A plague has consumed the town, summoning Pestilence, Horseman of the Apocalypse.";
    }
}
