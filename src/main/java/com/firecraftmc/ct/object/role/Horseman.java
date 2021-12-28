package com.firecraftmc.ct.object.role;

import com.firecraftmc.ct.enums.*;
import com.firecraftmc.ct.object.game.Game;
import com.starmediadev.utils.helper.StringHelper;

import java.util.Arrays;
import java.util.List;

public abstract class Horseman extends ApocalypseRole implements KillingRole, RampagingRole {
    public Horseman(Game game, Role type, String color) {
        super(game, type, Attack.POWERFUL, Defense.INVINCIBLE, 5, Alignment.KILLING, color);
    
        addImmunities(Immunity.DETECTION, Immunity.ROLEBLOCK, Immunity.CONTROL);
        
        if (game.getApocalypseFactionCount() == 1) {
            this.attack = Attack.UNSTOPPABLE;
        }
        
        if (game.getApocalypseFactionCount() >- 2) {
            addAbilities("You may choose to obliterate a player and anyone who visits them.");
            addAttributes("Obliterating a player erases their role and last will", 
                    "You will not know their role and last will.");
        }
        
        if (game.getApocalypseFactionCount() == 3) {
            addAbilities("You may choose to Rampage at a player's house at night.");
        }
        
        if (game.getApocalypseFactionCount() == 4) {
            addAbilities("You may choose to attack someone at night.");
        }
        
       addAttributes("You cannot be roleblocked or controlled", "If you are jailed, you will attack the Jailor");
    }
    
    public boolean rampages() {
        return RampagingRole.super.rampages();
    }
    
    public String getKillMessage() {
        return "{pronown} was obliterated by " + StringHelper.capitalizeEveryWord(type.name()) + ", Horseman of the Apocalypse";
    }
    
    public abstract String getSummoningMessage();
}