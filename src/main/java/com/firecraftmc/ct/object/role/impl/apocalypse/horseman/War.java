package com.firecraftmc.ct.object.role.impl.apocalypse.horseman;

import com.firecraftmc.ct.enums.RoleType;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.game.Player;
import com.firecraftmc.ct.object.role.Horseman;

public class War extends Horseman {
    public War(Game game, Player player) {
        super(game, RoleType.WAR, player);
        setSummoningMessage("Feud has broken out among the town, summoning {rolename}");
        setNormalKillMessage("{pronown}'s mind was corrupted with feud by {rolename}");
    }
}
