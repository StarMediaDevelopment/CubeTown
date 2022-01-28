package com.firecraftmc.ct.object.role.impl.mafia;

import com.firecraftmc.ct.enums.Alignment;
import com.firecraftmc.ct.enums.RoleType;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.game.Player;

public class Forger extends MafiaRole {
    public Forger(Game game, Player player) {
        super(game, RoleType.FORGER, player, 3, Alignment.DECEPTION);
        addAbilities("Choose a person and rewrite their last will at night.");
        addAttributes("If your target dies their last will is replaced with your forgery and their role will be shown as the role you select to forge.", 
                "You may only perform 3 forgeries.");
    }
}
