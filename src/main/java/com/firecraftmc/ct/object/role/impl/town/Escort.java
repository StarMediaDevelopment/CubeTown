package com.firecraftmc.ct.object.role.impl.town;

import com.firecraftmc.ct.enums.Alignment;
import com.firecraftmc.ct.enums.RoleType;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.game.Player;

public class Escort extends TownRole {
    
    public Escort(Game game, Player player) {
        super(game, RoleType.ESCORT, player, 2, Alignment.SUPPORT);
        addAbilities("Distract someone each night.");
        addAttributes("Distraction blocks your target from using their role's night ability.", "You cannot be role blocked.");
    }
}
