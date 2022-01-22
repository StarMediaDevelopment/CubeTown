package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.RoleType;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.game.Player;
import com.firecraftmc.ct.object.role.AcolyteRole;

public class Plaguebearer extends AcolyteRole {
    
    //Infections take place on priority 1, Transforming into Pestilence is Priority 2
    //Cfff63
    
    public Plaguebearer(Game game, Player player) {
        super(game, RoleType.PLAGUEBEARER, player, RoleType.PESTILENCE, "B7E255");
        addAbilities("You may choose to infect a player with the Plague each night");
        addAttributes("Players will not know they are infected", "Infect all players to become Pestilence");
    }
    
    @Override
    public void otherVisit(Game game, Player player) {
        player.setInfected(true);
    }
}
