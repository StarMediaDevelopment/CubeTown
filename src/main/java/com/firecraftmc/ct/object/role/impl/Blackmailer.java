package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.role.MafiaRole;

public class Blackmailer extends MafiaRole {
    public Blackmailer() {
        super(Role.BLACKMAILER);
        setPriority(3);
        addAbilities("Choose one person each night to blackmail.");
        addAttributes("Blackmailed targets cannot talk during the day.", 
                "You can hear private messages.", 
                "If there are no kill capable Mafia roles left you will become a Mafioso.", 
                "You can talk with the other Mafia at night.");
    }
}