package com.firecraftmc.ct.object.role;

import com.firecraftmc.ct.enums.*;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.target.Target;

public abstract class CovenRole extends FactionRole implements KillingRole {
    
    protected boolean hasNecronomicon;
    protected Target target;
    
    public CovenRole(Game game, Role type, Attack attack, Defense defense, int priority) {
        super(game, type, attack, defense, priority, Faction.COVEN, Alignment.EVIL, Goal.COVEN, true);
    }
    
    public CovenRole(Game game, Role type, int priority) {
        this(game, type, Attack.NONE, Defense.NONE, priority);
    }

    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }
    
    protected void neconomiconActions() {
        
    }
    
    public void setHasNecronomicon(boolean value) {
        this.hasNecronomicon = value;
        
        if (hasNecronomicon) {
            this.immunities.add(Immunity.DETECTION);
            neconomiconActions();
        } else {
            this.immunities.remove(Immunity.DETECTION);
        }
    }
}
