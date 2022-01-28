package com.firecraftmc.ct.object.role.impl.town;

import com.firecraftmc.ct.enums.Alignment;
import com.firecraftmc.ct.enums.Attack;
import com.firecraftmc.ct.enums.Defense;
import com.firecraftmc.ct.enums.RoleType;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.game.Player;

public class Trapper extends TownRole {
    
    public Trapper(Game game, Player player) {
        super(game, RoleType.TRAPPER, player, Attack.POWERFUL, Defense.NONE, 1, Alignment.PROTECTIVE);
        
        addAbilities("You may set up a Trap at another player's house");
        addAttributes("Traps take one day to build.", "Traps can be torn down by selecting yourself at night.", 
                "You may only have one Trap out at a time.");
        setProtectiveDefense(Defense.POWERFUL);
        setKillMessage("{pronown} {verb} killed by a {rolename}");
    }
}
