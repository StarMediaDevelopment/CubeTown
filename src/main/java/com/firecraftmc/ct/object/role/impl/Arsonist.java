package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Attack;
import com.firecraftmc.ct.enums.Defense;
import com.firecraftmc.ct.enums.Immunity;
import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.role.AnarchyRole;
import com.firecraftmc.ct.object.role.KillingRole;
import com.firecraftmc.ct.object.role.TargetingRole;
import com.firecraftmc.ct.object.target.Target;

public class Arsonist extends AnarchyRole implements KillingRole {
    private Target target;
    
    //Douses are tracked in the player class

    public Arsonist(Game game) {
        super(game, Role.ARSONIST, Attack.UNSTOPPABLE, Defense.BASIC);
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
