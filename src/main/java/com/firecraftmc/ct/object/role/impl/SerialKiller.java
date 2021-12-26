package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Attack;
import com.firecraftmc.ct.enums.Defense;
import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.role.AnarchyRole;

import java.util.List;

public class SerialKiller extends AnarchyRole {
    public SerialKiller(Game game) {
        super(game, Role.SERIAL_KILLER, Attack.BASIC, Defense.BASIC);
        setPriority(5);
        
        this.abilities.add("You may choose to attack a player each night.");
        
        this.attributes.addAll(List.of("If you are role blocked you will attack the role blocker in addition to your target.", 
                "Role blockers that target you will have their last will covered in blood making it unreadable.", 
                "You can choose to be cautious and not kill role blockers."));
    }
    
    public String getKillMessage() {
        return "{pronown} was stabbed by a Serial Killer";
    }
}
