package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Alignment;
import com.firecraftmc.ct.enums.Defense;
import com.firecraftmc.ct.enums.RoleType;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.role.ProtectiveRole;
import com.firecraftmc.ct.object.role.TownRole;
import com.firecraftmc.ct.object.game.Target;

public class Doctor extends TownRole implements ProtectiveRole {
    
    private Target target;
    
    public Doctor(Game game) {
        super(game, RoleType.DOCTOR, 3, Alignment.PROTECTIVE);
        
        addAbilities("Heal one person each night, granting them Powerful defense");
        addAttributes("You may only Heal yourself once.", "You will know if your target is attacked.");
    }
    
    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }
    
    public String getKillMessage() {
        return null;
    }
    
    public Defense getTemporaryDefense() {
        return Defense.POWERFUL;
    }
}
