package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Attack;
import com.firecraftmc.ct.enums.Defense;
import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.role.ApocalypseRole;
import com.firecraftmc.ct.object.role.RampagingRole;

import java.util.Arrays;

import static com.firecraftmc.ct.enums.Immunity.*;

public class Death extends ApocalypseRole {
    public Death() {
        super(Role.DEATH, Attack.POWERFUL, Defense.INVINCIBLE);
        setPriority(5);
        this.abilities.add("Choose someone at night to take their soul.");
        this.attributes.addAll(Arrays.asList("When you take someone's sould, you will attack and erase them.", 
                "Erasing them will wipe their role and last will."));
        this.immunities.addAll(Arrays.asList(CONTROL, DETECTION, ROLEBLOCK));
    }
}
