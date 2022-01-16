package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Alignment;
import com.firecraftmc.ct.enums.Defense;
import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.role.ProtectiveRole;
import com.firecraftmc.ct.object.role.TownRole;
import com.firecraftmc.ct.object.game.Target;

public class Trapper extends TownRole implements ProtectiveRole {
    
    private Target target;
    
    public Trapper(Game game) {
        super(game, Role.TRAPPER, 1, Alignment.PROTECTIVE);
        
        addAbilities("You may set up a Trap at another player's house");
        addAttributes("Traps take one day to build.", "Traps can be torn down by selecting yourself at night.", 
                "You may only have one Trap out at a time.");
    }
    
    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }
    
    public String getKillMessage() {
        return "{pronown} was killed by a Trapper";
    }
    
    public Defense getTemporaryDefense() {
        return Defense.POWERFUL;
    }
}
