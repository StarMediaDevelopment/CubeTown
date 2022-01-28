package com.firecraftmc.ct.object.role.impl.mythical;

import com.firecraftmc.ct.enums.*;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.game.Player;
import com.firecraftmc.ct.object.role.FactionRole;

public abstract class MythicalRole extends FactionRole {
    
    public MythicalRole(Game game, RoleType type, Player player, Attack attack, Defense defense, int priority, Alignment alignment, Goal goal, String color) {
        super(game, type, player, attack, defense, priority, FactionType.MYTHICAL, alignment, goal, color);
    }
    
    public MythicalRole(Game game, RoleType type, Player player, int priority, Alignment alignment, Goal goal, String color) {
        this(game, type, player, Attack.NONE, Defense.NONE, priority, alignment, goal, color);
    }
}
