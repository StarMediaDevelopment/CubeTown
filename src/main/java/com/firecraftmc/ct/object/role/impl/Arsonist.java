package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.*;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.role.AnarchyRole;
import com.firecraftmc.ct.object.role.KillingRole;
import com.firecraftmc.ct.object.game.Target;

public class Arsonist extends AnarchyRole implements KillingRole {
    private Target target;
    
    //Douses are tracked in the player class

    public Arsonist(Game game) {
        super(game, RoleType.ARSONIST, Attack.UNSTOPPABLE, Defense.BASIC, -1, Alignment.KILLING, Goal.ARSONIST, "EE7600");
        addImmunities(Immunity.DETECTION);
        addAbilities("You may Douse someone in gasoline or ignite Doused targets.");
        addAttributes("Select yourself to ignite doused people dealing an Unstoppable attack.", 
                "You will douse anybody that visits you.", 
                "If you take no action, you will attempt to clean gasoline off yourself.");
    }

    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }

    public int getPriority() {
        if (target.isSelf()) {
            return 5;
        } else {
            return 3;
        }
    }
    
    public String getKillMessage() {
        return "{pronown} was incinerated by an Arsonist.";
    }
}
