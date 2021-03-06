package com.firecraftmc.ct.object.role.impl.apocalypse.acolyte;

import com.firecraftmc.ct.enums.RoleType;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.game.Player;

public class Mortician extends AcolyteRole {
    
    public Mortician(Game game, Player player) {
        super(game, RoleType.MORTICIAN, player, RoleType.DEATH, "A00000");
        
        addAbilities("Mark two players at night for burial.");
        addAttributes("Marks will last for two days and nights", "Players will not know they are marked", 
                "If a marked town member is lynched, you will transform into Death");
    }
}