package com.firecraftmc.ct.enums;

import com.firecraftmc.ct.object.ability.Ability;

import static com.firecraftmc.ct.CubeTown.TD;
import static com.firecraftmc.ct.enums.Alignment.*;
import static com.firecraftmc.ct.enums.Faction.*;

public enum Role {
    AMBUSHER(null, -1, true, MAFIA, KILLING, TD, null, null),
    AMNESIAC(null, "44A6C6", -1, false, NEUTRAL, BENIGN, Goal.AMNESIAC, TD, null, null),
    ARSONIST(null, "EE7600", -1, false, ANARCHY, KILLING, Goal.ARSONIST, TD, null, null),
    BLACKMAILER(null, -1, false, MAFIA, SUPPORT, TD, null, null),
    BODYGUARD(null, -1, false, TOWN, PROTECTIVE, TD, null, null),
    CONSIGLIERE(null, -1, false, MAFIA, INVESTIGATIVE, TD, null, null),
    CONSORT(null, -1, false, MAFIA, SUPPORT, TD, null, null),
    COVEN_LEADER(null, -1, true, COVEN, EVIL, TD, null, null),
    CRUSADER(null, -1, false, TOWN, PROTECTIVE, TD, null, null),
    DISGUISER(null, -1, false, MAFIA, DECEPTION, TD, null, null),
    DOCTOR(null, -1, false, TOWN, PROTECTIVE, TD, null, null),
    ESCORT(null, -1, false, TOWN, SUPPORT, TD, null, null),
    EXECUTIONER(null, "ACACAC", -1, false, NEUTRAL, EVIL, Goal.EXECUTIONER, TD, null, null),
    FORGER(null, -1, false, MAFIA, DECEPTION, TD, null, null),
    FRAMER(null, -1, false, MAFIA, DECEPTION, TD, null, null),
    GODFATHER(null, -1, true, MAFIA, KILLING, TD, null, null),
    GUARDIAN_ANGEL(null, "FFFFFF", -1, false, NEUTRAL, BENIGN, Goal.GUARDIAN_ANGEL, TD, null, null),
    HEX_MASTER(null, -1, true, COVEN, EVIL, TD, null, null),
    HYPNOTIST(null, -1, false, MAFIA, DECEPTION, TD, null, null),
    INVESTIGATOR(null, -1, false, TOWN, INVESTIGATIVE, TD, null, null),
    JAILOR(null, -1, true, TOWN, KILLING, TD, null, null),
    JANITOR(null, -1, false, MAFIA, DECEPTION, TD, null, null),
    JESTER(null, "F49FD0", -1, false, NEUTRAL, CHAOS, Goal.JESTER, TD, null, null),
    JUGGERNAUT(null, "631A35", -1, true, ANARCHY, KILLING, Goal.KILL_OPPOSE, TD, null, null),
    LOOKOUT(null, -1, false, TOWN, INVESTIGATIVE, TD, null, null),
    MAFIOSO(null, -1, true, MAFIA, KILLING, TD, null, null),
    MAYOR(null, -1, true, TOWN, SUPPORT, TD, null, null),
    MEDIUM(null, -1, false, TOWN, SUPPORT, TD, null, null),
    MEDUSA(null, -1, true, COVEN, EVIL, TD, null, null),
    NECROMANCER(null, -1, true, COVEN, EVIL, TD, null, null),
    PESTILENCE(null, "010302", -1, true, APOCALYPSE, KILLING, TD, null, null),
    PIRATE(null, "DBAD59", -1, true, NEUTRAL, KILLING, TD, null, null),
    PLAGUEBEARER(null, "Cfff63", -1, true, APOCALYPSE, SUPPORT, TD, null, null),
    POISONER(null, -1, true, COVEN, EVIL, TD, null, null),
    POTION_MASTER(null, -1, true, COVEN, EVIL, TD, null, null),
    PSYCHIC(null, -1, false, TOWN, INVESTIGATIVE, TD, null, null),
    RETRIBUTIONIST(null, -1, true, TOWN, SUPPORT, TD, null, null),
    SERIAL_KILLER(null, "000080", -1, false, ANARCHY, KILLING, TD, null, null),
    SHERIFF(null, -1, false, TOWN, INVESTIGATIVE, TD, null, null),
    SOVEREIGN(null, -1, true, TOWN, KILLING, TD, null, null),
    SPY(null, -1, false, TOWN, INVESTIGATIVE, TD, null, null),
    SURVIVOR(null, "C8C800", -1, false, NEUTRAL, BENIGN, TD, null, null),
    TRACKER(null, -1, false, TOWN, INVESTIGATIVE, TD, null, null),
    TRANSPORTER(null, -1, false, TOWN, SUPPORT, TD, null, null),
    TRAPPER(null, -1, false, TOWN, PROTECTIVE, TD, null, null),
    VAMPIRE(null, "7B8867", -1, false, MYTHICAL, CHAOS, Goal.CONVERT, TD, null, null),
    VAMPIRE_HUNTER(null, -1, false, TOWN, KILLING, TD, null, null),
    VETERAN(null, -1, true, TOWN, KILLING, TD, null, null),
    VIGILANTE(null, -1, false, TOWN, KILLING, TD, null, null),
    WEREWOLF(null, "744A26", -1, true, MYTHICAL, KILLING, Goal.KILL_OPPOSE, TD, null, null);


