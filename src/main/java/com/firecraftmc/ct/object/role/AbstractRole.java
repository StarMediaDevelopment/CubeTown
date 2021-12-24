package com.firecraftmc.ct.object.role;

import com.firecraftmc.ct.enums.Attack;
import com.firecraftmc.ct.enums.Defense;
import com.firecraftmc.ct.enums.Immunity;
import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.game.Game;

import java.util.*;

public abstract class AbstractRole {
    
    protected final Game game;
    protected final Role type;
    protected Attack attack;
    protected Defense defense;
    protected int priority;
    protected Set<Immunity> immunities = new HashSet<>();
    protected List<String> abilities = new LinkedList<>();
    protected List<String> attributes = new LinkedList<>();
    
    public AbstractRole(Game game, Role type) {
        this(game, type, Attack.NONE, Defense.NONE);
    }
    
    public AbstractRole(Game game, Role type, int priority) {
        this(game, type, Attack.NONE, Defense.NONE, priority);
    }
    
    public AbstractRole(Game game, Role type, Attack attack, Defense defense) {
        this(game, type, attack, defense, -1);
    }
    
    public AbstractRole(Game game, Role type, Attack attack, Defense defense, int priority) {
        this.game = game;
        this.type = type;
        this.attack = attack;
        this.defense = defense;
        this.priority = priority;
    }
    
    @Deprecated
    public AbstractRole(Role type) {
        this(null, type, Attack.NONE, Defense.NONE);
    }
    
    @Deprecated
    public AbstractRole(Role type, int priority) {
        this(null, type, Attack.NONE, Defense.NONE, priority);
    }

    @Deprecated
    public AbstractRole(Role type, Attack attack, Defense defense) {
        this(null, type, attack, defense, -1);
    }

    @Deprecated
    public AbstractRole(Role type, Attack attack, Defense defense, int priority) {
        this(null, type, attack, defense, priority);
    }

    public Role getType() {
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
}
