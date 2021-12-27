package com.firecraftmc.ct.object.role;

import com.firecraftmc.ct.enums.*;
import com.firecraftmc.ct.object.game.Game;

public abstract class TownRole extends FactionRole {
    public TownRole(Game game, Role type, Attack attack, Defense defense, int priority, Alignment alignment) {
        super(game, type, attack, defense, priority, Faction.TOWN, alignment, Goal.TOWN, true);
    }
    
    public TownRole(Game game, Role type, int priority, Alignment alignment) {
        this(game, type, Attack.NONE, Defense.NONE, priority, alignment);
    }
}
