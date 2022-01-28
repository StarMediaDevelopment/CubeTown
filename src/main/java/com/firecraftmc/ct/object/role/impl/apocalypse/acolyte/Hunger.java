package com.firecraftmc.ct.object.role.impl.apocalypse.acolyte;

import com.firecraftmc.ct.enums.RoleType;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.game.Player;

public class Hunger extends AcolyteRole {
    
    public Hunger(Game game, Player player) {
        super(game, RoleType.HUNGER, player, RoleType.FAMINE, "BFBF80");
        addAbilities("Choose someone at night to starve.");
        addAttributes("Starving will stop the target from using their night ability.", 
                "Starving will last until your death or transformation", "Starving bypasses roleblock immunity", "Starve 4 players to become Famine.");
        setRoleblocksOthers(true);
    }
}