    private Class<?> clazz;
    private String color; //This is mostly for an override in case the faction doesnt provide a color
    private int priority;
    private boolean unique;
    private Faction faction;
    private Alignment alignment;
    private Goal goal;
    private String directResult;
    private String[] attributes;
    private Ability[] abilities;

    Role() {
    }

    Role(Class<?> clazz, String color, int priority, boolean unique, Faction faction, Alignment alignment, Goal goal, String directResult, String[] attributes, Ability[] abilities) {
        this.clazz = clazz;
        this.color = color;
        this.priority = priority;
        this.unique = unique;
        this.faction = faction;
        this.alignment = alignment;
        this.goal = goal;
        this.directResult = directResult;
        this.attributes = attributes;
        this.abilities = abilities;
    }

    Role(Class<?> clazz, int priority, boolean unique, Faction faction, Alignment alignment, Goal goal, String directResult, String[] attributes, Ability[] abilities) {
        this(clazz, null, priority, unique, faction, alignment, goal, directResult, attributes, abilities);
    }

    Role(Class<?> clazz, String color, int priority, boolean unique, Faction faction, Alignment alignment, String directResult, String[] attributes, Ability[] abilities) {
        this.clazz = clazz;
        this.color = color;
        this.priority = priority;
        this.unique = unique;
        this.faction = faction;
        this.alignment = alignment;
        this.directResult = directResult;
        this.attributes = attributes;
        this.abilities = abilities;
        this.goal = switch (faction) {
            case TOWN -> Goal.TOWN;
            case COVEN -> Goal.COVEN;
            case MAFIA -> Goal.MAFIA;
            case APOCALYPSE -> Goal.APOCALYPSE;
            default -> null;
        };
    }

    Role(Class<?> clazz, int priority, boolean unique, Faction faction, Alignment alignment, String directResult, String[] attributes, Ability[] abilities) {
        this(clazz, null, priority, unique, faction, alignment, directResult, attributes, abilities);
    }

    public Class<?> getClazz() {
        return clazz;
    }

    public String getColor() {
        if (color == null) {
            color = faction.getColor();
        }
        return color;
    }

    public int getPriority() {
        return priority;
    }

    public boolean isUnique() {
        return unique;
    }

    public Faction getFaction() {
        return faction;
    }

    public Alignment getAlignment() {
        return alignment;
    }

    public Goal getGoal() {
        return goal;
    }

    public String getDirectResult() {
        return directResult;
    }

    public String[] getAttributes() {
        return attributes;
    }

    public Ability[] getAbilities() {
        return abilities;
    }
}