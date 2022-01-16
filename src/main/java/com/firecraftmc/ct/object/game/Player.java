package com.firecraftmc.ct.object.game;

import com.firecraftmc.ct.enums.RoleType;
import com.firecraftmc.ct.object.role.AbstractRole;

import java.util.Objects;

public class Player {
    private final String name;
    private RoleType roleType;
    private AbstractRole roleInstance;
    
    public Player(String name, RoleType roleType) {
        this.name = name;
        this.roleType = roleType;
    }
    
    public Player(String name) {
        this.name = name;
    }
    
    public Player(String name, RoleType roleType, AbstractRole roleInstance) {
        this(name, roleType);
        this.roleInstance = roleInstance;
    }
    
    public void setRole(RoleType roleType) {
        this.roleType = roleType;
    }
    
    public void setRoleInstance(AbstractRole roleInstance) {
        this.roleInstance = roleInstance;
    }
    
    public String getName() {
        return name;
    }
    
    public RoleType getRole() {
        return roleType;
    }
    
    public AbstractRole getRoleInstance() {
        return roleInstance;
    }
    
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Player player = (Player) o;
        return Objects.equals(name, player.name);
    }
    
    public int hashCode() {
        return Objects.hash(name);
    }
}
