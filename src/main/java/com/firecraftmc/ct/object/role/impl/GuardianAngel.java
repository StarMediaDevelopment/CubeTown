package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Immunity;
import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.role.NeutralRole;
import com.firecraftmc.ct.object.role.TargetingRole;
import com.firecraftmc.ct.object.target.Target;

import java.util.List;

public class GuardianAngel extends NeutralRole implements TargetingRole {
    
    private Target target;
    
    public GuardianAngel(Game game, Target target) {
        super(game, Role.GUARDIAN_ANGEL);
        setPriority(2);
        this.target = target;
        
        this.immunities.addAll(List.of(Immunity.DETECTION, Immunity.ROLEBLOCK));
        this.abilities.add("Keep your target alive.");
        this.attributes.addAll(List.of("Your target is " + target.getName(), 
                "If your target is killed you will become a Survivor without any bulletproof vests.", 
                "Three times a game you may Heal and Purge your target.", 
                "This may be done from the grave. Watching over a player ignores Jail."));
    }
    
    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }
}
