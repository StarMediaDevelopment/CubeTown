package com.firecraftmc.ct.utils;

import com.firecraftmc.ct.enums.RoleType;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.game.RoleList;
import com.firecraftmc.ct.object.role.AbstractRole;
import com.firecraftmc.ct.object.game.Target;

public final class CTUtils {
    private CTUtils() {
    }
    
    public static AbstractRole createRoleInstance(RoleType roleType, Game game, Target... targets) {
        AbstractRole abstractRole = null;
        try {
            if (RoleList.ROLES_WITH_TARGETS.contains(roleType)) {
                if (targets != null) {
                    abstractRole = (AbstractRole) roleType.getClazz().getConstructor(Game.class, Target.class).newInstance(game, targets[0]);
                } 
            } else {
                abstractRole = (AbstractRole) roleType.getClazz().getConstructor(Game.class).newInstance(game);
            }
        } catch (Exception e) {}
        return abstractRole;
    }
}
