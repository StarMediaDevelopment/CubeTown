package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.role.Horseman;

public class War extends Horseman {
    public War(Game game) {
        super(game, Role.WAR, "010302");
    }
    
    public String getSummoningMessage() {
        return "Feud has broken out among the town, summoning War, Horseman of the Apocalypse.";
    }
}
