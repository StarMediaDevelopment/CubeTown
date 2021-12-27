package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Attack;
import com.firecraftmc.ct.enums.Defense;
import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.GameState;
import com.firecraftmc.ct.object.NightPhase;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.role.MythicalRole;
import com.firecraftmc.ct.object.role.RampagingRole;
import com.firecraftmc.ct.object.role.TargetingRole;
import com.firecraftmc.ct.object.target.Target;

import java.util.List;

public class Werewolf extends MythicalRole implements TargetingRole, RampagingRole {
    
    private Target target;
    
    public Werewolf(Game game) {
        super(game, Role.WEREWOLF, Attack.POWERFUL, Defense.BASIC);
        setPriority(5);
        
        this.abilities.add("Transform into a Werewolf during the full moon.");
        this.attributes.addAll(List.of("You will Rampage at a player's house when you attack.", 
                "If you do not select a target you will stay home and Rampage at your home."));
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
