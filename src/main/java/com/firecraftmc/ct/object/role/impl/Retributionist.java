package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Alignment;
import com.firecraftmc.ct.enums.Immunity;
import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.role.TargetingRole;
import com.firecraftmc.ct.object.role.TownRole;
import com.firecraftmc.ct.object.game.Target;

public class Retributionist extends TownRole implements TargetingRole {
    
    private Target target;
    //Retributionists can use dead town members as much as they want
    
    public Retributionist(Game game) {
        super(game, Role.RETRIBUTIONIST, 1, Alignment.SUPPORT);
        addImmunities(Immunity.ROLEBLOCK, Immunity.CONTROL);
        addAbilities("You may raise a dead Town member and use their ability on a player.");
        addAttributes("Create zombies from dead true-hearted Town players.",
                "Use their abilities on your second target.");
    }
    
    public Target getTarget() {
        return target;
    }
    
    public void setTarget(Target target) {
        this.target = target;
    }
}
