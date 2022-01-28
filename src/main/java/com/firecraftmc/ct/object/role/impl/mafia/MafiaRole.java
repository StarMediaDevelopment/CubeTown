package com.firecraftmc.ct.object.role.impl.mafia;

import com.firecraftmc.ct.enums.*;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.game.Player;
import com.firecraftmc.ct.object.game.Target;
import com.firecraftmc.ct.object.role.FactionRole;
import com.firecraftmc.ct.utils.CTUtils;

public abstract class MafiaRole extends FactionRole {
    
    public MafiaRole(Game game, RoleType type, Player player, Attack attack, Defense defense, int priority, Alignment alignment) {
        super(game, type, player, attack, defense, priority, FactionType.MAFIA, alignment, Goal.MAFIA);
        addWinConditions(FactionType.MAFIA, TypeRelation.WIN, 
                FactionType.TOWN, TypeRelation.KILL, 
                RoleType.ARSONIST, TypeRelation.KILL, 
                FactionType.COVEN, TypeRelation.KILL, 
                FactionType.APOCALYPSE, TypeRelation.KILL, 
                RoleType.JUGGERNAUT, TypeRelation.KILL, 
                RoleType.SERIAL_KILLER, TypeRelation.KILL, 
                RoleType.VAMPIRE, TypeRelation.KILL, 
                RoleType.WEREWOLF, TypeRelation.KILL);
    }
    
    public MafiaRole(Game game, RoleType type, Player player, int priority, Alignment alignment) {
        this(game, type, player, Attack.NONE, Defense.NONE, priority, alignment);
    }
    
    @Override
    public boolean isValidTarget(Game game, Target target) {
        return CTUtils.defaultTargetValid(target) && !(CTUtils.getTargetPlayerRoleInstance(game, target) instanceof MafiaRole);
    }
}
