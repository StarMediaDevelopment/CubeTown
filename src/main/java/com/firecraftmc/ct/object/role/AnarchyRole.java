package com.firecraftmc.ct.object.role;

import com.firecraftmc.ct.enums.Attack;
import com.firecraftmc.ct.enums.Defense;
import com.firecraftmc.ct.enums.Faction;
import com.firecraftmc.ct.enums.Role;

public abstract class AnarchyRole extends FactionRole {
    public AnarchyRole(Role type) {
        super(type, Faction.ANARCHY, false);
    }

    public AnarchyRole(Role type, Attack attack, Defense defense) {
        super(type, Faction.ANARCHY, attack, defense, false);
    }
}
