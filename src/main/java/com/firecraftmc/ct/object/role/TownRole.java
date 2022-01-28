package com.firecraftmc.ct.object.role;

import com.firecraftmc.ct.enums.*;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.game.Player;

public abstract class TownRole extends FactionRole {
    public TownRole(Game game, RoleType type, Player player, Attack attack, Defense defense, int priority, Alignment alignment) {
        super(game, type, player, attack, defense, priority, FactionType.TOWN, alignment, Goal.TOWN);
        addWinConditions(FactionType.TOWN, TypeRelation.WIN, 
                RoleType.VAMPIRE, TypeRelation.KILL, 
                RoleType.WEREWOLF, TypeRelation.KILL, 
                FactionType.MAFIA, TypeRelation.KILL, 
                FactionType.COVEN, TypeRelation.KILL, 
                FactionType.APOCALYPSE, TypeRelation.KILL, 
                RoleType.ARSONIST, TypeRelation.KILL, 
                RoleType.JUGGERNAUT, TypeRelation.KILL, 
                RoleType.SERIAL_KILLER, TypeRelation.KILL);
    }
    
    public TownRole(Game game, RoleType type, Player player, int priority, Alignment alignment) {
        this(game, type, player, Attack.NONE, Defense.NONE, priority, alignment);
    }
    
    
}
