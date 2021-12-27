package com.firecraftmc.ct.enums;

import com.firecraftmc.ct.object.role.impl.*;

import static com.firecraftmc.ct.enums.Alignment.*;
import static com.firecraftmc.ct.enums.Faction.*;

public enum Role {
    AMBUSHER(Ambusher.class, true, MAFIA, KILLING, "Your target lies in wait, they must be an Ambusher."),
    AMNESIAC(Amnesiac.class, "44A6C6", false, NEUTRAL, BENIGN, Goal.AMNESIAC, "Your target does not remember their role. They must be an Amnesiac."),
    ARSONIST(Arsonist.class, "EE7600", false, ANARCHY, KILLING, Goal.ARSONIST, "Your target likes to watch things burn. They must be an Arsonist."),
    BLACKMAILER(Blackmailer.class, false, MAFIA, SUPPORT, "Your target uses information to silence people. They must be a Blackmailer."),
    BODYGUARD(Bodyguard.class, false, TOWN, PROTECTIVE, "Your target is a trained protector. They must be a Bodyguard."),
    CONSIGLIERE(Consigliere.class, false, MAFIA, INVESTIGATIVE, "Your target gathers information for the Mafia. They must be a Consigliere."),
    CONSORT(Consort.class, false, MAFIA, SUPPORT, "Your target is a beautiful person working for the Mafia. They must be a Consort."),
    COVEN_LEADER(CovenLeader.class, true, COVEN, EVIL, "Your target leads the mystical. They must be the Coven Leader."),
    CRUSADER(Crusader.class, false, TOWN, PROTECTIVE, "Your target is a divine protector. They must be a Crusader."),
    DEATH(Death.class, "010302", true, APOCALYPSE, KILLING, "Your target takes people's souls. They must be Death, Horseman of the Apocalypse."),
    DISGUISER(Disguiser.class, false, MAFIA, DECEPTION, "Your target makes other people appear to be someone they're not. They must be a Disguiser."),
    DOCTOR(Doctor.class, false, TOWN, PROTECTIVE, "Your target is a professional surgeon. They must be a Doctor."),
    ESCORT(Escort.class, false, TOWN, SUPPORT, "Your target is a beautiful person working for the town. They must be an Escort."),
    EXECUTIONER(Executioner.class, "ACACAC", false, NEUTRAL, EVIL, Goal.EXECUTIONER, "Your target wants someone to be lynched at any cost. They must be an Executioner."),
    FAMINE(Famine.class, "010302", true, APOCALYPSE, KILLING, "Your target starves people to death. They must be Famine, Horseman of the Apocalypse."), 
    FORGER(Forger.class, false, MAFIA, DECEPTION, "Your target is good at forging documents. They must be a Forger."),
    FRAMER(Framer.class, false, MAFIA, DECEPTION, "Your target has a desire to deceive. They must be a Framer."),
    GENERAL(General.class, "00BFBF", true, APOCALYPSE, EVIL, "Your target markes others as foes. They must be the General."),
    GODFATHER(Godfather.class, true, MAFIA, KILLING, "Your target is the leader of the Mafia. They must be the Godfather."),
    GUARDIAN_ANGEL(GuardianAngel.class, "FFFFFF", false, NEUTRAL, BENIGN, Goal.GUARDIAN_ANGEL, "Your target is watching over someone. They must be a Guardian Angel."),
    HEX_MASTER(HexMaster.class, true, COVEN, EVIL, "Your target is versed in the ways of hexes. They must be the Hex Master."),
    HYPNOTIST(Hypnotist.class, false, MAFIA, DECEPTION, "Your target is skilled at disrupting others. They must be a Hypnotist."),
    INVESTIGATOR(Investigator.class, false, TOWN, INVESTIGATIVE, "Your target gathers information about people. The must be an Investigator."),
    JAILOR(Jailor.class, true, TOWN, KILLING, "Your target detains people at n ight. They must be a Jailor."),
    JANITOR(Janitor.class, false, MAFIA, DECEPTION, "Your target cleans up dead bodies. They must be a Janitor."),
    JESTER(Jester.class, "F49FD0", false, NEUTRAL, CHAOS, Goal.JESTER, "Your target wants to be lynched. They must be a Jester."),
    JUGGERNAUT(Juggernaut.class, "631A35", true, ANARCHY, KILLING, Goal.KILL_OPPOSE, "Your target grows stronger with each kill. They must be the Juggernaut."),
    LOOKOUT(Lookout.class, false, TOWN, INVESTIGATIVE, "Your target watches who visits people at night. They must be a Lookout."),
    MAFIOSO(Mafioso.class, true, MAFIA, KILLING, "Your target does the Godfather's dirty work. They must be a Mafioso."),
    MAYOR(Mayor.class, true, TOWN, SUPPORT, "Your target is the leader of the town. They must be the Mayor."),
    MEDIUM(Medium.class, false, TOWN, SUPPORT, "Your target speaks with the dead. They must be a Medium."),
    MEDUSA(Medusa.class, true, COVEN, EVIL, "Your target has a gaze of stone. They must be the Medusa."),
    MERCHANT(Merchant.class, "BFBF80", true, APOCALYPSE, EVIL, "Your target starves others. They must be the Merchant"),
    MORTICIAN(Mortician.class, "A00000", true, APOCALYPSE, EVIL, "Your target buries the dead. They must be the Mortician."),
    NECROMANCER(Necromancer.class, true, COVEN, EVIL, "Your target uses the deceased to do their dirty work. They must be the Necromancer."),
    PESTILENCE(Pestilence.class, "010302", true, APOCALYPSE, KILLING, "Your target reeks of disease. They must be Pestilence, Horseman of the Apocalypse."),
    PIRATE(Pirate.class, "DBAD59", true, NEUTRAL, KILLING, "Your target wants to plunder the town. They must be a Pirate."),
    PLAGUEBEARER(Plaguebearer.class, "Cfff63", true, APOCALYPSE, EVIL, "Your target infects people with the plague. They must be the Plaguebearer."),
    POISONER(Poisoner.class, true, COVEN, EVIL, "Your target uses herbs and plants to kill their victims. They must be the Poisoner."),
    POTION_MASTER(PotionMaster.class, true, COVEN, EVIL, "Your target works with alchemy. They must be a Potion Master."),
    PSYCHIC(Psychic.class, false, TOWN, INVESTIGATIVE, "Your target has the sight. They must be a Psychic."),
    RETRIBUTIONIST(Retributionist.class, true, TOWN, SUPPORT, "Your target wields mystical powers. They must be a Retributionist."),
    SERIAL_KILLER(SerialKiller.class, "000080", false, ANARCHY, KILLING, "Your target wants to kill everyone. They must be a Serial Killer."),
    SHERIFF(Sheriff.class, false, TOWN, INVESTIGATIVE, "Your target is a protector of the town. They must be a Sheriff."),
    SPY(Spy.class, false, TOWN, INVESTIGATIVE, "Your target secretly watches who someone visits. They must be a Spy."),
    SURVIVOR(Survivor.class, "C8C800", false, NEUTRAL, BENIGN, "Your target simply wants to live. They must be a Survivor."),
    TRACKER(Tracker.class, false, TOWN, INVESTIGATIVE, "Your target is a skilled in the art of tracking. They must be a Tracker."),
    TRANSPORTER(Transporter.class, false, TOWN, SUPPORT, "Your target specializes in transportation. They must be a Transporter."),
    TRAPPER(Trapper.class, false, TOWN, PROTECTIVE, "Your target is waiting for a big catch. They must be a Trapper."),
    VAMPIRE(Vampire.class, "7B8867", false, MYTHICAL, CHAOS, Goal.CONVERT, "Your target drinks blood. They must be a Vampire."),
    VAMPIRE_HUNTER(VampireHunter.class, false, TOWN, KILLING, "Your target tracks Vampires. They must be a Vampire Hunter."),
    VETERAN(Veteran.class, true, TOWN, KILLING, "Your target is a paranoid war hero. They must be a Veteran."),
    VIGILANTE(Vigilante.class, false, TOWN, KILLING, "Your target will bend the law to enact justice. They must be a Vigilante."),
    WAR(War.class, "010302", true, APOCALYPSE, KILLING, "Your target feeds of feuds. They must be War, Horseman of the Apocalypse."), 
    WEREWOLF(Werewolf.class, "744A26", true, MYTHICAL, KILLING, Goal.KILL_OPPOSE, "Your target howls at the moon. They must be a Werewolf.");


