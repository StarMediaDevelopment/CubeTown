package com.firecraftmc.ct.object.role.impl.apocalypse.horseman;

import com.firecraftmc.ct.enums.RoleType;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.game.Player;

public class Death extends Horseman {
    public Death(Game game, Player player) {
        super(game, RoleType.DEATH, player);
        setSummoningMessage("An innocent life has been taken, summoning {rolename}.");
        setNormalKillMessage("{pronown}'s soul {verb} reaped by {rolename}.");
    }
}
