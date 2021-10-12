package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.role.MafiaRole;

public class Consort extends MafiaRole {
    public Consort() {
        super(Role.CONSORT);
        setPriority(2);
        addAbilities("Distract someone each night.");
        addAttributes("Distraction blocks your target from using their role's night ability.",
                "If there are no kill capable Mafia roles left you will become a Mafioso.",
                "You can talk with the other Mafia at night.");
    }
}
