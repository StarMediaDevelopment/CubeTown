package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Alignment;
import com.firecraftmc.ct.enums.Immunity;
import com.firecraftmc.ct.enums.RoleType;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.game.Player;
import com.firecraftmc.ct.object.role.MafiaRole;

public class Consort extends MafiaRole {
    public Consort(Game game, Player player) {
        super(game, RoleType.CONSORT, player, 2, Alignment.SUPPORT);
        addAbilities("Distract someone each night.");
        addAttributes("Distraction blocks your target from using their role's night ability.",
                "If there are no kill capable Mafia roles left you will become a Mafioso.",
                "You can talk with the other Mafia at night.");
        addImmunities(Immunity.ROLEBLOCK);
    }
}
