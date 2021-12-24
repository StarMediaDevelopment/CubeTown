package com.firecraftmc.ct.object.role;

import com.firecraftmc.ct.enums.Defense;

public interface ProtectiveRole extends TargetingRole {
    String getKillMessage();
    Defense getTemporaryDefense();
}
