package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Attack;
import com.firecraftmc.ct.enums.Defense;
import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.role.KillingRole;
import com.firecraftmc.ct.object.role.TargetingRole;
import com.firecraftmc.ct.object.role.TownRole;
import com.firecraftmc.ct.object.target.Target;

import java.util.List;

public class Jailor extends TownRole implements KillingRole {
    
    private Target target;
    private int executions = 3;
    
    public Jailor(Game game) {
        super(game, Role.JAILOR, Attack.UNSTOPPABLE, Defense.NONE);
        setPriority(5); //Jailing is a day ability that happens before anything else, not covered by this priority system
        
        this.abilities.add("You may choose one person during the day to Jail for the night.");
        this.attributes.addAll(List.of("You may anonymously talk with your prisoner.", "You can choose to attack your prisoner.", "The jailed target can't perform their night ability.", "If you execute a Town member, you forfeit further executions."));
    }
    
    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }
    
    public int getExecutions() {
        return executions;
    }
    
    public void setExecutions(int executions) {
        this.executions = executions;
    }
    
    public String getKillMessage() {
        return "{pronown} was executed by the Jailor";
    }
}
