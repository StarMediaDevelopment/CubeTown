package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Alignment;
import com.firecraftmc.ct.enums.Attack;
import com.firecraftmc.ct.enums.Defense;
import com.firecraftmc.ct.enums.RoleType;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.role.ProtectiveRole;
import com.firecraftmc.ct.object.role.TownRole;
import com.firecraftmc.ct.object.game.Target;

public class Crusader extends TownRole implements ProtectiveRole {
    
    private Target target;
    
    public Crusader(Game game) {
        super(game, RoleType.CRUSADER, Attack.BASIC, Defense.NONE, 3, Alignment.PROTECTIVE);
        addAbilities("Protect one person other than yourself during the night.");
        addAttributes("Grant your target Powerful defense", 
                "You will know if your target is attacked.", 
                "You attack one person who visits your target on the same night.", 
                "You do not attack vampires, but you do block their attacks.");
        
        //TODO Make not attack town
    }
    
    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }
    
    public String getKillMessage() {
        return "{pronown} {verb} killed by a {rolename}.";
    }
    
    public Defense getTemporaryDefense() {
        return Defense.POWERFUL;
    }
}
