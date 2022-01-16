package com.firecraftmc.ct.object.game;

public class Target {
    
    protected String name;
    protected boolean isSelf;
    
    public Target(String name, boolean isSelf) {
        this.name = name;
        this.isSelf = isSelf;
    }
    
    public Target(String name) {
        this(name, false);
    }
    
    public boolean isSelf() {
        return isSelf;
    }
    
    public String getName() {
        return name;
    }
}
