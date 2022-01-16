package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.*;
import com.firecraftmc.ct.object.GameState;
import com.firecraftmc.ct.object.NightPhase;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.role.AnarchyRole;
import com.firecraftmc.ct.object.role.RampagingRole;

import java.lang.annotation.Target;

public class Juggernaut extends AnarchyRole implements RampagingRole {
    private Target target;
    private int kills;
    
    public Juggernaut(Game game) {
        super(game, RoleType.JUGGERNAUT, Attack.POWERFUL, Defense.BASIC, 5, Alignment.KILLING, Goal.KILL_OPPOSE, "631A35");
        setPriority(5);
        
        addAbilities("You may choose to attack a player on full moon nights."); //0 kills
        //1 or more kills
        //this.abilities.add("You may choose to attack a player each night.");
        
        this.attributes.add("With each kill your powers grow"); //0-2 kills
        this.attributes.add("You have reached ultimate power"); //3 kills
        this.attributes.add("You may attack every night"); //1 or more kills
        this.attributes.add("You may rampage when you attack."); //2 or more kills
        this.attributes.add("You ignore all effects that would protect a player"); //3 or more kills
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
        return "{pronown} was assaulted by the Juggernaut";
    }
}
