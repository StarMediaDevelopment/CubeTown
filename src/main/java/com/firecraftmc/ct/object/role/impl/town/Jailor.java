package com.firecraftmc.ct.object.role.impl.town;

import com.firecraftmc.ct.enums.Alignment;
import com.firecraftmc.ct.enums.Attack;
import com.firecraftmc.ct.enums.Defense;
import com.firecraftmc.ct.enums.RoleType;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.game.Player;
import com.firecraftmc.ct.object.role.TownRole;

public class Jailor extends TownRole {
    
    private int executions = 3;
    
    public Jailor(Game game, Player player) {
        super(game, RoleType.JAILOR, player, Attack.UNSTOPPABLE, Defense.NONE, 5, Alignment.KILLING);
        //Jailing is a day ability that happens before anything else, not covered by this priority system
        
        addAbilities("You may choose one person during the day to Jail for the night.");
        addAttributes("You may anonymously talk with your prisoner.", "You can choose to attack your prisoner.", "The jailed target can't perform their night ability.", "If you execute a Town member, you forfeit further executions.");
        setKillMessage("{pronown} {verb} executed by the {rolename}.");
    }
    
    public int getExecutions() {
        return executions;
    }
    
    public void setExecutions(int executions) {
        this.executions = executions;
    }
}
