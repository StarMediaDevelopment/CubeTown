package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.*;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.role.KillingRole;
import com.firecraftmc.ct.object.role.MafiaRole;

import java.util.List;

public class Mafioso extends MafiaRole implements KillingRole {
    public Mafioso(Game game) {
        super(game, Role.MAFIOSO, Attack.BASIC, Defense.NONE, 5, Alignment.DECEPTION);
        
        if (game.hasGodfather()) {
            addImmunities(Immunity.CONTROL);
        }
        
        addAbilities("Carry out the Godfather's orders.");
        addAttributes("You can attack if the Godfather doesn't give you orders.", "If the Godfather dies, you will become the next Godfather.", "You can talk with the other Mafia at night.");
    }
    
    public String getKillMessage() {
        return "{pronown} was killed by a member of the Mafia";
    }
}
