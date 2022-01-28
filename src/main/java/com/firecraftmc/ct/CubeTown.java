package com.firecraftmc.ct;

import com.firecraftmc.ct.enums.BaseType;
import com.firecraftmc.ct.enums.FactionType;
import com.firecraftmc.ct.enums.RoleType;
import com.firecraftmc.ct.object.game.*;
import com.firecraftmc.ct.object.gui.MainRoleListGui;
import com.firecraftmc.ct.object.role.Role;
import com.firecraftmc.ct.utils.CTUtils;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class CubeTown /*extends Application*/ {
    
    //TODO Include Horseman of the Apocalypse at the end when processing names for horseman roles
    
    public void start(Stage stage) {
        new MainRoleListGui(stage);
    }
    
    public static void main(String[] args) {
        ///launch();
        //checkRoleWinConditions();
        printRolePriority();
    }
    
    public static void printRolePriority() {
        Map<Integer, Set<RoleType>> rolePriorities = new TreeMap<>();
        for (RoleType roleType : RoleType.values()) {
            try {
                int priority = CTUtils.getRolePriority(roleType);
                if (rolePriorities.containsKey(priority)) {
                    rolePriorities.get(priority).add(roleType);
                } else {
                    rolePriorities.put(priority, new HashSet<>(Collections.singleton(roleType)));
                }
            } catch (Exception e) {
                System.out.println("Problem getting priority for role " + roleType.name());
                e.printStackTrace();
            }
        }
    
        System.out.println(rolePriorities);
    }
    
    public static void checkRoleWinConditions() {
        Set<RoleType> spareTypes = EnumSet.of(RoleType.AMNESIAC, RoleType.EXECUTIONER, RoleType.GUARDIAN_ANGEL, RoleType.JESTER, RoleType.PIRATE);
        Set<FactionType> groupCoveredTypes = EnumSet.of(FactionType.TOWN, FactionType.MAFIA, FactionType.APOCALYPSE, FactionType.COVEN);
    
        List<String> outputLog = new LinkedList<>();
        
        Game game = new Game(RoleList.ALL_ROLES_LIST, new ArrayList<>());
        for (RoleType roleType : RoleType.values()) {
            Role role = CTUtils.createRoleInstance(roleType, game, new Player("Player"), new Target(game, "Target", false));
            
            for (RoleType value : RoleType.values()) {
                boolean typeCovered = false;
                for (WinCondition winCondition : role.getWinConditions()) {
                    BaseType baseType = winCondition.getBaseType();
                    if (baseType instanceof RoleType conditionRole) {
                        if (conditionRole == value) {
                            typeCovered = true;
                            break;
                        }
                    } else if (baseType instanceof FactionType conditionFaction) {
                        if (groupCoveredTypes.contains(conditionFaction)) {
                            if (CTUtils.getRoleFaction(value) == conditionFaction) {
                                typeCovered = true;
                                break;
                            }
                        }
                    }
                }
                
                if (spareTypes.contains(value)) {
                    typeCovered = true;
                }
                
                if (!typeCovered) {
                    outputLog.add("Role " + roleType + " does not cover " + value + " in the win conditions.");
                }
            }
        }
    
        Path logPath = Path.of("./", "output.log");
        try {
            Files.deleteIfExists(logPath);
            Files.createFile(logPath);
            
           Files.write(logPath, outputLog);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void formatOut(String text, Object... args) {
        //System.out.printf((text) + "%n", args);
    }
    
    //Process what would be a visit before any actions are taken and then produce messages/preventions based on role priority
}
