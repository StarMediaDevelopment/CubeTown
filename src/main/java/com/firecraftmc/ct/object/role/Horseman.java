package com.firecraftmc.ct.object.role;

import com.firecraftmc.ct.enums.Attack;
import com.firecraftmc.ct.enums.Defense;
import com.firecraftmc.ct.enums.Immunity;
import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.game.Game;
import com.starmediadev.utils.helper.StringHelper;

import java.util.Arrays;

public abstract class Horseman extends ApocalypseRole implements KillingRole, RampagingRole {
    public Horseman(Game game, Role type) {
        super(game, type, Attack.POWERFUL, Defense.INVINCIBLE);
        setPriority(5);
    
        this.immunities.addAll(Arrays.asList(Immunity.DETECTION, Immunity.ROLEBLOCK, Immunity.CONTROL));
        
        
    }
    
    public String getKillMessage() {
        return "{pronown} was obliterated by " + StringHelper.capitalizeEveryWord(type.name()) + ", Horseman of the Apocalypse";
    }
}
