package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.role.AcolyteRole;

public class Hunger extends AcolyteRole {
    
    public Hunger(Game game) {
        super(game, Role.HUNGER, Role.FAMINE, "BFBF80"); 
        
        addAbilities("Choose someone at night to starve.");
        addAttributes("Starving will stop the target from using their night abiltiy.", "Starve 4 players to become Famine.");
    }
}