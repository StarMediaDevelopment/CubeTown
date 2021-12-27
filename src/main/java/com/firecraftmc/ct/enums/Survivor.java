package com.firecraftmc.ct.enums;

import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.role.NeutralRole;
import com.firecraftmc.ct.object.role.TargetingRole;
import com.firecraftmc.ct.object.target.Target;

import java.util.List;

public class Survivor extends NeutralRole implements TargetingRole {
    
    private Target target;
    private int vests = 4;
    
    public Survivor(Game game) {
        super(game, Role.SURVIVOR);
        setPriority(3);
        
        this.abilities.add("Put on a bulletproof vest at night.");
        this.attributes.addAll(List.of("Putting on a bulletproof vest gives you Basic defense.", 
                "You can only use the bulletproof vest 4 times."));
    }

    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        if (target.isSelf()) {
            this.target = target;
        } else {
            this.target = null;
        }
    }

    public Defense getDefense() {
        if (vests > 0) {
            return Defense.BASIC;
        }
        return Defense.NONE;
    }
}
