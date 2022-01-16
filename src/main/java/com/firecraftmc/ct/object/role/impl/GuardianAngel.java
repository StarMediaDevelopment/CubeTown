package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Alignment;
import com.firecraftmc.ct.enums.Goal;
import com.firecraftmc.ct.enums.Immunity;
import com.firecraftmc.ct.enums.RoleType;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.role.NeutralRole;
import com.firecraftmc.ct.object.role.TargetingRole;
import com.firecraftmc.ct.object.game.Target;

public class GuardianAngel extends NeutralRole implements TargetingRole {
    
    private Target target;
    
    public GuardianAngel(Game game) {
        this(game, new Target("null", false));
    }
    
    public GuardianAngel(Game game, Target target) {
        super(game, RoleType.GUARDIAN_ANGEL, 2, Alignment.BENIGN, Goal.GUARDIAN_ANGEL, "c48a63");
        this.target = target;
        
        addImmunities(Immunity.DETECTION, Immunity.ROLEBLOCK);
        addAbilities("Keep your target alive.");
        addAttributes("Your target is " + target.getName(), 
                "If your target is killed you will become a Survivor without any bulletproof vests.", 
                "Three times a game you may Heal and Purge your target.", 
                "This may be done from the grave. Watching over a player ignores Jail.");
    }
    
    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }
}
