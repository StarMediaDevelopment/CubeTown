package com.firecraftmc.ct.object.role;

import com.firecraftmc.ct.enums.Attack;
import com.firecraftmc.ct.enums.Defense;
import com.firecraftmc.ct.enums.Role;

public abstract class AbstractRole {
    
    protected final Role type;
    protected Attack attack;
    protected Defense defense;
    
    public AbstractRole(Role type) {
        this(type, Attack.NONE, Defense.NONE);
    }

    public AbstractRole(Role type, Attack attack, Defense defense) {
        this.type = type;
        this.attack = attack;
        this.defense = defense;
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
}
