package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.RoleType;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.role.Horseman;

public class Famine extends Horseman {
    public Famine(Game game) {
        super(game, RoleType.FAMINE, "010302");
    }
    
    public String getSummoningMessage() {
        return "The town has been starved, summoning {rolename}.";
    }
    
    protected String getNormalKillMessage() {
        return "{pronown} {verb} starved to death by {rolename}.";
    }
}
