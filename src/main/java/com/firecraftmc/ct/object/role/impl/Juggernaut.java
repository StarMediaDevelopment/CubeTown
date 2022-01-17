package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.*;
import com.firecraftmc.ct.object.GameState;
import com.firecraftmc.ct.object.NightPhase;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.role.AnarchyRole;
import com.firecraftmc.ct.object.role.RampagingRole;

import java.lang.annotation.Target;

//TODO need to test this
public class Juggernaut extends AnarchyRole implements RampagingRole {
    private Target target;
    private int kills;
    
    public Juggernaut(Game game) {
        super(game, RoleType.JUGGERNAUT, Attack.POWERFUL, Defense.BASIC, 5, Alignment.KILLING, Goal.KILL_OPPOSE, "631A35");
        
        addAbilities("You may choose to attack a player on full moon nights.");
    }
    
    public void incrementKills() {
        kills += 1;
        abilities.clear();
        attributes.clear();
        if (kills > 0) {
            addAbilities("You may choose to attack someone each night.");
        }
        
        if (kills >= 0 && kills <= 2) {
            addAttributes("With each kill your powers grow");
        }
        
        if (kills == 3) {
            addAttributes("You have reached ultimate power");
        }
        
        if (kills == 1) {
            addAttributes("You may now attack every night");
        }
        
        if (kills >= 2) {
            addAttributes("You may attack every night");
        }
        
        if (kills == 2) {
            addAttributes("You now Rampage when you attack");
        }
        
        if (kills >= 3) {
            addAttributes("You Rampage when you attack", "You ignore all effects that would protect a player");
        }
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
    
    public String getKillMessage() {
        return "{pronown} {verb} assaulted by the {rolename}.";
    }
}
