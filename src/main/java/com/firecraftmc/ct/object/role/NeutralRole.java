package com.firecraftmc.ct.object.role;

import com.firecraftmc.ct.enums.Attack;
import com.firecraftmc.ct.enums.Defense;
import com.firecraftmc.ct.enums.Faction;
import com.firecraftmc.ct.enums.Role;

public abstract class NeutralRole extends FactionRole {
    public NeutralRole(Role type) {
        super(type, Faction.NEUTRAL, false);
    }

    public NeutralRole(Role type, Attack attack, Defense defense) {
        super(type, Faction.NEUTRAL, attack, defense, false);
    }
}
