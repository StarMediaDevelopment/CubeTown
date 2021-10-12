package com.firecraftmc.ct.object.role;

import com.firecraftmc.ct.enums.Attack;
import com.firecraftmc.ct.enums.Defense;
import com.firecraftmc.ct.enums.Immunity;
import com.firecraftmc.ct.enums.Role;

import java.util.*;

public abstract class AbstractRole {
    
    protected final Role type;
    protected Attack attack;
    protected Defense defense;
    protected int priority;
    protected Set<Immunity> immunities = new HashSet<>();
    protected List<String> abilities = new LinkedList<>();
    protected List<String> attributes = new LinkedList<>();
    
    public AbstractRole(Role type) {
        this(type, Attack.NONE, Defense.NONE);
    }
    
    public AbstractRole(Role type, int priority) {
        this(type, Attack.NONE, Defense.NONE, priority);
    }

    public AbstractRole(Role type, Attack attack, Defense defense) {
        this(type, attack, defense, -1);
    }

    public AbstractRole(Role type, Attack attack, Defense defense, int priority) {
        this.type = type;
        this.attack = attack;
        this.defense = defense;
        this.priority = priority;
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
