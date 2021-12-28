package com.firecraftmc.ct;

import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.game.Player;
import com.firecraftmc.ct.object.game.RoleList;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class CubeTown {
    public static void main(String[] args) {
        formatOut("Starting role determination test with %s simulated players.", 15);
        RoleList roleList = new RoleList(100);
        formatOut("Finished role list generation");
        List<Role> roles = roleList.getRoles();
        
        formatOut("Counting all roles and printing them out");
        Map<Role, Integer> roleCounts = new TreeMap<>();
        roles.forEach(role -> {
            if (roleCounts.containsKey(role)) {
                roleCounts.put(role, roleCounts.get(role) + 1);
            } else {
                roleCounts.put(role, 1);
            }
        });
        
        Set<Role> uniqueRoles = new HashSet<>();
        roleCounts.forEach((role, count) -> {
            if (!role.isUnique()) {
                formatOut(role.name() + ": " + count);
            } else {
                uniqueRoles.add(role);
            }
        });
        System.out.println("Unique Roles: " + uniqueRoles);
        
        Collections.shuffle(roles);
        formatOut("Randomized roles");
    
        System.out.println(roles.size());
        
        Queue<Role> roleQueue = new ArrayBlockingQueue<>(roles.size());
        roleQueue.addAll(roles);
        formatOut("Added roles to a First In First Out Queue.");
        
        formatOut("Generating simulated players and their roles.");
        List<Player> players = new LinkedList<>();
        
        for (int i = 1; i <= roles.size(); i++) {
            players.add(new Player("Player " + i, roleQueue.poll()));
        }
        
        formatOut("Finished player generation and now printing results.");
        for (Player player : players) {
            //System.out.println(player.getName() + " has the role " + player.getRole());
        }
    }
    
    public static void formatOut(String text, Object... args) {
        System.out.printf((text) + "%n", args);
    }
    
    //Process what would be a visit before any actions are taken and then produce messages/preventions based on role priority
}
