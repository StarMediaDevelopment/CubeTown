package com.firecraftmc.ct.object.role.impl.apocalypse.acolyte;

import com.firecraftmc.ct.enums.*;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.game.Player;
import com.firecraftmc.ct.object.role.impl.apocalypse.ApocalypseRole;

public abstract class AcolyteRole extends ApocalypseRole {
    
    protected final RoleType horsemanTransformation;
    
    public AcolyteRole(Game game, RoleType type, Player player, RoleType horsemanTransformation, String color) {
        super(game, type, player, Attack.NONE, Defense.BASIC, 1, Alignment.SUPPORT, color);
        this.horsemanTransformation = horsemanTransformation;
        
        if (game.getApocalypseFactionCount() == 1) {
            addImmunities(Immunity.DETECTION);
        }
    }
    
    public RoleType getHorsemanTransformation() {
        return horsemanTransformation;
    }
}
