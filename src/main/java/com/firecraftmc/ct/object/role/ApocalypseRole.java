package com.firecraftmc.ct.object.role;

import com.firecraftmc.ct.enums.*;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.game.Target;

public abstract class ApocalypseRole extends FactionRole implements TargetingRole {
    
    protected Target target;
    
    public ApocalypseRole(Game game, RoleType type, Attack attack, Defense defense, int priority, Alignment alignment, String color) {
        super(game, type, attack, defense, priority, FactionType.APOCALYPSE, alignment, Goal.APOCALYPSE, color, true);
    }
    
    public ApocalypseRole(Game game, RoleType type, int priority, Alignment alignment, String color) {
        this(game, type, Attack.NONE, Defense.NONE, priority, alignment, color);
    }

    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }
}
