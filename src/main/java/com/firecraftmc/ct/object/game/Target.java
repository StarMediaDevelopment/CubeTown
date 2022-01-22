package com.firecraftmc.ct.object.game;

import java.util.Objects;

public class Target {
    
    protected final Game game;
    protected final String name;
    protected final boolean isSelf;
    
    protected Player playerCache;
    
    public Target(Game game, String name, boolean isSelf) {
        this.game = game;
        this.name = name;
        this.isSelf = isSelf;
    }
    
    public Target(Game game, String name) {
        this(game, name, false);
    }
    
    public boolean isSelf() {
        return isSelf;
    }
    
    public String getName() {
        return name;
    }
    
    public Game getGame() {
        return game;
    }
    
    public boolean isAlive() {
        if (playerCache == null) {
            playerCache = game.getPlayer(name);
        }
        
        if (playerCache == null) {
            throw new IllegalArgumentException("Target " + name + " is invalid.");
        }
        
        return playerCache.isAlive();
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Target target = (Target) o;
        return isSelf == target.isSelf && Objects.equals(name, target.name);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(name, isSelf);
    }
}
