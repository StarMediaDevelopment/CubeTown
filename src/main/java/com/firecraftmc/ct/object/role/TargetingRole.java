package com.firecraftmc.ct.object.role;

import com.firecraftmc.ct.object.GameState;
import com.firecraftmc.ct.object.NightPhase;
import com.firecraftmc.ct.object.game.Target;
import javafx.stage.Stage;

@SuppressWarnings("unused")
public interface TargetingRole {
    Target getTarget();
    void setTarget(Target target);
    default boolean isAstral() {
        return false;
    }
    default boolean canTarget(GameState state, NightPhase nightPhase) {
        return state == GameState.NIGHT;
    }
    default boolean isValidTarget(GameState state, NightPhase nightPhase, Target target) {
        return true;
    }
}
