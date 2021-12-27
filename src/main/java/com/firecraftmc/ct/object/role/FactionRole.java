package com.firecraftmc.ct.object.role;

import com.firecraftmc.ct.enums.*;
import com.firecraftmc.ct.object.game.Game;

public abstract class FactionRole extends AbstractRole {
    
    protected final boolean winsWithEachother;
    
    public FactionRole(Game game, Role type, Attack attack, Defense defense, int priority, Faction faction, Alignment alignment, Goal goal, String color, boolean winsWithEachother) {
        super(game, type, attack, defense, priority, faction, alignment, goal, color);
        this.winsWithEachother = winsWithEachother;
    }
    
    public FactionRole(Game game, Role type, Attack attack, Defense defense, int priority, Faction faction, Alignment alignment, Goal goal, boolean winsWithEachother) {
        super(game, type, attack, defense, priority, faction, alignment, goal, faction.getColor());
        this.winsWithEachother = winsWithEachother;
    }
    
    public FactionRole(Game game, Role type, int priority, Faction faction, Alignment alignment, Goal goal, boolean winsWithEachother) {
        this(game, type, Attack.NONE, Defense.NONE, priority, faction, alignment, goal, winsWithEachother);
    }
}
