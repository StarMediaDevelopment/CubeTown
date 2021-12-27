package com.firecraftmc.ct.object.role;

import com.firecraftmc.ct.enums.*;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.target.Target;

public abstract class MythicalRole extends FactionRole implements TargetingRole {
    
    protected Target target;
    
    public MythicalRole(Game game, Role type, Attack attack, Defense defense, int priority, Alignment alignment, Goal goal, String color) {
        super(game, type, attack, defense, priority, Faction.MYTHICAL, alignment, goal, color, false);
    }
    
    public MythicalRole(Game game, Role type, int priority, Alignment alignment, Goal goal, String color) {
        this(game, type, Attack.NONE, Defense.NONE, priority, alignment, goal, color);
    }

    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }
}
