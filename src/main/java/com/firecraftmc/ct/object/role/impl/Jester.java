package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.*;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.role.KillingRole;
import com.firecraftmc.ct.object.role.NeutralRole;
import com.firecraftmc.ct.object.game.Target;

public class Jester extends NeutralRole implements KillingRole {
    private Target target;
    
    public Jester(Game game) {
        super(game, RoleType.JESTER, Attack.UNSTOPPABLE, Defense.NONE, 1, Alignment.CHAOS, Goal.JESTER, "F49FD0");
        
        addAbilities("Trick the Town into voting against you.");
        addAttributes("If you are lynched you will attack one of your guilty or abstaining voters the following night with an Unstoppable attack.");
    }
    
    public String getKillMessage() {
        return "{pronown} died from guilt over lynching the {rolename}.";
    }
    
    public Target getTarget() {
        return target;
    }
    
    public void setTarget(Target target) {
        this.target = target;
    }
}
