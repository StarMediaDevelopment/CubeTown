package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Attack;
import com.firecraftmc.ct.enums.Defense;
import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.role.ProtectiveRole;
import com.firecraftmc.ct.object.role.TargetingRole;
import com.firecraftmc.ct.object.role.TownRole;
import com.firecraftmc.ct.object.target.Target;

public class Bodyguard extends TownRole implements ProtectiveRole {
    
    private Target target;
    private boolean vestUsed;
    
    public Bodyguard(Game game) {
        super(game, Role.BODYGUARD, Attack.POWERFUL, Defense.NONE);
        setPriority(3);
        addAbilities("Protect a player from direct attacks at night.");
        addAttributes("If your target is directly attacked or is the victim of a harmful visit, you and the visitor will fight.", 
                "If you successfully protect someone you can still be Healed.");
    }
    
    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }

    public Defense getDefense() {
        if (target.isSelf() && !vestUsed) {
            return Defense.BASIC;
        }
        return super.getDefense();
    }
    
    public String getKillMessage() {
        return "{pronown} was killed by a Bodyguard.";
    }
    
    public Defense getTemporaryDefense() {
        return Defense.INVINCIBLE; //TODO Bodyguard only blocks a single attack, which is like invincible defense for that single attack
    }
}
