package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Alignment;
import com.firecraftmc.ct.enums.Attack;
import com.firecraftmc.ct.enums.Defense;
import com.firecraftmc.ct.enums.RoleType;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.game.Player;
import com.firecraftmc.ct.object.role.TownRole;
import com.firecraftmc.ct.object.game.Target;

public class Crusader extends TownRole {
    
    private Target target;
    
    public Crusader(Game game, Player player) {
        super(game, RoleType.CRUSADER, player, Attack.BASIC, Defense.NONE, 3, Alignment.PROTECTIVE);
        addAbilities("Protect one person other than yourself during the night.");
        addAttributes("Grant your target Powerful defense", 
                "You will know if your target is attacked.", 
                "You attack one person who visits your target on the same night.", 
                "You do not attack vampires, but you do block their attacks.");
        setProtectiveDefense(Defense.POWERFUL);
        setKillMessage("{pronown} {verb} killed by a {rolename}.");
        //TODO Make not attack town
    }
}
