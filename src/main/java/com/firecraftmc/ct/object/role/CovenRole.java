package com.firecraftmc.ct.object.role;

import com.firecraftmc.ct.enums.Attack;
import com.firecraftmc.ct.enums.Defense;
import com.firecraftmc.ct.enums.Faction;
import com.firecraftmc.ct.enums.Role;

public abstract class CovenRole extends FactionRole {
    public CovenRole(Role type) {
        super(type, Faction.COVEN, true);
    }

    public CovenRole(Role type, Attack attack, Defense defense) {
        super(type, Faction.COVEN, attack, defense, true);
    }
}
