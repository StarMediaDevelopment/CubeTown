package com.firecraftmc.ct.object.role;

import com.firecraftmc.ct.enums.*;
import com.firecraftmc.ct.object.game.Game;

public abstract class TownRole extends FactionRole {
    public TownRole(Game game, Role type) {
        this(game, type, Attack.NONE, Defense.NONE);
        this.addImmunities(Immunity.DETECTION);
    }

    public TownRole(Game game, Role type, Attack attack, Defense defense) {
        super(game, type, Faction.TOWN, attack, defense, true);
    }
}
