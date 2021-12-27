package com.firecraftmc.ct.object.role;

import com.firecraftmc.ct.enums.*;
import com.firecraftmc.ct.object.game.Game;

public class AcolyteRole extends ApocalypseRole {
    
    protected Role horsemanTransformation;
    
    public AcolyteRole(Game game, Role type, Role horsemanTransformation, String color) {
        super(game, type, Attack.NONE, Defense.BASIC, 1, Alignment.SUPPORT, color);
        this.horsemanTransformation = horsemanTransformation;
        
        if (game.getApocalypseFactionCount() == 1) {
            addImmunities(Immunity.DETECTION);
        }
    }
}
