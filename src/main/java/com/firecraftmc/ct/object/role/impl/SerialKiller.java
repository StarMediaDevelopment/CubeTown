package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.*;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.role.AnarchyRole;

public class SerialKiller extends AnarchyRole {
    public SerialKiller(Game game) {
        super(game, RoleType.SERIAL_KILLER, Attack.BASIC, Defense.BASIC, 5, Alignment.KILLING, Goal.KILL_OPPOSE, "000080");
        
        addAbilities("You may choose to attack a player each night.");
        
        addAttributes("If you are role blocked you will attack the role blocker in addition to your target.", 
                "Role blockers that target you will have their last will covered in blood making it unreadable.", 
                "You can choose to be cautious and not kill role blockers.");
    }
    
    public String getKillMessage() {
        return "{pronown} was stabbed by a Serial Killer";
    }
}
