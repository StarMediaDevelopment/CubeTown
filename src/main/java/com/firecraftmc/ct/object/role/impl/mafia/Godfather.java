package com.firecraftmc.ct.object.role.impl.mafia;

import com.firecraftmc.ct.enums.*;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.game.Player;
import com.firecraftmc.ct.object.role.MafiaRole;

public class Godfather extends MafiaRole {
    public Godfather(Game game, Player player) {
        super(game, RoleType.GODFATHER, player, Attack.BASIC, Defense.BASIC, 5, Alignment.KILLING);
        
        addImmunities(Immunity.DETECTION);
        addAbilities("You may choose to attack a player each night.");
        addAttributes("If there is a Mafioso he will attack the target instead of you.", 
                "You will appear to be innocent to the Sheriff.", 
                "You can talk with the other Mafia at night.");
        setKillMessage("{pronown} {verb} killed by a member of the Mafia.");
    }
}
