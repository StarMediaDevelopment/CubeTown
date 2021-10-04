package com.firecraftmc.ct.object.role;

import com.firecraftmc.ct.enums.Attack;
import com.firecraftmc.ct.enums.Defense;
import com.firecraftmc.ct.enums.Faction;
import com.firecraftmc.ct.enums.Role;

public abstract class FactionRole extends AbstractRole {
    
    protected final Faction faction;
    protected final boolean winsWithEachother;
    
    public FactionRole(Role type, Faction faction, boolean winsWithEachother) {
        super(type);
        this.faction = faction;
        this.winsWithEachother = winsWithEachother;
    }

    public FactionRole(Role type, Faction faction, Attack attack, Defense defense, boolean winsWithEachother) {
        super(type, attack, defense);
        this.faction = faction;
        this.winsWithEachother = winsWithEachother;
    }
}
