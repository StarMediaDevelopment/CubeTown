package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Alignment;
import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.role.MafiaRole;

import java.util.List;

public class Hypnotist extends MafiaRole {
    public Hypnotist(Game game) {
        super(game, Role.HYPNOTIST, 3, Alignment.DECEPTION);
        
        addAbilities("You may sneak into a players house at night and plant a memory.");
        addAttributes("A planted memory will confuse the player.", 
                "If there are no kill capable Mafia roles left you will become a Mafioso.");
    }
}
