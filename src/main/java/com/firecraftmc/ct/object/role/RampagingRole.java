package com.firecraftmc.ct.object.role;

public interface RampagingRole extends KillingRole {
    default boolean rampages() {
        return true;
    }
}
