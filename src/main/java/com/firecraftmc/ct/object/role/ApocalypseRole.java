package com.firecraftmc.ct.object.role;

import com.firecraftmc.ct.enums.Attack;
import com.firecraftmc.ct.enums.Defense;
import com.firecraftmc.ct.enums.Faction;
import com.firecraftmc.ct.enums.Role;

public abstract class ApocalypseRole extends FactionRole {
    public ApocalypseRole(Role type) {
        super(type, Faction.APOCALYPSE, true);
    }

    public ApocalypseRole(Role type, Attack attack, Defense defense) {
        super(type, Faction.APOCALYPSE, attack, defense, true);
    }
}
