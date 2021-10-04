package com.firecraftmc.ct.object.ability;

import com.firecraftmc.ct.object.AbstractRole;

public abstract class ConditionalAbility extends Ability {
    public ConditionalAbility(String text) {
        super(text);
    }
    
    public abstract boolean checkCondition(AbstractRole role); //TODO More when more stuff is implemented
}
