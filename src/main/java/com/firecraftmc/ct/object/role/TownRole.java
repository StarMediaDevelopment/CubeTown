package com.firecraftmc.ct.object.role;

import com.firecraftmc.ct.enums.Attack;
import com.firecraftmc.ct.enums.Defense;
import com.firecraftmc.ct.enums.Faction;
import com.firecraftmc.ct.enums.Role;

public abstract class TownRole extends FactionRole {
    public TownRole(Role type) {
        this(type, Attack.NONE, Defense.NONE);
    }

    public TownRole(Role type, Attack attack, Defense defense) {
        super(type, Faction.TOWN, attack, defense, true);
    }
}
