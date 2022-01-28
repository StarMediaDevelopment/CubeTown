package com.firecraftmc.ct.object.game;

import com.firecraftmc.ct.enums.BaseType;
import com.firecraftmc.ct.enums.TypeRelation;

public class WinCondition {
    private BaseType baseType;
    private TypeRelation typeRelation;
    
    public WinCondition(BaseType baseType, TypeRelation typeRelation) {
        this.baseType = baseType;
        this.typeRelation = typeRelation;
    }
    
    public BaseType getBaseType() {
        return baseType;
    }
    
    public TypeRelation getTypeRelation() {
        return typeRelation;
    }
}
