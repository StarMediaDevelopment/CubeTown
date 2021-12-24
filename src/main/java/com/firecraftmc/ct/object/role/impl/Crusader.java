package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Attack;
import com.firecraftmc.ct.enums.Defense;
import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.role.ProtectiveRole;
import com.firecraftmc.ct.object.role.TargetingRole;
import com.firecraftmc.ct.object.role.TownRole;
import com.firecraftmc.ct.object.target.Target;

public class Crusader extends TownRole implements ProtectiveRole {
    
    private Target target;
    
    public Crusader() {
        super(Role.CRUSADER, Attack.BASIC, Defense.NONE);
        setPriority(3);
        addAbilities("Protect one person other than yourself during the night.");
        addAttributes("Grant your target Powerful defense", 
                "You will know if your target is attacked.", 
                "You attack one person who visits your target on the same night.", 
                "You do not attack vampires, but you do block their attacks.");
        
        //Make not attack town
    }
    
    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }
    
    public String getKillMessage() {
        return "{pronown} was killed by a Crusader";
    }
    
    public Defense getTemporaryDefense() {
        return Defense.POWERFUL;
    }
}
