package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Alignment;
import com.firecraftmc.ct.enums.Immunity;
import com.firecraftmc.ct.enums.RoleType;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.game.Player;
import com.firecraftmc.ct.object.role.TownRole;

public class Transporter extends TownRole {
    
    public Transporter(Game game, Player player) {
        super(game, RoleType.TRANSPORTER, player, 1, Alignment.SUPPORT);
        
        addImmunities(Immunity.CONTROL, Immunity.ROLEBLOCK);
        
        addAbilities("Choose two people to transport at night.");
        addAttributes("Transporting two people swaps all targets against them.", 
                "You may transport yourself.", "Your targets will know they were transported.");
    }
}
