package com.firecraftmc.ct.enums;

import com.firecraftmc.ct.object.role.impl.*;

public enum Role {
    AMBUSHER(Ambusher.class, true, 10, "Your target lies in wait. They must be an Ambusher."),
    AMNESIAC(Amnesiac.class, false, 10, "Your target does not remember their role. They must be an Amnesiac."),
    ARSONIST(Arsonist.class, false, 10, "Your target likes to watch things burn. They must be an Arsonist."),
    BLACKMAILER(Blackmailer.class, false, 10, "Your target uses information to silence people. They must be a Blackmailer."),
    BODYGUARD(Bodyguard.class, false, 10, "Your target is a trained protector. They must be a Bodyguard."),
    CONSIGLIERE(Consigliere.class, false, 10, "Your target gathers information for the Mafia. They must be a Consigliere."),
    CONSORT(Consort.class, false, 10, "Your target is a beautiful person working for the Mafia. They must be a Consort."),
    COVEN_LEADER(CovenLeader.class, true, 10, "Your target leads the mystical. They must be the Coven Leader."),
    CRUSADER(Crusader.class, false, 10, "Your target is a divine protector. They must be a Crusader."),
    DEATH(Death.class, true, 10, "Your target takes people's souls. They must be Death, Horseman of the Apocalypse."),
    DISGUISER(Disguiser.class, false, 10, "Your target makes other people appear to be someone they're not. They must be a Disguiser."),
    DOCTOR(Doctor.class, false, 10, "Your target is a professional surgeon. They must be a Doctor."),
    ESCORT(Escort.class, false, 10, "Your target is a beautiful person working for the town. They must be an Escort."),
    EXECUTIONER(Executioner.class, false, 10, "Your target wants someone to be lynched at any cost. They must be an Executioner."),
    FAMINE(Famine.class, true, 10, "Your target starves people to death. They must be Famine, Horseman of the Apocalypse."),
    FORGER(Forger.class, false, 10, "Your target is good at forging documents. They must be a Forger."),
    FRAMER(Framer.class, false, 10, "Your target has a desire to deceive. They must be a Framer."),
    GENERAL(General.class, true, 10, "Your target markes others as foes. They must be the General."),
    GODFATHER(Godfather.class, true, 10, "Your target is the leader of the Mafia. They must be the Godfather."),
    GUARDIAN_ANGEL(GuardianAngel.class, false, 10, "Your target is watching over someone. They must be a Guardian Angel."),
    HEX_MASTER(HexMaster.class, true, 10, "Your target is versed in the ways of hexes. They must be the Hex Master."),
    HYPNOTIST(Hypnotist.class, false, 10, "Your target is skilled at disrupting others. They must be a Hypnotist."),
    INVESTIGATOR(Investigator.class, false, 10, "Your target gathers information about people. The must be an Investigator."),
    JAILOR(Jailor.class, true, 10, "Your target detains people at n ight. They must be a Jailor."),
    JANITOR(Janitor.class, false, 10, "Your target cleans up dead bodies. They must be a Janitor."),
    JESTER(Jester.class, false, 10, "Your target wants to be lynched. They must be a Jester."),
    JUGGERNAUT(Juggernaut.class, true, 10, "Your target grows stronger with each kill. They must be the Juggernaut."),
    LOOKOUT(Lookout.class, false, 10, "Your target watches who visits people at night. They must be a Lookout."),
    MAFIOSO(Mafioso.class, true, 10, "Your target does the Godfather's dirty work. They must be a Mafioso."),
    MAYOR(Mayor.class, true, 10, "Your target is the leader of the town. They must be the Mayor."),
    MEDIUM(Medium.class, false, 10, "Your target speaks with the dead. They must be a Medium."),
    MEDUSA(Medusa.class, true, 10, "Your target has a gaze of stone. They must be the Medusa."),
    MERCHANT(Merchant.class, true, 10, "Your target starves others. They must be the Merchant"),
    MORTICIAN(Mortician.class, true, 10, "Your target buries the dead. They must be the Mortician."),
    NECROMANCER(Necromancer.class, true, 10, "Your target uses the deceased to do their dirty work. They must be the Necromancer."),
    PESTILENCE(Pestilence.class, true, 10, "Your target reeks of disease. They must be Pestilence, Horseman of the Apocalypse."),
    PIRATE(Pirate.class, true, 10, "Your target wants to plunder the town. They must be a Pirate."),
    PLAGUEBEARER(Plaguebearer.class, true, 10, "Your target infects people with the plague. They must be the Plaguebearer."),
    POISONER(Poisoner.class, true, 10, "Your target uses herbs and plants to kill their victims. They must be the Poisoner."),
    POTION_MASTER(PotionMaster.class, true, 10, "Your target works with alchemy. They must be a Potion Master."),
    PSYCHIC(Psychic.class, false, 10, "Your target has the sight. They must be a Psychic."),
    RETRIBUTIONIST(Retributionist.class, true, 10, "Your target wields mystical powers. They must be a Retributionist."),
    SERIAL_KILLER(SerialKiller.class, false, 10, "Your target wants to kill everyone. They must be a Serial Killer."),
    SHERIFF(Sheriff.class, false, 10, "Your target is a protector of the town. They must be a Sheriff."),
    SPY(Spy.class, false, 10, "Your target secretly watches who someone visits. They must be a Spy."),
    SURVIVOR(Survivor.class, false, 0, "Your target simply wants to live. They must be a Survivor."),
    TRACKER(Tracker.class, false, 10, "Your target is a skilled in the art of tracking. They must be a Tracker."),
    TRANSPORTER(Transporter.class, false, 10, "Your target specializes in transportation. They must be a Transporter."),
    TRAPPER(Trapper.class, false, 10, "Your target is waiting for a big catch. They must be a Trapper."),
    VAMPIRE(Vampire.class, false, 10, "Your target drinks blood. They must be a Vampire."),
    VAMPIRE_HUNTER(VampireHunter.class, false, 10, "Your target tracks Vampires. They must be a Vampire Hunter."),
    VETERAN(Veteran.class, true, 10, "Your target is a paranoid war hero. They must be a Veteran."),
    VIGILANTE(Vigilante.class, false, 10, "Your target will bend the law to enact justice. They must be a Vigilante."),
    WAR(War.class, true, 10, "Your target feeds of feuds. They must be War, Horseman of the Apocalypse."),
    WEREWOLF(Werewolf.class, true, 10, "Your target howls at the moon. They must be a Werewolf.");
    
    
    private final Class<?> clazz;
    private final boolean unique;
    private final int weight;
    private final String directResult;
    
    Role(Class<?> clazz, boolean unique, int weight, String directResult) {
        this.clazz = clazz;
        this.unique = unique;
        this.weight = weight;
        this.directResult = directResult;
    }
    
    public Class<?> getClazz() {
        return clazz;
    }
    
    public boolean isUnique() {
        return unique;
    }
    
    public int getWeight() {
        return weight;
    }
    
    public String getDirectResult() {
        return directResult;
    }
}