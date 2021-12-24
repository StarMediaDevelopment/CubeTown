package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.role.Horseman;

import java.util.Arrays;

public class Death extends Horseman {
    public Death() {
        super(Role.DEATH);
        this.abilities.add("Choose someone at night to take their soul.");
        this.attributes.addAll(Arrays.asList("When you take someone's sould, you will attack and erase them.", 
                "Erasing them will wipe their role and last will."));
    }
}
