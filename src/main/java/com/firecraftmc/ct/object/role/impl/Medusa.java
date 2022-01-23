package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Attack;
import com.firecraftmc.ct.enums.Defense;
import com.firecraftmc.ct.enums.KillEffect;
import com.firecraftmc.ct.enums.RoleType;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.game.Player;
import com.firecraftmc.ct.object.role.CovenRole;

public class Medusa extends CovenRole {
    
    private int stoneGazes = 3;
    
    public Medusa(Game game, Player player) {
        super(game, RoleType.MEDUSA, player, Attack.POWERFUL, Defense.NONE, 5);
        addAbilities("You may choose to Stone Gaze all visitors at night.");
        addAttributes("You may choose to stone gaze thrice.",
                "With the Necronomicon, you may visit players and turn them to stone.");
        setKillMessage("{pronown} {verb} turned to stone by {rolename}");
    }
    
    @Override
    public void otherVisit(Game game, Player player) {
        game.killPlayer(this, player, KillEffect.STONED);
    }
    
    public int getPriority() {
        if (target.isSelf()) {
            return 3;
        }
        return priority;
    }
}
