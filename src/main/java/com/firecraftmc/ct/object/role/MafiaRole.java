package com.firecraftmc.ct.object.role;

import com.firecraftmc.ct.enums.*;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.game.Player;

public abstract class MafiaRole extends FactionRole {
    
    public MafiaRole(Game game, RoleType type, Player player, Attack attack, Defense defense, int priority, Alignment alignment) {
        super(game, type, player, attack, defense, priority, FactionType.MAFIA, alignment, Goal.MAFIA);
    }
    
    public MafiaRole(Game game, RoleType type, Player player, int priority, Alignment alignment) {
        this(game, type, player, Attack.NONE, Defense.NONE, priority, alignment);
    }
}
