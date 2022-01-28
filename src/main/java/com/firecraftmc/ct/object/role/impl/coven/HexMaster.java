package com.firecraftmc.ct.object.role.impl.coven;

import com.firecraftmc.ct.enums.Attack;
import com.firecraftmc.ct.enums.RoleType;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.game.Player;
import com.firecraftmc.ct.object.role.CovenRole;

public class HexMaster extends CovenRole {
    
    public HexMaster(Game game, Player player) {
        super(game, RoleType.HEX_MASTER, player, 3);
        
        addAbilities("You may choose to Hex a player each night.");
        addAttributes("With the Necronomicon you gain Astral and Basic attacks.", 
                "Players are still Hexed when you have the Necronomicon.");
        setKillMessage("{pronown} was hexed by the {rolename}.");
    }
    
    protected void neconomiconActions() {
        this.attack = Attack.BASIC;
    }
}