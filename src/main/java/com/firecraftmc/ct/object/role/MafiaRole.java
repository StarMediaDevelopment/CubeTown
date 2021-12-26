package com.firecraftmc.ct.object.role;

import com.firecraftmc.ct.enums.Attack;
import com.firecraftmc.ct.enums.Defense;
import com.firecraftmc.ct.enums.Faction;
import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.target.Target;

public abstract class MafiaRole extends FactionRole implements TargetingRole {
    
    protected Target target;
    
    public MafiaRole(Game game, Role type) {
        this(game, type, Attack.NONE, Defense.NONE);
    }

    public MafiaRole(Game game, Role type, Attack attack, Defense defense) {
        super(game, type, Faction.MAFIA, attack, defense, true);
    }

    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }
}
