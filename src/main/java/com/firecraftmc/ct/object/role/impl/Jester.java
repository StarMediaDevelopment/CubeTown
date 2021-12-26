package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Attack;
import com.firecraftmc.ct.enums.Defense;
import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.role.KillingRole;
import com.firecraftmc.ct.object.role.NeutralRole;
import com.firecraftmc.ct.object.target.Target;

public class Jester extends NeutralRole implements KillingRole {
    private Target target;
    
    public Jester(Game game) {
        super(game, Role.JESTER, Attack.UNSTOPPABLE, Defense.NONE); //attack is only after lynched
        setPriority(1);
        
        this.abilities.add("Trick the Town into voting against you.");
        this.attributes.add("If you are lynched you will attack one of your guilty or abstaining voters the following night with an Unstoppable attack.");
    }
    
    public String getKillMessage() {
        return "{pronown} died from guilt over lynching the Jester.";
    }
    
    public Target getTarget() {
        return target;
    }
    
    public void setTarget(Target target) {
        this.target = target;
    }
}
