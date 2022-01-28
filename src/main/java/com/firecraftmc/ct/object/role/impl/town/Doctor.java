package com.firecraftmc.ct.object.role.impl.town;

import com.firecraftmc.ct.enums.Alignment;
import com.firecraftmc.ct.enums.Defense;
import com.firecraftmc.ct.enums.RoleType;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.game.Player;
import com.firecraftmc.ct.object.role.TownRole;

public class Doctor extends TownRole {
    
    private boolean selfHealUsed;
    
    public Doctor(Game game, Player player) {
        super(game, RoleType.DOCTOR, player, 3, Alignment.PROTECTIVE);
        
        addAbilities("Heal one person each night, granting them Powerful defense");
        addAttributes("You may only Heal yourself once.", "You will know if your target is attacked.");
        setProtectiveDefense(Defense.POWERFUL);
    }
}