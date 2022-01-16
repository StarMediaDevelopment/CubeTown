package com.firecraftmc.ct.object.role;

import com.firecraftmc.ct.enums.*;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.game.Target;

public abstract class MafiaRole extends FactionRole implements TargetingRole {
    
    protected Target target;
    
    public MafiaRole(Game game, RoleType type, Attack attack, Defense defense, int priority, Alignment alignment) {
        super(game, type, attack, defense, priority, FactionType.MAFIA, alignment, Goal.MAFIA, true);
    }
    
    public MafiaRole(Game game, RoleType type, int priority, Alignment alignment) {
        this(game, type, Attack.NONE, Defense.NONE, priority, alignment);
    }

    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }
}
