package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.*;
import com.firecraftmc.ct.object.GameState;
import com.firecraftmc.ct.object.NightPhase;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.role.MythicalRole;
import com.firecraftmc.ct.object.role.RampagingRole;
import com.firecraftmc.ct.object.role.TargetingRole;
import com.firecraftmc.ct.object.game.Target;

public class Werewolf extends MythicalRole implements TargetingRole, RampagingRole {
    
    private Target target;
    
    public Werewolf(Game game) {
        super(game, RoleType.WEREWOLF, Attack.POWERFUL, Defense.BASIC, 5, Alignment.KILLING, Goal.KILL_OPPOSE, "744A26");
        
        addAbilities("Transform into a Werewolf during the full moon.");
        addAttributes("You will Rampage at a player's house when you attack.", 
                "If you do not select a target you will stay home and Rampage at your home.");
    }
    
    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }

    public boolean canTarget(GameState state, NightPhase nightPhase) {
        return state == GameState.NIGHT && nightPhase == NightPhase.FULL_MOON;
    }
}
