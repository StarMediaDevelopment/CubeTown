package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Alignment;
import com.firecraftmc.ct.enums.RoleType;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.game.Player;
import com.firecraftmc.ct.object.role.TownRole;

public class Spy extends TownRole {
    
    public Spy(Game game, Player player) {
        super(game, RoleType.SPY, player, 6, Alignment.INVESTIGATIVE);
        
        addAbilities("You may bug a player's house to see what happens to them that night.");
        addAttributes("You will know who the Mafia and Coven visit each night.");
    }
}
