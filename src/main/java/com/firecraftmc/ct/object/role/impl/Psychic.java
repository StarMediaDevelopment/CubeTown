package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.role.TownRole;

public class Psychic extends TownRole {
    public Psychic() {
        super(Role.PSYCHIC);
        setPriority(4);
    }
}
