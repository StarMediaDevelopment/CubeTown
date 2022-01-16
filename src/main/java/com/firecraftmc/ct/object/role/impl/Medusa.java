package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Attack;
import com.firecraftmc.ct.enums.Defense;
import com.firecraftmc.ct.enums.RoleType;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.role.CovenRole;

public class Medusa extends CovenRole {
    
    private int stoneGazes = 3;
    
    public Medusa(Game game) {
        super(game, RoleType.MEDUSA, Attack.POWERFUL, Defense.NONE, 5);
        addAbilities("You may choose to Stone Gaze all visitors at night.");
        addAttributes("You may choose to stone gaze thrice.", 
                "With the Necronomicon, you may visit players and turn them to stone.");
    }

    public int getPriority() {
        if (target.isSelf()) {
            return 3;
        }
        return priority;
    }
    
    public String getKillMessage() {
        return "{pronown} was turned to stone by {rolename}";
    }
}
