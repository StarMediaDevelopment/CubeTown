package com.firecraftmc.ct.object.role;

import com.firecraftmc.ct.enums.Attack;
import com.firecraftmc.ct.enums.Defense;
import com.firecraftmc.ct.enums.Role;

public abstract class AbstractRole {
    
    protected final Role type;
    protected Attack attack;
    protected Defense defense;
    protected int priority;
    
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
}
