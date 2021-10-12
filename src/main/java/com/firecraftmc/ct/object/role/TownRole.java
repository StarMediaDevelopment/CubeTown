package com.firecraftmc.ct.object.role;

import com.firecraftmc.ct.enums.*;

public abstract class TownRole extends FactionRole {
    public TownRole(Role type) {
        this(type, Attack.NONE, Defense.NONE);
        this.addImmunities(Immunity.DETECTION);
    }

    public TownRole(Role type, Attack attack, Defense defense) {
        super(type, Faction.TOWN, attack, defense, true);
    }
}
