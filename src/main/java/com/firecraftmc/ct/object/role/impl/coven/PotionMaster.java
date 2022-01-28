package com.firecraftmc.ct.object.role.impl.coven;

import com.firecraftmc.ct.enums.*;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.game.Player;

public class PotionMaster extends CovenRole {
    
    private PotionType potionType;
    
    public PotionMaster(Game game, Player player) {
        super(game, RoleType.POTION_MASTER, player, Attack.BASIC, Defense.NONE, 5);
        addImmunities(Immunity.CONTROL);
        
        addAbilities("You may choose to use a potion on a player each night.");
        addAttributes("You may choose to use a Heal, reveal, or attack potion on a player.",
                "Each potion has a three day cooldown.");
        setProtectiveDefense(Defense.POWERFUL);
        setKillMessage("{pronown} {verb} killed by the {rolename}.");
    }
    
    public PotionType getPotionType() {
        return potionType;
    }
    
    public void setPotionType(PotionType potionType) {
        this.potionType = potionType;
    }
    
    public int getPriority() {
        return switch (potionType) {
            case HEAL -> 3;
            case REVEAL -> 4;
            case KILL -> 5;
        };
    }
}