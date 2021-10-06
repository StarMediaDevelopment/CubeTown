package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.role.CovenRole;
import com.firecraftmc.ct.object.target.Target;

import java.util.ArrayList;
import java.util.List;

public class HexMaster extends CovenRole {
    
    private List<Target> hexedTargets = new ArrayList<>();
    
    public HexMaster() {
        super(Role.HEX_MASTER);
    }
}
