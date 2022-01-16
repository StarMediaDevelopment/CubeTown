package com.firecraftmc.ct.object.game;

import com.firecraftmc.ct.enums.FactionType;
import com.firecraftmc.ct.enums.RoleType;
import com.firecraftmc.ct.exceptions.GameInitException;
import com.firecraftmc.ct.object.role.AbstractRole;
import com.firecraftmc.ct.utils.CTUtils;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class Game {
    
    private final RoleList roleList;
    private final int totalPlayerCount;
    
    private Map<Integer, Player> players = new TreeMap<>();
    
    private int apocalypseFactionCount;
    private boolean hasGodfather;
    
    public Game(RoleList roleList, List<Player> players) {
        this.roleList = roleList;
        this.totalPlayerCount = roleList.size();
        
        if (players.size() != totalPlayerCount) {
            throw new GameInitException("Provided player count " + players.size() + " does not match total generated roles " + totalPlayerCount);
        }
        
        int playerCounter = 1;
        Collections.shuffle(players);
        for (Player player : players) {
            this.players.put(playerCounter, player);
            playerCounter++;
        }
    
        for (RoleType roleType : roleList.getRoles()) {
            if (roleType == RoleType.GODFATHER) {
                hasGodfather = true;
            }
        
            if (RoleList.ACOLYTE_ROLE_TYPES.contains(roleType)) {
                apocalypseFactionCount++;
            }
        }
    }
    
    public void assignRoles() {
        Queue<Player> playerQueue = new ArrayBlockingQueue<>(players.size());
        List<Player> players = new LinkedList<>(this.players.values());
        Collections.shuffle(players);
        playerQueue.addAll(players);
        for (RoleType roleType : this.roleList) {
            Player player = playerQueue.poll();
            player.setRole(roleType);
        }
    }
    
    public void initializeRoles() {
        List<Player> initLast = new ArrayList<>();
    
        for (Player player : this.players.values()) {
            if (RoleList.ROLES_WITH_TARGETS.contains(player.getRole())) {
                initLast.add(player);
            } else {
                player.setRoleInstance(CTUtils.createRoleInstance(player.getRole(), this, null));
            }
        }
        
        if (!initLast.isEmpty()) {
            List<Player> validExeTargets = new ArrayList<>();
            List<Player> validGATargets = new ArrayList<>();
    
            for (Player player : this.players.values()) {
                AbstractRole role = player.getRoleInstance();
                if (role != null) {
                    if (role.getFaction() == FactionType.TOWN) {
                        if (player.getRole() != RoleType.MAYOR && player.getRole() != RoleType.JAILOR) {
                            validExeTargets.add(player);
                        }
                    }
    
                    if (role.getFaction() != FactionType.APOCALYPSE && player.getRole() != RoleType.JESTER) {
                        validGATargets.add(player);
                    }
                }
            }
            
            for (Player player : initLast) {
                Target target;
                if (player.getRole() == RoleType.GUARDIAN_ANGEL) {
                    target = new Target(validGATargets.get(new Random().nextInt(validGATargets.size())).getName());
                } else if (player.getRole() == RoleType.EXECUTIONER) {
                    target = new Target(validExeTargets.get(new Random().nextInt(validExeTargets.size())).getName());
                } else {
                    throw new GameInitException("Could not determine a target for player " + player.getName());
                }
                
                player.setRoleInstance(CTUtils.createRoleInstance(player.getRole(), this, target));
            }
        }
    }
    
    public void setApocalypseFactionCount(int apocalypseFactionCount) {
        this.apocalypseFactionCount = apocalypseFactionCount;
    }
    
    public void setHasGodfather(boolean hasGodfather) {
        this.hasGodfather = hasGodfather;
    }
    
    public int getApocalypseFactionCount() {
        return apocalypseFactionCount;
    }
    
    public boolean hasGodfather() {
        return hasGodfather;
    }
    
    public RoleList getRoleList() {
        return roleList;
    }
    
    public Map<Integer, Player> getPlayers() {
        return players;
    }
}
