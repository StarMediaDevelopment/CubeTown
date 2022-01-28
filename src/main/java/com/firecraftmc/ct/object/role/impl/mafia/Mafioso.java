package com.firecraftmc.ct.object.role.impl.mafia;

import com.firecraftmc.ct.enums.*;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.game.Player;
import com.firecraftmc.ct.object.role.MafiaRole;

public class Mafioso extends MafiaRole {
    public Mafioso(Game game, Player player) {
        super(game, RoleType.MAFIOSO, player, Attack.BASIC, Defense.NONE, 5, Alignment.DECEPTION);
        
        if (game.hasGodfather()) {
            addImmunities(Immunity.CONTROL);
        }
        
        addAbilities("Carry out the Godfather's orders.");
        addAttributes("You can attack if the Godfather doesn't give you orders.", "If the Godfather dies, you will become the next Godfather.", "You can talk with the other Mafia at night.");
        setKillMessage("{pronown} {verb} killed by a member of the Mafia");
    }
}
