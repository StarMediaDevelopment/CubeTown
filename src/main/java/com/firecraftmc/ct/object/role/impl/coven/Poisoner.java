package com.firecraftmc.ct.object.role.impl.coven;

import com.firecraftmc.ct.enums.Attack;
import com.firecraftmc.ct.enums.Defense;
import com.firecraftmc.ct.enums.RoleType;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.game.Player;

public class Poisoner extends CovenRole {
    public Poisoner(Game game, Player player) {
        super(game, RoleType.POISONER, player, Attack.BASIC, Defense.NONE, 5);
        
        addAbilities("You may choose to poison a player each night.");
        addAttributes("Your poisons take one day to take effect.", 
                "Poison can be removed by Heals.");
    }
    
    public String getKillMessage() {
        return "{pronown} {verb} poisoned by the {rolename}.";
    }
}
