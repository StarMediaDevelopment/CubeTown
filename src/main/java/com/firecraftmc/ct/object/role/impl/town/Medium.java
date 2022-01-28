package com.firecraftmc.ct.object.role.impl.town;

import com.firecraftmc.ct.enums.Alignment;
import com.firecraftmc.ct.enums.RoleType;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.game.Player;
import com.firecraftmc.ct.object.role.TownRole;

public class Medium extends TownRole {
    public Medium(Game game, Player player) {
        super(game, RoleType.MEDIUM, player, 0, Alignment.SUPPORT);
        addAbilities("You can speak to the dead at night.");
        addAttributes("When speaking to the dead, you will remain anonymous.", "You may only speak to a living person once");
    }
}
