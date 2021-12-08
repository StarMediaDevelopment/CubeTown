package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.role.MafiaRole;

import java.util.List;

public class Hypnotist extends MafiaRole {
    public Hypnotist() {
        super(Role.HYPNOTIST);
        setPriority(3);
        
        this.abilities.add("You may sneak into a players house at night and plant a memory.");
        this.attributes.addAll(List.of("A planted memory will confuse the player.", 
                "If there are no kill capable Mafia roles left you will become a Mafioso."));
    }
}
