package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.*;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.role.CovenRole;
import com.firecraftmc.ct.object.role.ProtectiveRole;

import java.util.List;

public class PotionMaster extends CovenRole implements ProtectiveRole {
    
    private PotionType potionType;
    
    public PotionMaster(Game game) {
        super(game, Role.POTION_MASTER, Attack.NONE, Defense.NONE, 5);
        addImmunities(Immunity.CONTROL);
        
        addAbilities("You may choose to use a potion on a player each night.");
        addAttributes("You may choose to use a Heal, reveal, or attack potion on a player.", 
                "Each potion has a three day cooldown.");
    }
    
    public PotionType getPotionType() {
        return potionType;
    }
    
    public void setPotionType(PotionType potionType) {
        this.potionType = potionType;
    }
    
    public int getPriority() {
        //3 healing, 4 revealing, 5 attacking
        return super.getPriority();
    }
    
    public String getKillMessage() {
        return "{pronown} was killed by the Potion Master";
    }
    
    public Attack getAttack() {
        if (potionType == PotionType.KILL) {
            return Attack.BASIC;
        }
        return Attack.NONE;
    }
    
    public Defense getTemporaryDefense() {
        if (potionType == PotionType.HEAL) {
            return Defense.POWERFUL;
        }
        return Defense.NONE;
    }
}