    private Class<?> clazz;
    @Deprecated private String color; //This is mostly for an override in case the faction doesnt provide a color
    private boolean unique;
    @Deprecated private Faction faction;
    @Deprecated private Alignment alignment;
    @Deprecated private Goal goal;
    private String directResult;
    
    Role(Class<?> clazz, boolean unique, String directResult) {
        this.clazz = clazz;
        this.unique = unique;
        this.directResult = directResult;
    }

    @Deprecated
    Role(Class<?> clazz, String color, boolean unique, Faction faction, Alignment alignment, Goal goal, String directResult) {
        this.clazz = clazz;
        this.color = color;
        this.unique = unique;
        this.faction = faction;
        this.alignment = alignment;
        this.goal = goal;
        this.directResult = directResult;
    }

    @Deprecated
    Role(Class<?> clazz, boolean unique, Faction faction, Alignment alignment, Goal goal, String directResult) {
        this(clazz, null, unique, faction, alignment, goal, directResult);
    }

    @Deprecated
    Role(Class<?> clazz, String color, boolean unique, Faction faction, Alignment alignment, String directResult) {
        this.clazz = clazz;
        this.color = color;
        this.unique = unique;
        this.faction = faction;
        this.alignment = alignment;
        this.directResult = directResult;
        this.goal = switch (faction) {
            case TOWN -> Goal.TOWN;
            case COVEN -> Goal.COVEN;
            case MAFIA -> Goal.MAFIA;
            case APOCALYPSE -> Goal.APOCALYPSE;
            default -> null;
        };
    }

    @Deprecated
    Role(Class<?> clazz, boolean unique, Faction faction, Alignment alignment, String directResult) {
        this(clazz, null, unique, faction, alignment, directResult);
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
}