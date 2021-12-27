package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.*;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.role.KillingRole;
import com.firecraftmc.ct.object.role.MafiaRole;

public class Godfather extends MafiaRole implements KillingRole {
    public Godfather(Game game) {
        super(game, Role.GODFATHER, Attack.BASIC, Defense.BASIC, 5, Alignment.KILLING);
        
        addImmunities(Immunity.DETECTION);
        addAbilities("You may choose to attack a player each night.");
        addAttributes("If there is a Mafioso he will attack the target instead of you.", 
                "You will appear to be innocent to the Sheriff.", 
                "You can talk with the other Mafia at night.");
    }
    
    public String getKillMessage() {
        return "{pronown} was killed by a member of the Mafia.";
    }
}
