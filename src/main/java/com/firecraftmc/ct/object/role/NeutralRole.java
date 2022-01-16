package com.firecraftmc.ct.object.role;

import com.firecraftmc.ct.enums.*;
import com.firecraftmc.ct.object.game.Game;

public abstract class NeutralRole extends FactionRole {
    
    public NeutralRole(Game game, RoleType type, Attack attack, Defense defense, int priority, Alignment alignment, Goal goal, String color) {
        super(game, type, attack, defense, priority, FactionType.NEUTRAL, alignment, goal, color, true);
    }
    
    public NeutralRole(Game game, RoleType type, int priority, Alignment alignment, Goal goal, String color) {
        super(game, type, Attack.NONE, Defense.NONE, priority, FactionType.NEUTRAL, alignment, goal, color, true);
    }
    
    public NeutralRole(Game game, RoleType type, Attack attack, Defense defense, int priority, Alignment alignment, Goal goal) {
        super(game, type, attack, defense, priority, FactionType.NEUTRAL, alignment, goal, true);
    }
    
    public NeutralRole(Game game, RoleType type, int priority, Alignment alignment, Goal goal) {
        this(game, type, Attack.NONE, Defense.NONE, priority, alignment, goal);
    }
}
