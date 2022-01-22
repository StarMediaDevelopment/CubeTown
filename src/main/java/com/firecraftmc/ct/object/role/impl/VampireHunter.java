package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Alignment;
import com.firecraftmc.ct.enums.Immunity;
import com.firecraftmc.ct.enums.RoleType;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.game.Player;
import com.firecraftmc.ct.object.role.TownRole;
import com.firecraftmc.ct.object.game.Target;

public class VampireHunter extends TownRole {
    
    private Target target;
    
    public VampireHunter(Game game, Player player) {
        super(game, RoleType.VAMPIRE_HUNTER, player, 5, Alignment.KILLING);
        
        addImmunities(Immunity.BITE);
        
        addAbilities("Check for Vampires each night.");
        addAttributes("If you visit a Vampire you will attack them", "If a Vampire visits you, you will attack them.", 
                "You can hear Vampires at night", "If all Vampires die, you will become a Vigilante with one bullet.");
        setKillMessage("{pronown} {verb} staked by a {rolename}");
    }
}
