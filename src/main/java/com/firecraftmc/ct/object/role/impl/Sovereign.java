package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Attack;
import com.firecraftmc.ct.enums.Defense;
import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.GameState;
import com.firecraftmc.ct.object.NightPhase;
import com.firecraftmc.ct.object.role.TargetingRole;
import com.firecraftmc.ct.object.role.TownRole;
import com.firecraftmc.ct.object.target.Target;

public class Sovereign extends TownRole implements TargetingRole {
    
    private Target target;
    private boolean allTownDead;
    
    public Sovereign() {
        super(Role.SOVEREIGN);
    }

    public Attack getAttack() {
        if (allTownDead) {
            attack = Attack.UNSTOPPABLE;
        }
        return attack;
    }

    public Defense getDefense() {
        if (allTownDead) {
            defense = Defense.BASIC;
        }
        return defense;
    }

    public boolean isAstral() {
        return true;
    }

    public boolean canTarget(GameState state, NightPhase nightPhase) {
        return state == GameState.NIGHT && allTownDead;
    }

    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }
}
