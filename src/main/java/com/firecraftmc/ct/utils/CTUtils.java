package com.firecraftmc.ct.utils;

import com.firecraftmc.ct.enums.RoleType;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.game.RoleList;
import com.firecraftmc.ct.object.role.Role;
import com.firecraftmc.ct.object.game.Target;

public final class CTUtils {
    private CTUtils() {
    }
    
    public static Role createRoleInstance(RoleType roleType, Game game, Target... targets) {
        Role role = null;
        try {
            if (RoleList.ROLES_WITH_TARGETS.contains(roleType)) {
                if (targets != null) {
                    role = (Role) roleType.getClazz().getConstructor(Game.class, Target.class).newInstance(game, targets[0]);
                } 
            } else {
                role = (Role) roleType.getClazz().getConstructor(Game.class).newInstance(game);
            }
        } catch (Exception e) {}
        return role;
    }
}
