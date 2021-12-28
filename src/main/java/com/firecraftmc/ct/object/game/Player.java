package com.firecraftmc.ct.object.game;

import com.firecraftmc.ct.enums.Role;

public class Player {
    private String name;
    private Role role;
    
    public Player(String name, Role role) {
        this.name = name;
        this.role = role;
    }
    
    public String getName() {
        return name;
    }
    
    public Role getRole() {
        return role;
    }
}
