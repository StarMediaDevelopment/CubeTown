package com.firecraftmc.ct.object.ability;

public class Ability {
    protected String text;

    public Ability(String text) {
        this.text = text;
    }
    
    public static Ability[] createFromStrings(String... values) {
        Ability[] abilities = new Ability[values.length];
        for (int i = 0; i < values.length; i++) {
            abilities[i] = new Ability(values[i]);
        }
        return abilities;
    }
}
