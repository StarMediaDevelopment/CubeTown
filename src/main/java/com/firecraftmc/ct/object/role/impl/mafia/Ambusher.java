package com.firecraftmc.ct.object.role.impl.mafia;

import com.firecraftmc.ct.enums.Alignment;
import com.firecraftmc.ct.enums.Attack;
import com.firecraftmc.ct.enums.Defense;
import com.firecraftmc.ct.enums.RoleType;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.game.Player;
import com.firecraftmc.ct.object.role.MafiaRole;

public class Ambusher extends MafiaRole {
    public Ambusher(Game game, Player player) {
        super(game, RoleType.AMBUSHER, player, Attack.BASIC, Defense.NONE, 1, Alignment.KILLING);
        addAbilities("You may choose to lie in wait outside your target's house");
        addAttributes("You will attack one player who visits your target.",
                "All players visiting your target will learn your name.", 
                "If there are no kill capable Mafia roles left you will become a Mafioso.");
        setKillMessage("{pronown} {verb} killed by an {rolename}");
    }
}
