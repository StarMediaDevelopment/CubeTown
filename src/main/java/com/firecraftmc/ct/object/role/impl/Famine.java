package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Attack;
import com.firecraftmc.ct.enums.Defense;
import com.firecraftmc.ct.enums.Immunity;
import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.role.ApocalypseRole;
import com.firecraftmc.ct.object.role.RampagingRole;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Famine extends ApocalypseRole {
    public Famine() {
        super(Role.FAMINE, Attack.POWERFUL, Defense.INVINCIBLE);
        setPriority(5);
        
        this.immunities.addAll(Arrays.asList(Immunity.DETECTION, Immunity.ROLEBLOCK, Immunity.CONTROL));
        
        this.abilities.add("Choose someone at night to starve.");
        this.attributes.addAll(Arrays.asList("Starving a player will either kill them, or roleblock them.", 
                "If you cannot kill them because they have defense, you will instead roleblock them.", 
                "This roleblock will override roleblock immunity."));
        
    }
}
