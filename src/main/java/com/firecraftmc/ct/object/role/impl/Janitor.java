package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Alignment;
import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.role.MafiaRole;

import java.util.List;

public class Janitor extends MafiaRole {
    public Janitor(Game game) {
        super(game, Role.JANITOR, 3, Alignment.DECEPTION);
        
        addAbilities("Choose a person to clean at night.");
        addAttributes("If your target dies their role and last will won't be revealed to the Town.", "Only you will see the cleaned targets role and last will.", "You may only perform 3 cleanings");
    }
}
