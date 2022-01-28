package com.firecraftmc.ct.object.role.impl.town;

import com.firecraftmc.ct.enums.Alignment;
import com.firecraftmc.ct.enums.RoleType;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.game.Player;
import com.firecraftmc.ct.object.role.TownRole;

public class Sheriff extends TownRole {
    
    public Sheriff(Game game, Player player) {
        super(game, RoleType.SHERIFF, player, 4, Alignment.INVESTIGATIVE);
        
        addAbilities("Interrogate one person each night for suspicious activity.");
        addAttributes("You will know if your target is suspicious.");
    }
}
