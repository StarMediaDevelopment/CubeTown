package com.firecraftmc.ct.enums;

import com.firecraftmc.ct.object.ability.Ability;
import com.firecraftmc.ct.object.role.impl.*;

import static com.firecraftmc.ct.CubeTown.TD;
import static com.firecraftmc.ct.enums.Alignment.*;
import static com.firecraftmc.ct.enums.Faction.*;

public enum Role {
    AMBUSHER(Ambusher.class, -1, true, MAFIA, KILLING, TD, null, null),
    AMNESIAC(Amnesiac.class, "44A6C6", -1, false, NEUTRAL, BENIGN, Goal.AMNESIAC, TD, null, null),
    ARSONIST(Arsonist.class, "EE7600", -1, false, ANARCHY, KILLING, Goal.ARSONIST, TD, null, null),
    BLACKMAILER(Blackmailer.class, -1, false, MAFIA, SUPPORT, TD, null, null),
    BODYGUARD(Bodyguard.class, -1, false, TOWN, PROTECTIVE, TD, null, null),
    CONSIGLIERE(Consigliere.class, -1, false, MAFIA, INVESTIGATIVE, TD, null, null),
    CONSORT(Consort.class, -1, false, MAFIA, SUPPORT, TD, null, null),
    COVEN_LEADER(CovenLeader.class, -1, true, COVEN, EVIL, TD, null, null),
    CRUSADER(Crusader.class, -1, false, TOWN, PROTECTIVE, TD, null, null),
    DISGUISER(Disguiser.class, -1, false, MAFIA, DECEPTION, TD, null, null),
    DOCTOR(Doctor.class, -1, false, TOWN, PROTECTIVE, TD, null, null),
    ESCORT(Escort.class, -1, false, TOWN, SUPPORT, TD, null, null),
    EXECUTIONER(Executioner.class, "ACACAC", -1, false, NEUTRAL, EVIL, Goal.EXECUTIONER, TD, null, null),
    FORGER(Forger.class, -1, false, MAFIA, DECEPTION, TD, null, null),
    FRAMER(Framer.class, -1, false, MAFIA, DECEPTION, TD, null, null),
    GODFATHER(Godfather.class, -1, true, MAFIA, KILLING, TD, null, null),
    GUARDIAN_ANGEL(GuardianAngel.class, "FFFFFF", -1, false, NEUTRAL, BENIGN, Goal.GUARDIAN_ANGEL, TD, null, null),
    HEX_MASTER(HexMaster.class, -1, true, COVEN, EVIL, TD, null, null),
    HYPNOTIST(Hypnotist.class, -1, false, MAFIA, DECEPTION, TD, null, null),
    INVESTIGATOR(Investigator.class, -1, false, TOWN, INVESTIGATIVE, TD, null, null),
    JAILOR(Jailor.class, -1, true, TOWN, KILLING, TD, null, null),
    JANITOR(Janitor.class, -1, false, MAFIA, DECEPTION, TD, null, null),
    JESTER(Jester.class, "F49FD0", -1, false, NEUTRAL, CHAOS, Goal.JESTER, TD, null, null),
    JUGGERNAUT(Juggernaut.class, "631A35", -1, true, ANARCHY, KILLING, Goal.KILL_OPPOSE, TD, null, null),
    LOOKOUT(Lookout.class, -1, false, TOWN, INVESTIGATIVE, TD, null, null),
    MAFIOSO(Mafioso.class, -1, true, MAFIA, KILLING, TD, null, null),
    MAYOR(Mayor.class, -1, true, TOWN, SUPPORT, TD, null, null),
    MEDIUM(Medium.class, -1, false, TOWN, SUPPORT, TD, null, null),
    MEDUSA(Medusa.class, -1, true, COVEN, EVIL, TD, null, null),
    NECROMANCER(Necromancer.class, -1, true, COVEN, EVIL, TD, null, null),
    PESTILENCE(Pestilence.class, "010302", -1, true, APOCALYPSE, KILLING, TD, null, null),
    PIRATE(Pirate.class, "DBAD59", -1, true, NEUTRAL, KILLING, TD, null, null),
    PLAGUEBEARER(Plaguebearer.class, "Cfff63", -1, true, APOCALYPSE, SUPPORT, TD, null, null),
    POISONER(Poisoner.class, -1, true, COVEN, EVIL, TD, null, null),
    POTION_MASTER(PotionMaster.class, -1, true, COVEN, EVIL, TD, null, null),
    PSYCHIC(Psychic.class, -1, false, TOWN, INVESTIGATIVE, TD, null, null),
    RETRIBUTIONIST(Retributionist.class, -1, true, TOWN, SUPPORT, TD, null, null),
    SERIAL_KILLER(SerialKiller.class, "000080", -1, false, ANARCHY, KILLING, TD, null, null),
    SHERIFF(Sheriff.class, -1, false, TOWN, INVESTIGATIVE, TD, null, null),
    SOVEREIGN(Sovereign.class, -1, true, TOWN, KILLING, TD, null, null),
    SPY(Spy.class, -1, false, TOWN, INVESTIGATIVE, TD, null, null),
    SURVIVOR(Survivor.class, "C8C800", -1, false, NEUTRAL, BENIGN, TD, null, null),
    TRACKER(Tracker.class, -1, false, TOWN, INVESTIGATIVE, TD, null, null),
    TRANSPORTER(Transporter.class, -1, false, TOWN, SUPPORT, TD, null, null),
    TRAPPER(Trapper.class, -1, false, TOWN, PROTECTIVE, TD, null, null),
    VAMPIRE(Vampire.class, "7B8867", -1, false, MYTHICAL, CHAOS, Goal.CONVERT, TD, null, null),
    VAMPIRE_HUNTER(VampireHunter.class, -1, false, TOWN, KILLING, TD, null, null),
    VETERAN(Veteran.class, -1, true, TOWN, KILLING, TD, null, null),
    VIGILANTE(Vigilante.class, -1, false, TOWN, KILLING, TD, null, null),
    WEREWOLF(Werewolf.class, "744A26", -1, true, MYTHICAL, KILLING, Goal.KILL_OPPOSE, TD, null, null);


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