package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.role.MafiaRole;

import java.util.List;

public class Forger extends MafiaRole {
    public Forger() {
        super(Role.FORGER);
        setPriority(3);
        this.abilities.add("Choose a person and rewrite their last will at night.");
        this.attributes.addAll(List.of("If your target dies their last will is replaced with your forgery and their role will be shown as the role you select to forge.", 
                "You may only perform 3 forgeries."));
    }
}
