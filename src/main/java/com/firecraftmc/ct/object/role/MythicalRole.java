package com.firecraftmc.ct.object.role;

import com.firecraftmc.ct.enums.Attack;
import com.firecraftmc.ct.enums.Defense;
import com.firecraftmc.ct.enums.Faction;
import com.firecraftmc.ct.enums.Role;

public abstract class MythicalRole extends FactionRole {
    public MythicalRole(Role type) {
        super(type, Faction.MYTHICAL, false);
    }

    public MythicalRole(Role type, Attack attack, Defense defense) {
        super(type, Faction.APOCALYPSE, attack, defense, false);
    }
}
