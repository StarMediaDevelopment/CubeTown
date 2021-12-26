package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Immunity;
import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.role.CovenRole;

import java.util.List;

public class Necromancer extends CovenRole {
    
    public Necromancer(Game game) {
        super(game, Role.NECROMANCER);
        setPriority(1);
        
        this.immunities.addAll(List.of(Immunity.CONTROL, Immunity.ROLEBLOCK));
        
        this.abilities.add("You may reanimate a dead player and use their ability on a player.");
        this.attributes.addAll(List.of("Create zombies from dead players who use their abilities on your second target.", 
                "Each zombie can be used once before it rots.", "With the Necronomicon, select yourself to summon a ghoul to Basic attack your target."));
    }
    
    public String getKillMessage() {
        return "{pronown} was killed by the Necromancer's Ghoul";
    }
}
