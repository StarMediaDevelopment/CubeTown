package com.firecraftmc.ct.utils;

import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.game.RoleList;
import com.firecraftmc.ct.object.role.AbstractRole;
import com.firecraftmc.ct.object.game.Target;

public final class CTUtils {
    private CTUtils() {
    }
    
    public static AbstractRole createRoleInstance(Role role, Game game, Target... targets) {
        AbstractRole abstractRole = null;
        try {
            if (RoleList.ROLES_WITH_TARGETS.contains(role)) {
                if (targets != null) {
                    abstractRole = (AbstractRole) role.getClazz().getConstructor(Game.class, Target.class).newInstance(game, targets[0]);
                } 
            } else {
                abstractRole = (AbstractRole) role.getClazz().getConstructor(Game.class).newInstance(game);
            }
        } catch (Exception e) {}
        return abstractRole;
    }
}
