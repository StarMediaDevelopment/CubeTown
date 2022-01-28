package com.firecraftmc.ct.object.role.impl.town;

import com.firecraftmc.ct.enums.Alignment;
import com.firecraftmc.ct.enums.RoleType;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.game.Player;

public class Lookout extends TownRole {
    
    public Lookout(Game game, Player player) {
        super(game, RoleType.LOOKOUT, player, 4, Alignment.INVESTIGATIVE);
        addAbilities("Watch one person at night to see who visits them.");
    }
}
