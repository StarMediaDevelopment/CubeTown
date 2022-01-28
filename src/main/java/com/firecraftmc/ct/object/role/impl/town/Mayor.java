package com.firecraftmc.ct.object.role.impl.town;

import com.firecraftmc.ct.enums.Alignment;
import com.firecraftmc.ct.enums.RoleType;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.game.Player;
import com.firecraftmc.ct.object.game.Target;
import com.firecraftmc.ct.object.role.TownRole;

public class Mayor extends TownRole {
    
    private Target target;
    
    public Mayor(Game game, Player player) {
        super(game, RoleType.MAYOR, player, 0, Alignment.SUPPORT);
        
        addAbilities("You may reveal yourself as the Mayor of the Town.");
        addAttributes("Once you have revealed yourself as Mayor your vote counts as 3 votes.", 
                "You may not be healed once you have revealed yourself", 
                "Once revealed, you can't whisper or be whispered to.");
    }

    public void setTarget(Target target) {
        if (target.isSelf()) {
            this.target = target;
        } else {
            this.target = null;
        }
    }
}