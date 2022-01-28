package com.firecraftmc.ct.enums;

public enum FactionType implements BaseType {
    TOWN("45BF00"), MAFIA("DD0000"), COVEN("BF5FFF"), NEUTRAL("ACACAC"), ANARCHY("a47456"), APOCALYPSE("2770ca"), MYTHICAL("2ac0ff");
    private final String color;

    FactionType(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
