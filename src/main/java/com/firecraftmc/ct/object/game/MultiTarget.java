package com.firecraftmc.ct.object.game;

public class MultiTarget extends Target{
    
    private String secondName;
    
    public MultiTarget(Game game, String name, String secondName) {
        super(game, name, false);
        this.secondName = secondName;
    }
    
    public String getSecondName() {
        return secondName;
    }
}
