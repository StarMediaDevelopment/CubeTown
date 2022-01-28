package com.firecraftmc.ct.object.role.impl.town;

import com.firecraftmc.ct.enums.*;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.game.Player;
import com.firecraftmc.ct.object.role.TownRole;

public class Veteran extends TownRole {
    
    private int alerts = 3;
    
    public Veteran(Game game, Player player) {
        super(game, RoleType.VETERAN, player, Attack.POWERFUL, Defense.NONE, 1, Alignment.KILLING);
        
        addImmunities(Immunity.CONTROL, Immunity.ROLEBLOCK);
        
        addAbilities("Decide if you will go on alert.");
        addAttributes("While on alert you gain Basic Defense.", "While on alert, you will deliver a Powerful attack to anyone who visits you.", 
                "You can only go on alert 3 times.", "You cannot be role blocked.");
        setKillMessage("{pronown} {verb} killed by the {rolename}.");
    }
}
