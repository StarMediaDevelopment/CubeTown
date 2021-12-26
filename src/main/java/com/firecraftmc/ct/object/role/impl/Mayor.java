package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.GameState;
import com.firecraftmc.ct.object.NightPhase;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.role.TargetingRole;
import com.firecraftmc.ct.object.role.TownRole;
import com.firecraftmc.ct.object.target.Target;

import java.util.List;

public class Mayor extends TownRole implements TargetingRole {
    
    private Target target;
    
    public Mayor(Game game) {
        super(game, Role.MAYOR);
        
        this.abilities.add("You may reveal yourself as the Mayor of the Town.");
        this.attributes.addAll(List.of("Once you have revealed yourself as Mayor your vote counts as 3 votes.", 
                "You may not be healed once you have revealed yourself", 
                "Once revealed, you can't whisper or be whispered to."));
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

    public boolean canTarget(GameState state, NightPhase nightPhase) {
        return state == GameState.DAY;
    }
}
