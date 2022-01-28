package com.firecraftmc.ct.object.role.impl.apocalypse.horseman;

import com.firecraftmc.ct.enums.RoleType;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.game.Player;
import com.firecraftmc.ct.object.role.Horseman;

public class Famine extends Horseman {
    public Famine(Game game, Player player) {
        super(game, RoleType.FAMINE, player);
        setSummoningMessage("The town has been starved, summoning {rolename}.");
        setNormalKillMessage("{pronown} {verb} starved to death by {rolename}.");
    }
}
