package com.firecraftmc.ct.object.game;

public class Visit {
    private final Player player;
    private final Target target;
    
    public Visit(Player player, Target target) {
        this.player = player;
        this.target = target;
    }
    
    public Player getPlayer() {
        return player;
    }
    
    public Target getTarget() {
        return target;
    }
}