package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.role.AbstractRole;
import com.firecraftmc.ct.object.role.NeutralRole;

public class Amnesiac extends NeutralRole {
    
    private AbstractRole rememberedRole;
    
    public Amnesiac() {
        super(Role.AMNESIAC);
        this.priority = 6;
    }
}
