package com.firecraftmc.ct.object.role;

import com.firecraftmc.ct.enums.*;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.game.Player;

public abstract class FactionRole extends Role {
    
    public FactionRole(Game game, RoleType type, Player player, Attack attack, Defense defense, int priority, FactionType faction, Alignment alignment, Goal goal, String color) {
        super(game, type, player, attack, defense, priority, faction, alignment, goal, color);
    }
    
    public FactionRole(Game game, RoleType type, Player player, Attack attack, Defense defense, int priority, FactionType faction, Alignment alignment, Goal goal) {
        super(game, type, player, attack, defense, priority, faction, alignment, goal, faction.getColor());
    }
    
    public FactionRole(Game game, RoleType type, Player player, int priority, FactionType faction, Alignment alignment, Goal goal, String color) {
        this(game, type, player, Attack.NONE, Defense.NONE, priority, faction, alignment, goal, color);
    }
}
