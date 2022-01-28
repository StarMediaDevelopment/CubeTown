package com.firecraftmc.ct.object.role.impl.town;

import com.firecraftmc.ct.enums.Alignment;
import com.firecraftmc.ct.enums.RoleType;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.game.Player;

public class Tracker extends TownRole {
    
    public Tracker(Game game, Player player) {
        super(game, RoleType.TRACKER, player, 3, Alignment.INVESTIGATIVE);
        
        addAbilities("Track one person at night to see who they visit.");
    }
}
