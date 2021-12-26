package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Attack;
import com.firecraftmc.ct.enums.Defense;
import com.firecraftmc.ct.enums.Immunity;
import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.role.CovenRole;

import java.util.List;

public class PotionMaster extends CovenRole {
    public PotionMaster(Game game) {
        super(game, Role.POTION_MASTER, Attack.NONE, Defense.NONE);
        this.immunities.add(Immunity.CONTROL);
        
        this.abilities.add("You may choose to use a potion on a player each night.");
        
        this.attributes.addAll(List.of("You may choose to use a Heal, reveal, or attack potion on a player.", 
                "Each potion has a three day cooldown."));
    }

    public int getPriority() {
        //3 healing, 4 revealing, 5 attacking
        return super.getPriority();
    }
    
    public String getKillMessage() {
        return "{pronown}";
    }
}
