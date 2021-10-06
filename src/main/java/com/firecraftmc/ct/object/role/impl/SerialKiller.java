package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Attack;
import com.firecraftmc.ct.enums.Defense;
import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.role.AnarchyRole;

public class SerialKiller extends AnarchyRole {
    public SerialKiller() {
        super(Role.SERIAL_KILLER, Attack.BASIC, Defense.BASIC);
    }
}
