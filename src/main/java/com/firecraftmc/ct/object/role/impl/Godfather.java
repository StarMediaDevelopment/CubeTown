package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Attack;
import com.firecraftmc.ct.enums.Defense;
import com.firecraftmc.ct.enums.Immunity;
import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.role.KillingRole;
import com.firecraftmc.ct.object.role.MafiaRole;

import java.util.List;

public class Godfather extends MafiaRole implements KillingRole {
    public Godfather() {
        super(Role.GODFATHER, Attack.BASIC, Defense.BASIC);
        setPriority(5);
        
        this.immunities.add(Immunity.DETECTION);
        this.abilities.add("You may choose to attack a player each night.");
        this.attributes.addAll(List.of("If there is a Mafioso he will attack the target instead of you.", 
                "You will appear to be innocent to the Sheriff.", 
                "YOu can talk with the other Mafia at night."));
    }
    
    public String getKillMessage() {
        return "{pronown} was killed by a member of the Mafia.";
    }
}
