package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Attack;
import com.firecraftmc.ct.enums.Defense;
import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.role.MafiaRole;

public class Ambusher extends MafiaRole {
    public Ambusher() {
        super(Role.AMBUSHER, Attack.BASIC, Defense.NONE);
        setPriority(1);
        addAbilities("You may choose to lie in wait outside your target's house");
        addAttributes("You will attack one player who visits your target.",
                "All players visiting your target will learn your name.", 
                "If there are no kill capable Mafia roles left you will become a Mafioso.");
    }
}
