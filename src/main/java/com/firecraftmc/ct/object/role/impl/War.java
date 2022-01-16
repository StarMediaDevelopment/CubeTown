package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.RoleType;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.role.Horseman;

public class War extends Horseman {
    public War(Game game) {
        super(game, RoleType.WAR, "010302");
    }
    
    public String getSummoningMessage() {
        return "Feud has broken out among the town, summoning War, Horseman of the Apocalypse.";
    }
    
    protected String getNormalKillMessage() {
        return "{pronown}'s mind was corrupted by feud by War, Horseman of the Apocalypse";
    }
}
