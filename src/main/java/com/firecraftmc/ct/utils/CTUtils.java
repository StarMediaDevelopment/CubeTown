package com.firecraftmc.ct.utils;

import com.firecraftmc.ct.enums.RoleType;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.game.Player;
import com.firecraftmc.ct.object.game.RoleList;
import com.firecraftmc.ct.object.role.Role;
import com.firecraftmc.ct.object.game.Target;
import com.starmediadev.utils.helper.StringHelper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class CTUtils {
    
    private static Map<RoleType, String> roleColors = new HashMap<>();
    
    static {
        Game game = new Game(new RoleList(0), new ArrayList<>());
        Player player = new Player("Test");
        Target target = new Target(game, "Test");
        for (RoleType roleType : RoleType.values()) {
            Role role = createRoleInstance(roleType, game, player, target);
            roleColors.put(roleType, role.getColor());
        }
    }
    
    private CTUtils() {
    }
    
    public static Role createRoleInstance(RoleType roleType, Game game, Player player, Target... targets) {
        Role role = null;
        try {
            if (RoleList.ROLES_WITH_TARGETS.contains(roleType)) {
                if (targets != null) {
                    role = (Role) roleType.getClazz().getConstructor(Game.class, Player.class, Target.class).newInstance(game, player, targets[0]);
                } 
            } else {
                role = (Role) roleType.getClazz().getConstructor(Game.class, Player.class).newInstance(game, player);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return role;
    }
    
    public static String getRoleColor(RoleType roleType) {
        return roleColors.get(roleType);
    }
    
    public static String formatEnum(Enum<?> value) {
        return StringHelper.capitalizeEveryWord(value.name());
    }
}
