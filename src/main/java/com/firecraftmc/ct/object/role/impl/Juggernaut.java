package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Attack;
import com.firecraftmc.ct.enums.Defense;
import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.GameState;
import com.firecraftmc.ct.object.NightPhase;
import com.firecraftmc.ct.object.role.AnarchyRole;
import com.firecraftmc.ct.object.role.RampagingRole;

import java.lang.annotation.Target;

public class Juggernaut extends AnarchyRole implements RampagingRole {
    private Target target;
    private int kills;
    
    public Juggernaut() {
        super(Role.JUGGERNAUT, Attack.POWERFUL, Defense.BASIC);
        setPriority(5);
    }

    public Attack getAttack() {
        if (attack != Attack.UNSTOPPABLE) {
            if (kills >= 3) {
                attack = Attack.UNSTOPPABLE;
            }
        }
        return attack;
    }

    public boolean rampages() {
        return kills >= 2;
    }

    public boolean canTarget(GameState state, NightPhase nightPhase) {
        if (kills == 0) {
            return nightPhase == NightPhase.FULL_MOON;
        } 
        return true;
    }
}
