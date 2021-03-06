package com.firecraftmc.ct.object.role.impl.neutral;

import com.firecraftmc.ct.enums.*;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.game.Player;
import com.firecraftmc.ct.object.role.FactionRole;

public abstract class NeutralRole extends FactionRole {
    
    public NeutralRole(Game game, RoleType type, Player player, Attack attack, Defense defense, int priority, Alignment alignment, Goal goal, String color) {
        super(game, type, player, attack, defense, priority, FactionType.NEUTRAL, alignment, goal, color);
        setBlocksGame(false);
        addWinConditions(FactionType.TOWN, TypeRelation.WIN,
                FactionType.MAFIA, TypeRelation.WIN,
                FactionType.COVEN, TypeRelation.WIN,
                FactionType.APOCALYPSE, TypeRelation.WIN);
    }
    
    public NeutralRole(Game game, RoleType type, Player player, int priority, Alignment alignment, Goal goal, String color) {
        this(game, type, player, Attack.NONE, Defense.NONE, priority, alignment, goal, color);
    }
}
