package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.role.MafiaRole;

public class Consigliere extends MafiaRole {
    public Consigliere() {
        super(Role.CONSIGLIERE);
        setPriority(4);
        addAbilities("Check one person for their exact role each night.");
        addAttributes("If there are no kill capable Mafia roles left you will become a Mafioso.", 
                "You can talk with the other Mafia at night.");
    }
}
