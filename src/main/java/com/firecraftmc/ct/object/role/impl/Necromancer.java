package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Immunity;
import com.firecraftmc.ct.enums.RoleType;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.role.CovenRole;

public class Necromancer extends CovenRole {
    
    public Necromancer(Game game) {
        super(game, RoleType.NECROMANCER, 1);
        
        addImmunities(Immunity.CONTROL, Immunity.ROLEBLOCK);
        
        addAbilities("You may reanimate a dead player and use their ability on a player.");
        addAttributes("Create zombies from dead players who use their abilities on your second target.", 
                "Each zombie can be used once before it rots.", 
                "With the Necronomicon, select yourself to summon a ghoul to Basic attack your target.");
    }
    
    public String getKillMessage() {
        return "{pronown} was killed by the {rolename}'s Ghoul";
    }
}
