package com.firecraftmc.ct.object.role;

import com.firecraftmc.ct.enums.*;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.game.Player;
import com.firecraftmc.ct.object.game.Target;
import com.firecraftmc.ct.utils.CTUtils;

public abstract class CovenRole extends FactionRole {
    
    protected boolean hasNecronomicon;
    
    public CovenRole(Game game, RoleType type, Player player, Attack attack, Defense defense, int priority) {
        super(game, type, player, attack, defense, priority, FactionType.COVEN, Alignment.EVIL, Goal.COVEN);
        addWinConditions(FactionType.TOWN, TypeRelation.KILL,
                RoleType.VAMPIRE, TypeRelation.KILL,
                RoleType.WEREWOLF, TypeRelation.KILL,
                FactionType.MAFIA, TypeRelation.KILL,
                FactionType.COVEN, TypeRelation.WIN,
                FactionType.APOCALYPSE, TypeRelation.KILL,
                RoleType.ARSONIST, TypeRelation.KILL,
                RoleType.JUGGERNAUT, TypeRelation.KILL,
                RoleType.SERIAL_KILLER, TypeRelation.KILL);
    }
    
    public CovenRole(Game game, RoleType type, Player player, int priority) {
        this(game, type, player, Attack.NONE, Defense.NONE, priority);
    }
    
    @Override
    public boolean isValidTarget(Game game, Target target) {
        return CTUtils.defaultTargetValid(target) && !(CTUtils.getTargetPlayerRoleInstance(game, target) instanceof CovenRole);
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
