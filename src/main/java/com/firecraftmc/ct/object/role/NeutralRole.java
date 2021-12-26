package com.firecraftmc.ct.object.role;

import com.firecraftmc.ct.enums.Attack;
import com.firecraftmc.ct.enums.Defense;
import com.firecraftmc.ct.enums.Faction;
import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.game.Game;

public abstract class NeutralRole extends FactionRole {
    public NeutralRole(Game game, Role type) {
        this(game, type, Attack.NONE, Defense.NONE);
    }

    public NeutralRole(Game game, Role type, Attack attack, Defense defense) {
        super(game, type, Faction.NEUTRAL, attack, defense, false);
    }
}
