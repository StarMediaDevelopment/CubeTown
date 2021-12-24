package com.firecraftmc.ct.object.role;

import com.firecraftmc.ct.enums.Attack;
import com.firecraftmc.ct.enums.Defense;
import com.firecraftmc.ct.enums.Faction;
import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.game.Game;

public abstract class FactionRole extends AbstractRole {
    
    protected final Faction faction;
    protected final boolean winsWithEachother;
    
    public FactionRole(Game game, Role type, Faction faction, boolean winsWithEachother) {
        super(game, type);
        this.faction = faction;
        this.winsWithEachother = winsWithEachother;
    }

    public FactionRole(Game game, Role type, Faction faction, Attack attack, Defense defense, boolean winsWithEachother) {
        super(game, type, attack, defense);
        this.faction = faction;
        this.winsWithEachother = winsWithEachother;
    }
}
