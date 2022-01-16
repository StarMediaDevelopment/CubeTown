package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.RoleType;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.role.AcolyteRole;

public class General extends AcolyteRole {
    
    public General(Game game) {
        super(game, RoleType.GENERAL, RoleType.WAR, "00BFBF"); 
        
        addAbilities("Choose 2 people each n ight to mark as a foe.");
        addAttributes("The 2 people will not be notified that they have been marked as a foe.", 
                "Being marked as a foe will last for 2 nights.", 
                "When 3 marked foes die, you will become War.");
    }
}