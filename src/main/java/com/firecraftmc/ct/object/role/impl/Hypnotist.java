package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Alignment;
import com.firecraftmc.ct.enums.RoleType;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.game.Player;
import com.firecraftmc.ct.object.role.MafiaRole;

public class Hypnotist extends MafiaRole {
    public Hypnotist(Game game, Player player) {
        super(game, RoleType.HYPNOTIST, player, 3, Alignment.DECEPTION);
        
        addAbilities("You may sneak into a players house at night and plant a memory.");
        addAttributes("A planted memory will confuse the player.", 
                "If there are no kill capable Mafia roles left you will become a Mafioso.");
    }
}
