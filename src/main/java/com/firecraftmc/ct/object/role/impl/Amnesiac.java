package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Alignment;
import com.firecraftmc.ct.enums.Goal;
import com.firecraftmc.ct.enums.Immunity;
import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.role.AbstractRole;
import com.firecraftmc.ct.object.role.NeutralRole;
import com.firecraftmc.ct.object.role.TargetingRole;
import com.firecraftmc.ct.object.game.Target;

public class Amnesiac extends NeutralRole implements TargetingRole {
    
    private AbstractRole rememberedRole;
    private Target target;
    
    public Amnesiac(Game game) {
        super(game, Role.AMNESIAC, 6, Alignment.BENIGN, Goal.AMNESIAC, "44A6C6");
        addImmunities(Immunity.DETECTION);
        addAbilities("Remember who you were like by selecting a graveyard role.");
        addAttributes("When you choose a role it will be revealed to all the players in the game.");
    }
    
    public Target getTarget() {
        return target;
    }
    
    public void setTarget(Target target) {
        this.target = target;
    }
}
