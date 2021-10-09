package com.firecraftmc.ct.enums;

import com.firecraftmc.ct.object.ability.Ability;
import com.firecraftmc.ct.object.role.impl.*;

import static com.firecraftmc.ct.CubeTown.TD;
import static com.firecraftmc.ct.enums.Alignment.*;
import static com.firecraftmc.ct.enums.Faction.*;

public enum Role {
    AMBUSHER(Ambusher.class, true, MAFIA, KILLING, TD, null, null),
    AMNESIAC(Amnesiac.class, "44A6C6", false, NEUTRAL, BENIGN, Goal.AMNESIAC, TD, null, null),
    ARSONIST(Arsonist.class, "EE7600", false, ANARCHY, KILLING, Goal.ARSONIST, TD, null, null),
    BLACKMAILER(Blackmailer.class, false, MAFIA, SUPPORT, TD, null, null),
    BODYGUARD(Bodyguard.class, false, TOWN, PROTECTIVE, TD, null, null),
    CONSIGLIERE(Consigliere.class, false, MAFIA, INVESTIGATIVE, TD, null, null),
    CONSORT(Consort.class, false, MAFIA, SUPPORT, TD, null, null),
    COVEN_LEADER(CovenLeader.class, true, COVEN, EVIL, TD, null, null),
    CRUSADER(Crusader.class, false, TOWN, PROTECTIVE, TD, null, null),
    DEATH(Death.class, "010302", true, APOCALYPSE, KILLING, TD, null, null),
    DISGUISER(Disguiser.class, false, MAFIA, DECEPTION, TD, null, null),
    DOCTOR(Doctor.class, false, TOWN, PROTECTIVE, TD, null, null),
    ESCORT(Escort.class, false, TOWN, SUPPORT, TD, null, null),
    EXECUTIONER(Executioner.class, "ACACAC", false, NEUTRAL, EVIL, Goal.EXECUTIONER, TD, null, null),
    FAMINE(Famine.class, "010302", true, APOCALYPSE, KILLING, TD, null, null), 
    FORGER(Forger.class, false, MAFIA, DECEPTION, TD, null, null),
    FRAMER(Framer.class, false, MAFIA, DECEPTION, TD, null, null),
    GENERAL(General.class, "00BFBF", true, APOCALYPSE, EVIL, TD, null, null), 
    GODFATHER(Godfather.class, true, MAFIA, KILLING, TD, null, null),
    GUARDIAN_ANGEL(GuardianAngel.class, "FFFFFF", false, NEUTRAL, BENIGN, Goal.GUARDIAN_ANGEL, TD, null, null),
    HEX_MASTER(HexMaster.class, true, COVEN, EVIL, TD, null, null),
    HYPNOTIST(Hypnotist.class, false, MAFIA, DECEPTION, TD, null, null),
    INVESTIGATOR(Investigator.class, false, TOWN, INVESTIGATIVE, TD, null, null),
    JAILOR(Jailor.class, true, TOWN, KILLING, TD, null, null),
    JANITOR(Janitor.class, false, MAFIA, DECEPTION, TD, null, null),
    JESTER(Jester.class, "F49FD0", false, NEUTRAL, CHAOS, Goal.JESTER, TD, null, null),
    JUGGERNAUT(Juggernaut.class, "631A35", true, ANARCHY, KILLING, Goal.KILL_OPPOSE, TD, null, null),
    LOOKOUT(Lookout.class, false, TOWN, INVESTIGATIVE, TD, null, null),
    MAFIOSO(Mafioso.class, true, MAFIA, KILLING, TD, null, null),
    MAYOR(Mayor.class, true, TOWN, SUPPORT, TD, null, null),
    MEDIUM(Medium.class, false, TOWN, SUPPORT, TD, null, null),
    MEDUSA(Medusa.class, true, COVEN, EVIL, TD, null, null),
    MERCHANT(Merchant.class, "BFBF80", true, APOCALYPSE, EVIL, TD, null, null),
    MORTICIAN(Mortician.class, "A00000", true, APOCALYPSE, EVIL, TD, null, null), 
    NECROMANCER(Necromancer.class, true, COVEN, EVIL, TD, null, null),
    PESTILENCE(Pestilence.class, "010302", true, APOCALYPSE, KILLING, TD, null, null),
    PIRATE(Pirate.class, "DBAD59", true, NEUTRAL, KILLING, TD, null, null),
    PLAGUEBEARER(Plaguebearer.class, "Cfff63", true, APOCALYPSE, EVIL, TD, null, null),
    POISONER(Poisoner.class, true, COVEN, EVIL, TD, null, null),
    POTION_MASTER(PotionMaster.class, true, COVEN, EVIL, TD, null, null),
    PSYCHIC(Psychic.class, false, TOWN, INVESTIGATIVE, TD, null, null),
    RETRIBUTIONIST(Retributionist.class, true, TOWN, SUPPORT, TD, null, null),
    SERIAL_KILLER(SerialKiller.class, "000080", false, ANARCHY, KILLING, TD, null, null),
    SHERIFF(Sheriff.class, false, TOWN, INVESTIGATIVE, TD, null, null),
    SOVEREIGN(Sovereign.class, true, TOWN, KILLING, TD, null, null),
    SPY(Spy.class, false, TOWN, INVESTIGATIVE, TD, null, null),
    SURVIVOR(Survivor.class, "C8C800", false, NEUTRAL, BENIGN, TD, null, null),
    TRACKER(Tracker.class, false, TOWN, INVESTIGATIVE, TD, null, null),
    TRANSPORTER(Transporter.class, false, TOWN, SUPPORT, TD, null, null),
    TRAPPER(Trapper.class, false, TOWN, PROTECTIVE, TD, null, null),
    VAMPIRE(Vampire.class, "7B8867", false, MYTHICAL, CHAOS, Goal.CONVERT, TD, null, null),
    VAMPIRE_HUNTER(VampireHunter.class, false, TOWN, KILLING, TD, null, null),
    VETERAN(Veteran.class, true, TOWN, KILLING, TD, null, null),
    VIGILANTE(Vigilante.class, false, TOWN, KILLING, TD, null, null),
    WAR(War.class, "010302", true, APOCALYPSE, KILLING, TD, null, null), 
    WEREWOLF(Werewolf.class, "744A26", true, MYTHICAL, KILLING, Goal.KILL_OPPOSE, TD, null, null);


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

    Role(Class<?> clazz, String color, boolean unique, Faction faction, Alignment alignment, Goal goal, String directResult, String[] attributes, Ability[] abilities) {
        this.clazz = clazz;
        this.color = color;
        this.unique = unique;
        this.faction = faction;
        this.alignment = alignment;
        this.goal = goal;
        this.directResult = directResult;
        this.attributes = attributes;
        this.abilities = abilities;
    }

    Role(Class<?> clazz, boolean unique, Faction faction, Alignment alignment, Goal goal, String directResult, String[] attributes, Ability[] abilities) {
        this(clazz, null, unique, faction, alignment, goal, directResult, attributes, abilities);
    }

    Role(Class<?> clazz, String color, boolean unique, Faction faction, Alignment alignment, String directResult, String[] attributes, Ability[] abilities) {
        this.clazz = clazz;
        this.color = color;
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

    Role(Class<?> clazz, boolean unique, Faction faction, Alignment alignment, String directResult, String[] attributes, Ability[] abilities) {
        this(clazz, null, unique, faction, alignment, directResult, attributes, abilities);
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