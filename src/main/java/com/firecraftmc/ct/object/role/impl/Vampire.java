package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Alignment;
import com.firecraftmc.ct.enums.Goal;
import com.firecraftmc.ct.enums.Immunity;
import com.firecraftmc.ct.enums.RoleType;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.game.Player;
import com.firecraftmc.ct.object.role.MythicalRole;

public class Vampire extends MythicalRole {
    
    private boolean youngest;
    
    public Vampire(Game game, Player player) {
        super(game, RoleType.VAMPIRE, player, 5, Alignment.CHAOS, Goal.CONVERT, "7B8867");
        
        addImmunities(Immunity.DETECTION);
        addAbilities("Convert others to Vampires at night.");
        addAttributes("Vampires vote at night to bite a target.", "The youngest Vampire will visit the target at night.");
        setKillMessage("{pronown} {verb} bitten by a {rolename}.");
    }
}
