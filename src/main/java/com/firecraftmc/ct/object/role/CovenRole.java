package com.firecraftmc.ct.object.role;

import com.firecraftmc.ct.enums.*;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.game.Player;
import com.firecraftmc.ct.object.game.Target;

public abstract class CovenRole extends FactionRole {
    
    protected boolean hasNecronomicon;
    
    public CovenRole(Game game, RoleType type, Player player, Attack attack, Defense defense, int priority) {
        super(game, type, player, attack, defense, priority, FactionType.COVEN, Alignment.EVIL, Goal.COVEN);
        addWinConditions(FactionType.COVEN);
    }
    
    public CovenRole(Game game, RoleType type, Player player, int priority) {
        this(game, type, player, Attack.NONE, Defense.NONE, priority);
    }
    
    @Override
    public boolean isValidTarget(GameState state, DayPhase dayPhase, NightPhase nightPhase, Target target) {
        boolean valid = state == GameState.NIGHT && target != null && !target.isSelf() && target.isAlive();
        Player targetPlayer = game.getPlayer(target.getName());
        return valid && !(targetPlayer.getRoleInstance() instanceof CovenRole);
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
