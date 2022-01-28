package com.firecraftmc.ct.object.role.impl.town;

import com.firecraftmc.ct.enums.Alignment;
import com.firecraftmc.ct.enums.Immunity;
import com.firecraftmc.ct.enums.RoleType;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.game.Player;
import com.firecraftmc.ct.object.role.TownRole;

public class Retributionist extends TownRole {
    
    //Retributionists can use dead town members as much as they want
    
    public Retributionist(Game game, Player player) {
        super(game, RoleType.RETRIBUTIONIST, player, 1, Alignment.SUPPORT);
        addImmunities(Immunity.ROLEBLOCK, Immunity.CONTROL);
        addAbilities("You may raise a dead Town member and use their ability on a player.");
        addAttributes("Create zombies from dead true-hearted Town players.",
                "Use their abilities on your second target.");
    }
}
