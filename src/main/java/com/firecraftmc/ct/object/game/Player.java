package com.firecraftmc.ct.object.game;

import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.role.AbstractRole;

import java.util.Objects;

public class Player {
    private final String name;
    private Role role;
    private AbstractRole roleInstance;
    
    public Player(String name, Role role) {
        this.name = name;
        this.role = role;
    }
    
    public Player(String name) {
        this.name = name;
    }
    
    public Player(String name, Role role, AbstractRole roleInstance) {
        this(name, role);
        this.roleInstance = roleInstance;
    }
    
    public void setRole(Role role) {
        this.role = role;
    }
    
    public void setRoleInstance(AbstractRole roleInstance) {
        this.roleInstance = roleInstance;
    }
    
    public String getName() {
        return name;
    }
    
    public Role getRole() {
        return role;
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
