package com.firecraftmc.ct.object.role.impl.apocalypse.horseman;

import com.firecraftmc.ct.enums.RoleType;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.game.Player;
import com.firecraftmc.ct.object.role.Horseman;

public class Pestilence extends Horseman {
    public Pestilence(Game game, Player player) {
        super(game, RoleType.PESTILENCE, player);
        setSummoningMessage("A plague has consumed the town, summoning {rolename}.");
        setNormalKillMessage("{pronown}'s body was ravaged by {rolename}.");
    }
}
