package com.firecraftmc.ct.object.role;

import com.firecraftmc.ct.enums.Attack;
import com.firecraftmc.ct.enums.Defense;
import com.firecraftmc.ct.enums.Faction;
import com.firecraftmc.ct.enums.Role;

public abstract class CovenRole extends FactionRole {
    
    protected boolean hasNecronomicon;
    
    public CovenRole(Role type) {
        this(type, Attack.NONE, Defense.NONE);
    }

    public CovenRole(Role type, Attack attack, Defense defense) {
        super(type, Faction.COVEN, attack, defense, true);
    }
}
