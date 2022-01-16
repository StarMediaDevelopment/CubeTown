package com.firecraftmc.ct.object.role;

import com.firecraftmc.ct.enums.*;
import com.firecraftmc.ct.object.game.Game;
import com.starmediadev.utils.helper.StringHelper;

public abstract class Horseman extends ApocalypseRole implements KillingRole, RampagingRole {
    
    protected int factionCount;
    
    protected static final int FC_UNSTOPPABLE = 1, FC_RAMPAGE = 3, FC_OBLITERATE = 2;
    
    public Horseman(Game game, Role type, String color) {
        super(game, type, Attack.POWERFUL, Defense.INVINCIBLE, 5, Alignment.KILLING, color);
    
        addImmunities(Immunity.DETECTION, Immunity.ROLEBLOCK, Immunity.CONTROL);
    
        factionCount = game.getApocalypseFactionCount();
        if (factionCount == 1) {
            this.attack = Attack.UNSTOPPABLE;
        }
        
        if (factionCount <= FC_OBLITERATE) {
            addAbilities("You may choose to obliterate a player and anyone who visits them.");
            addAttributes("Obliterating a player erases their role and last will", 
                    "You will not know their role and last will.");
        }
        
        if (factionCount == FC_RAMPAGE) {
            addAbilities("You may choose to Rampage at a player's house at night.");
        }
        
        if (factionCount == FC_UNSTOPPABLE) {
            addAbilities("You may choose to attack someone at night.");
        }
        
       addAttributes("You cannot be roleblocked or controlled", "If you are jailed, you will attack the Jailor");
    }
    
    public boolean rampages() {
        return factionCount <= FC_RAMPAGE;
    }
    
    
    public String getKillMessage() {
        if (factionCount <= FC_OBLITERATE) {
            return "{pronown} was obliterated by " + StringHelper.capitalizeEveryWord(type.name()) + ", Horseman of the Apocalypse";
        }
        return getNormalKillMessage();
    }
    
    public abstract String getSummoningMessage();
    protected abstract String getNormalKillMessage();
}
