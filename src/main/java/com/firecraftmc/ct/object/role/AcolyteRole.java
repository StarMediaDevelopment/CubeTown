package com.firecraftmc.ct.object.role;

import com.firecraftmc.ct.enums.*;
import com.firecraftmc.ct.object.game.Game;

public abstract class AcolyteRole extends ApocalypseRole {
    
    protected RoleType horsemanTransformation;
    
    public AcolyteRole(Game game, RoleType type, RoleType horsemanTransformation, String color) {
        super(game, type, Attack.NONE, Defense.BASIC, 1, Alignment.SUPPORT, color);
        this.horsemanTransformation = horsemanTransformation;
        
        if (game.getApocalypseFactionCount() == 1) {
            addImmunities(Immunity.DETECTION);
        }
    }
}
