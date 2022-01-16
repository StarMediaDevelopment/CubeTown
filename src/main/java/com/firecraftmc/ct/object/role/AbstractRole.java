package com.firecraftmc.ct.object.role;

import com.firecraftmc.ct.enums.*;
import com.firecraftmc.ct.object.game.Game;

import java.util.*;

public abstract class AbstractRole {
    
    protected final Game game;
    protected final RoleType type;
    protected Attack attack;
    protected Defense defense;
    protected int priority;
    protected FactionType faction;
    protected Alignment alignment;
    protected Goal goal;
    protected String color;
    protected Set<Immunity> immunities = new HashSet<>();
    protected List<String> abilities = new LinkedList<>();
    protected List<String> attributes = new LinkedList<>();
    
    public AbstractRole(Game game, RoleType type, Attack attack, Defense defense, int priority, FactionType faction, Alignment alignment, Goal goal, String color) {
        this.game = game;
        this.type = type;
        this.attack = attack;
        this.defense = defense;
        this.priority = priority;
        this.faction = faction;
        this.alignment = alignment;
        this.goal = goal;
        this.color = color;
    }
    
    public AbstractRole(Game game, RoleType type, int priority, FactionType faction, Alignment alignment, Goal goal, String color) {
        this(game, type, Attack.NONE, Defense.NONE, priority, faction, alignment, goal, color);
    }
    
    public RoleType getType() {
        return type;
    }
    
    public Attack getAttack() {
        return attack;
    }

    public Defense getDefense() {
        return defense;
    }

    public void setAttack(Attack attack) {
        this.attack = attack;
    }

    public void setDefense(Defense defense) {
        this.defense = defense;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }

    public Set<Immunity> getImmunities() {
        return immunities;
    }

    public List<String> getAbilities() {
        return abilities;
    }

    public List<String> getAttributes() {
        return attributes;
    }
    
    protected void addAbilities(String... abilities) {
        this.abilities.addAll(Arrays.asList(abilities));
    }
    
    protected void addAttributes(String... attributes) {
        this.attributes.addAll(Arrays.asList(attributes));
    }
    
    protected void addImmunities(Immunity... immunities) {
        this.immunities.addAll(Arrays.asList(immunities));
    }
    
    public Game getGame() {
        return game;
    }
    
    public FactionType getFaction() {
        return faction;
    }
    
    public Alignment getAlignment() {
        return alignment;
    }
    
    public Goal getGoal() {
        return goal;
    }
    
    public String getColor() {
        return color;
    }
}
