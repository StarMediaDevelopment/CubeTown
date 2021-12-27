package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.*;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.role.NeutralRole;
import com.firecraftmc.ct.object.role.TargetingRole;
import com.firecraftmc.ct.object.target.Target;

import java.util.List;

public class Pirate extends NeutralRole implements TargetingRole {
    
    private Target target;
    
    public Pirate(Game game) {
        super(game, Role.PIRATE, Attack.POWERFUL, Defense.NONE, 1, Alignment.KILLING, Goal.PIRATE, "DBAD59");
        
        addImmunities(Immunity.CONTROL, Immunity.DETECTION, Immunity.ROLEBLOCK);
        
        addAbilities("Choose a player to plunder each night.");
        addAttributes("When you plunder a player, you will duel the player for their valuables.", 
                "If the player defends against your attack, you get no loot.");
    }

    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }
}
