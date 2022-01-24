package com.firecraftmc.ct.object.role;

import com.firecraftmc.ct.enums.*;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.game.Player;
import com.firecraftmc.ct.object.game.Target;

public abstract class Horseman extends ApocalypseRole {
    protected static final int FC_UNSTOPPABLE = 1, FC_RAMPAGE = 3, FC_OBLITERATE = 2;
    
    protected final int factionCount;
    protected String summoningMessage, normalKillMessage;
    
    public Horseman(Game game, RoleType type, Player player) {
        super(game, type, player, Attack.POWERFUL, Defense.INVINCIBLE, 5, Alignment.KILLING, "010302");
    
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
            setRampages(true);
        }
        
        if (factionCount == FC_UNSTOPPABLE) {
            addAbilities("You may choose to attack someone at night.");
        }
        
       addAttributes("You cannot be roleblocked or controlled", "If you are jailed, you will attack the Jailor");
    }
    
    @Override
    public String getKillMessage() {
        if (factionCount <= FC_OBLITERATE) {
            return "{pronown} {verb} obliterated by {rolename}";
        }
        return normalKillMessage;
    }
    
    protected void setSummoningMessage(String message) {
        this.summoningMessage = message;
    }
    
    protected void setNormalKillMessage(String normalKillMessage) {
        this.normalKillMessage = normalKillMessage;
    }
}
