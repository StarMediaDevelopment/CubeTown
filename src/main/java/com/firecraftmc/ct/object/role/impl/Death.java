package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.RoleType;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.role.Horseman;

public class Death extends Horseman {
    public Death(Game game) {
        super(game, RoleType.DEATH, "010302");
    }
    
    public String getSummoningMessage() {
        return "An innocent life has been taken, summoning {rolename}."; //TODO Include Horseman of the Apocalypse at the end when processing names
    }
    
    protected String getNormalKillMessage() {
        return "{pronown}'s soul was reaped by {rolename}.";
    }
}
