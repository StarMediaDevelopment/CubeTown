package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Alignment;
import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.role.MafiaRole;

public class Blackmailer extends MafiaRole {
    public Blackmailer(Game game) {
        super(game, Role.BLACKMAILER, 3, Alignment.SUPPORT);
        addAbilities("Choose one person each night to blackmail.");
        addAttributes("Blackmailed targets cannot talk during the day.", 
                "You can hear private messages.", 
                "If there are no kill capable Mafia roles left you will become a Mafioso.", 
                "You can talk with the other Mafia at night.");
    }
}