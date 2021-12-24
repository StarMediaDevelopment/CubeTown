package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Attack;
import com.firecraftmc.ct.enums.Defense;
import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.role.KillingRole;
import com.firecraftmc.ct.object.role.MafiaRole;

import java.util.List;

public class Mafioso extends MafiaRole implements KillingRole {
    public Mafioso() {
        super(Role.MAFIOSO, Attack.BASIC, Defense.NONE);
        //This gains control immunity when a godfather orders the mafioso 
        setPriority(5);
        
        this.abilities.add("Carry out the Godfather's orders.");
        this.attributes.addAll(List.of("You can attack if the Godfather doesn't give you orders.", "If the Godfather dies, you will become the next Godfather.", "You can talk with the other Mafia at night."));
    }
    
    public String getKillMessage() {
        return "{pronown} was killed by a member of the Mafia";
    }
}
