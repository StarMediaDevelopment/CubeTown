package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Attack;
import com.firecraftmc.ct.enums.Defense;
import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.GameState;
import com.firecraftmc.ct.object.NightPhase;
import com.firecraftmc.ct.object.role.MythicalRole;
import com.firecraftmc.ct.object.role.TargetingRole;
import com.firecraftmc.ct.object.target.Target;

public class Werewolf extends MythicalRole implements TargetingRole {
    
    private Target target;
    
    public Werewolf() {
        super(Role.WEREWOLF, Attack.POWERFUL, Defense.BASIC);
        setPriority(5);
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
