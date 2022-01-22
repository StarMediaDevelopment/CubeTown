package com.firecraftmc.ct.object.role;

import com.firecraftmc.ct.enums.*;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.game.Player;

public abstract class AnarchyRole extends FactionRole {
    
    public AnarchyRole(Game game, RoleType type, Player player, Attack attack, Defense defense, int priority, Alignment alignment, Goal goal, String color) {
        super(game, type, player, attack, defense, priority, FactionType.ANARCHY, alignment, goal, color);
    }
    
    public AnarchyRole(Game game, RoleType type, Player player, int priority, Alignment alignment, Goal goal, String color) {
        this(game, type, player, Attack.NONE, Defense.NONE, priority, alignment, goal, color);
    }
}
