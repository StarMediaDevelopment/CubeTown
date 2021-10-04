package com.firecraftmc.ct.enums;

import com.firecraftmc.ct.object.ability.Ability;

/**
 * This class is for easier stuff regarding detecting roles. The role classes will be controllers for the game
 */
public enum Role {
    ;
    
    private Class<?> clazz;
    private Faction faction;
    private Alignment alignment;
    private Attack attack;
    private Defense defense;
    private SheriffResult sheriffResult;
    private String directResult;
    private String[] attributes;
    private Ability[] abilities;
}
