package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.RoleType;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.role.Horseman;

public class Pestilence extends Horseman {
    public Pestilence(Game game) {
        super(game, RoleType.PESTILENCE, "010302");
    }
    
    public String getSummoningMessage() {
        return "A plague has consumed the town, summoning Pestilence, Horseman of the Apocalypse.";
    }
    
    protected String getNormalKillMessage() {
        return "{pronown}'s body was ravaged by Pestilence, Horseman of the Apocalypse";
    }
}
