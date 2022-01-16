package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.role.Horseman;

public class Death extends Horseman {
    public Death(Game game) {
        super(game, Role.DEATH, "010302");
    }
    
    public String getSummoningMessage() {
        return "An innocent life has been taken, summoning Death, Horseman of the Apocalypse.";
    }
    
    protected String getNormalKillMessage() {
        return "{pronown}'s soul was reaped by Death, Horseman of the Apocalypse";
    }
}
