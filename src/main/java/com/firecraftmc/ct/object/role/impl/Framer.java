package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Alignment;
import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.role.MafiaRole;

import java.util.List;

public class Framer extends MafiaRole {
    public Framer(Game game) {
        super(game, Role.FRAMER, 3, Alignment.DECEPTION);
        
        addAbilities("Choose someone to frame at night.");
        addAttributes("If your target is investigated they will appear suspicious.",
                "If there are no kill capable Mafia roles left you will become Mafioso.");
    }
}
