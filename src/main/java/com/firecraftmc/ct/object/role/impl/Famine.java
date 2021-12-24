package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.role.Horseman;

import java.util.Arrays;

public class Famine extends Horseman {
    public Famine() {
        super(Role.FAMINE);
        this.abilities.add("Choose someone at night to starve.");
        this.attributes.addAll(Arrays.asList("Starving a player will either kill them, or roleblock them.", 
                "If you cannot kill them because they have defense, you will instead roleblock them.", 
                "This roleblock will override roleblock immunity."));
        
    }
}
