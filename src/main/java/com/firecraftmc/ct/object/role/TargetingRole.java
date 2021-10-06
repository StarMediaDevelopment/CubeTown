package com.firecraftmc.ct.object.role;

import com.firecraftmc.ct.object.GameState;
import com.firecraftmc.ct.object.NightPhase;
import com.firecraftmc.ct.object.target.Target;

public interface TargetingRole {
    Target getTarget();
    void setTarget(Target target);
    default boolean isAstral() {
        return false;
    }
    default boolean canTarget(GameState state, NightPhase nightPhase) {
        return state == GameState.NIGHT;
    }
}
