package com.firecraftmc.ct.object.role.impl.town;

import com.firecraftmc.ct.enums.Alignment;
import com.firecraftmc.ct.enums.Attack;
import com.firecraftmc.ct.enums.Defense;
import com.firecraftmc.ct.enums.RoleType;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.game.Player;

public class Bodyguard extends TownRole {
    
    private boolean vestUsed;
    
    public Bodyguard(Game game, Player player) {
        super(game, RoleType.BODYGUARD, player, Attack.POWERFUL, Defense.NONE, 3, Alignment.PROTECTIVE);
        addAbilities("Protect a player from direct attacks at night.");
        addAttributes("If your target is directly attacked or is the victim of a harmful visit, you and the visitor will fight.", 
                "If you successfully protect someone you can still be Healed.");
        setProtectiveDefense(Defense.INVINCIBLE);
        setKillMessage("{pronown} {verb} killed by a {rolename}.");
    }
}
