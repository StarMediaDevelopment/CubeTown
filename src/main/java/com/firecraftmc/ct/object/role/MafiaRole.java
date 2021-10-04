package com.firecraftmc.ct.object.role;

import com.firecraftmc.ct.enums.Attack;
import com.firecraftmc.ct.enums.Defense;
import com.firecraftmc.ct.enums.Faction;
import com.firecraftmc.ct.enums.Role;

public abstract class MafiaRole extends FactionRole {
    public MafiaRole(Role type) {
        super(type, Faction.MAFIA, true);
    }

    public MafiaRole(Role type, Attack attack, Defense defense) {
        super(type, Faction.MAFIA, attack, defense, true);
    }
}
