package com.firecraftmc.ct.enums;

import java.util.EnumSet;

import static com.firecraftmc.ct.enums.Role.*;

public final class InvestigatorResults {
    public static final EnumSet<Role> GROUP_ONE = EnumSet.of(INVESTIGATOR, VETERAN, MAFIOSO, AMBUSHER, PIRATE);
    public static final EnumSet<Role> GROUP_TWO = EnumSet.of(MEDIUM, JANITOR, RETRIBUTIONIST, NECROMANCER, TRAPPER);
    public static final EnumSet<Role> GROUP_THREE = EnumSet.of(SURVIVOR, VAMPIRE_HUNTER, AMNESIAC, MEDUSA, PSYCHIC);
    public static final EnumSet<Role> GROUP_FOUR = EnumSet.of(SPY, BLACKMAILER, JAILOR, GUARDIAN_ANGEL);
    public static final EnumSet<Role> GROUP_FIVE = EnumSet.of(SHERIFF, EXECUTIONER, WEREWOLF, POISONER);
    public static final EnumSet<Role> GROUP_SIX = EnumSet.of(FRAMER, VAMPIRE, JESTER, HEX_MASTER);
    public static final EnumSet<Role> GROUP_SEVEN = EnumSet.of(LOOKOUT, FORGER, JUGGERNAUT, COVEN_LEADER);
    public static final EnumSet<Role> GROUP_EIGHT = EnumSet.of(ESCORT, TRANSPORTER, CONSORT, HYPNOTIST);
    public static final EnumSet<Role> GROUP_NINE = EnumSet.of(DOCTOR, DISGUISER, SERIAL_KILLER, POTION_MASTER);
    public static final EnumSet<Role> GROUP_TEN = EnumSet.of(INVESTIGATOR, CONSIGLIERE, MAYOR, TRACKER, PLAGUEBEARER);
    public static final EnumSet<Role> GROUP_ELEVEN = EnumSet.of(BODYGUARD, GODFATHER, ARSONIST, CRUSADER, SOVEREIGN);
}
