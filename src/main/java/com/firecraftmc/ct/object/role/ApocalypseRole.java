package com.firecraftmc.ct.object.role;

import com.firecraftmc.ct.enums.*;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.game.Player;

public abstract class ApocalypseRole extends FactionRole {
    
    public ApocalypseRole(Game game, RoleType type, Player player, Attack attack, Defense defense, int priority, Alignment alignment, String color) {
        super(game, type, player, attack, defense, priority, FactionType.APOCALYPSE, alignment, Goal.APOCALYPSE, color);
        addWinConditions(FactionType.TOWN, TypeRelation.KILL,
                RoleType.VAMPIRE, TypeRelation.KILL,
                RoleType.WEREWOLF, TypeRelation.KILL,
                FactionType.MAFIA, TypeRelation.KILL,
                FactionType.COVEN, TypeRelation.KILL,
                FactionType.APOCALYPSE, TypeRelation.WIN,
                RoleType.ARSONIST, TypeRelation.KILL,
                RoleType.JUGGERNAUT, TypeRelation.KILL,
                RoleType.SERIAL_KILLER, TypeRelation.KILL);
    }
    
    public ApocalypseRole(Game game, RoleType type, Player player, int priority, Alignment alignment, String color) {
        this(game, type, player, Attack.NONE, Defense.NONE, priority, alignment, color);
    }
}
