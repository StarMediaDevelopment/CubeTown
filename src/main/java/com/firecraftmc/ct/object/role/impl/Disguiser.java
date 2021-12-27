package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Alignment;
import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.role.MafiaRole;

import java.util.Arrays;

public class Disguiser extends MafiaRole {
    public Disguiser(Game game) {
        super(game, Role.DISGUISER, 5, Alignment.DECEPTION);
        addAbilities("Disguise a mafia member as a non-mafia member to alter their identiy.");
        addAttributes("The disguised Mafia member will appear to have the same role as the non-mafia member to the Investigator and Sheriff.", 
                "Your disguised Mafia member will appear to be the other person to a Lookout.", 
                "When disguised as a Town member, Mafia visits are disregarded by Spy.");
    }
}
