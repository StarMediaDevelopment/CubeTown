package com.firecraftmc.ct.object.role;

import com.firecraftmc.ct.enums.*;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.game.Target;

public abstract class AnarchyRole extends FactionRole implements KillingRole {
    
    protected Target target;
    
    public AnarchyRole(Game game, RoleType type, Attack attack, Defense defense, int priority, Alignment alignment, Goal goal, String color) {
        super(game, type, attack, defense, priority, FactionType.ANARCHY, alignment, goal, color, false);
    }
    
    public AnarchyRole(Game game, RoleType type, int priority, Alignment alignment, Goal goal, String color) {
        this(game, type, Attack.NONE, Defense.NONE, priority, alignment, goal, color);
    }
    
    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }
}
