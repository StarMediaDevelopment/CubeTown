package com.firecraftmc.ct.object.role.impl.town;

import com.firecraftmc.ct.enums.Alignment;
import com.firecraftmc.ct.enums.RoleType;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.game.Player;

public class Investigator extends TownRole {
    
    public Investigator(Game game, Player player) {
        super(game, RoleType.INVESTIGATOR, player, 4, Alignment.INVESTIGATIVE);
        
        addAbilities("Investigate one person each night for a clue to their role.");
    }
}