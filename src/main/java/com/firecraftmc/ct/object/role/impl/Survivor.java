package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Alignment;
import com.firecraftmc.ct.enums.Defense;
import com.firecraftmc.ct.enums.Goal;
import com.firecraftmc.ct.enums.RoleType;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.game.Player;
import com.firecraftmc.ct.object.role.NeutralRole;
import com.firecraftmc.ct.object.game.Target;

public class Survivor extends NeutralRole {
    
    private final int vests = 4;
    
    public Survivor(Game game, Player player) {
        super(game, RoleType.SURVIVOR, player, 3, Alignment.BENIGN, Goal.SURVIVOR, "C8C800");
        
        addAbilities("Put on a bulletproof vest at night.");
        addAttributes("Putting on a bulletproof vest gives you Basic defense.", 
                "You can only use the bulletproof vest 4 times.");
    }

    public void setTarget(Target target) {
        if (target.isSelf()) {
            this.target = target;
        } else {
            this.target = null;
        }
    }

    public Defense getDefense() {
        if (vests > 0) {
            return Defense.BASIC;
        }
        return Defense.NONE;
    }
    
    public int getVests() {
        return vests;
    }
}
