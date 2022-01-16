package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.role.AcolyteRole;

public class Plaguebearer extends AcolyteRole {
    
    //Infections are tracked in the GamePlayer or whatever the name of the Player class is
    //Infections take place on priority 1, Transforming into Pestilence is Priority 2
    //Cfff63
    
    public Plaguebearer(Game game) {
        super(game, Role.PLAGUEBEARER, Role.PESTILENCE, "B7E255"); 
        addAbilities("You may choose to infect a player with the Plague each night");
        addAttributes("Players will not know they are infected", "Infect all players to become Pestilence");
    }
}
