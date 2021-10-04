package com.firecraftmc.ct.enums;

public enum Faction {
    TOWN("45BF00"), MAFIA("DD0000"), COVEN("BF5FFF"), NEUTRAL("ACACAC"), ANARCHY("a47456"), APOCALYPSE("2770ca"), MYTHICAL("2ac0ff");
    private String color;

    Faction(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
