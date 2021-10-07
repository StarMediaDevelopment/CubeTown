package com.firecraftmc.ct.object.attribute;

public class Attribute {
    protected String text;

    public Attribute(String text) {
        this.text = text;
    }
    
    public static Attribute[] createFromStrings(String... values) {
        Attribute[] abilities = new Attribute[values.length];
        for (int i = 0; i < values.length; i++) {
            abilities[i] = new Attribute(values[i]);
        }
        return abilities;
    }
}
