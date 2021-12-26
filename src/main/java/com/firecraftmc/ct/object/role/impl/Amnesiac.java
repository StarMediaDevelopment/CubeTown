package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Immunity;
import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.role.AbstractRole;
import com.firecraftmc.ct.object.role.NeutralRole;

public class Amnesiac extends NeutralRole {
    
    private AbstractRole rememberedRole;
    
    public Amnesiac(Game game) {
        super(game, Role.AMNESIAC);
        setPriority(6);
        addImmunities(Immunity.DETECTION);
        addAbilities("Remember who you were like by selecting a graveyard role.");
        addAttributes("When you choose a role it will be revealed to all the players in the game.");
    }
}
