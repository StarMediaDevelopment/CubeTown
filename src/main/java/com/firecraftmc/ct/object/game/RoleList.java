package com.firecraftmc.ct.object.game;

import com.firecraftmc.ct.enums.RoleType;

import java.util.*;
import java.util.function.Consumer;

import static com.firecraftmc.ct.CubeTown.formatOut;

public class RoleList implements Iterable<RoleType> {
    
    public static final Set<RoleType> MAFIA_ROLE_TYPES = EnumSet.of(RoleType.AMBUSHER, RoleType.BLACKMAILER, RoleType.CONSIGLIERE, RoleType.CONSORT, RoleType.DISGUISER, RoleType.FORGER, RoleType.FRAMER, RoleType.GODFATHER, RoleType.HYPNOTIST, RoleType.JANITOR, RoleType.MAFIOSO);
    public static final Set<RoleType> COVEN_ROLE_TYPES = EnumSet.of(RoleType.COVEN_LEADER, RoleType.HEX_MASTER, RoleType.MEDUSA, RoleType.NECROMANCER, RoleType.POISONER, RoleType.POTION_MASTER);
    public static final Set<RoleType> ROLES_WITH_TARGETS = EnumSet.of(RoleType.EXECUTIONER, RoleType.GUARDIAN_ANGEL);
    public static final Set<RoleType> ACOLYTE_ROLE_TYPES = EnumSet.of(RoleType.HUNGER, RoleType.GENERAL, RoleType.MORTICIAN, RoleType.PLAGUEBEARER);
    public static final Set<RoleType> HORSEMAN_ROLE_TYPES = EnumSet.of(RoleType.FAMINE, RoleType.WAR, RoleType.DEATH, RoleType.PESTILENCE);
    public static final Set<RoleType> SELF_TARGETING_ROLE_TYPES = EnumSet.of(RoleType.MAYOR, RoleType.SURVIVOR, RoleType.VETERAN);
    public static final Set<RoleType> HYBRID_TARGETTING_ROLE_TYPES = EnumSet.of(RoleType.ARSONIST, RoleType.BODYGUARD, RoleType.COVEN_LEADER, RoleType.DISGUISER, RoleType.DOCTOR, RoleType.MEDUSA, RoleType.NECROMANCER, RoleType.WEREWOLF);
    
    protected final List<RoleType> roleTypes = new LinkedList<>();
    
    public static final RoleList ALL_ROLES_LIST = new RoleList(List.of(RoleType.values()));
    
    private RoleList(Collection<RoleType> roleTypes) {
        this.roleTypes.addAll(roleTypes);
    }
    
    public RoleList(int totalPlayers) {
        formatOut("Starting role determinination for %s total players", totalPlayers);
        final int MAX_FACTION_ROLES = totalPlayers / 4;
        formatOut("Determined the maximum size for a faction to be %s", MAX_FACTION_ROLES);
        List<RoleType> roleTypeChances = new ArrayList<>();
        for (RoleType roleType : RoleType.values()) {
            for (int i = 0; i < roleType.getWeight(); i++) {
                if (roleType.getWeight() != 0) {
                    roleTypeChances.add(roleType);
                }
            }
            formatOut("    Added role %s to the chances with a weight of %s", roleType.name(), roleType.getWeight());
        }
        
        Collections.shuffle(roleTypeChances);
        formatOut("Randomized the chances for all of the roles");
        int totalMafia = 0, totalCoven = 0, totalVampires = 0;
        for (int i = 0; i < totalPlayers; i++) {
            formatOut("Generating a role for the %s player", totalPlayers);
            Random random = new Random();
            int index = random.nextInt(roleTypeChances.size());
            RoleType roleType = roleTypeChances.get(index);
            formatOut("    Randomly selected the role %s, beginning checks to see if it can exist.", roleType.name());
            if (roleType.isUnique()) {
                roleTypeChances.removeIf(next -> next == roleType);
                formatOut("        The chosen role is unique, removed it from the possible chances.");
            }
            
            roleTypes.add(roleType);
            
            if (MAFIA_ROLE_TYPES.contains(roleType)) {
                totalMafia++;
                if (totalMafia >= MAX_FACTION_ROLES) {
                    formatOut("       The count of Mafia Members has met or exceeded the total faction maximum, removing Mafia Roles from the role chances");
                    roleTypeChances.removeIf(MAFIA_ROLE_TYPES::contains);
                }
            } else if (COVEN_ROLE_TYPES.contains(roleType)) {
                totalCoven++;
                if (totalCoven >= MAX_FACTION_ROLES) {
                    formatOut("       The count of Coven Members has met or exceeded the total faction maximum, removing Coven Roles from the role chances");
                    roleTypeChances.removeIf(COVEN_ROLE_TYPES::contains);
                }
            } else if (roleType == RoleType.VAMPIRE) {
                totalVampires++;
                if (totalVampires >= MAX_FACTION_ROLES) {
                    formatOut("       The count of Vampires has met or exceeded the total faction maximum, removing Vampire from the role chances");
                    roleTypeChances.removeIf(next -> next == RoleType.VAMPIRE);
                }
            }
        }
        
        formatOut("Finished generating the role list, performing other cleanup actions.");
        
        formatOut("Performing checks for Vampire Hunters and Vampires");
        if (roleTypes.contains(RoleType.VAMPIRE_HUNTER)) {
            formatOut("    The role list contains a Vampire Hunter, checking to see if Vampires exist");
            if (!roleTypes.contains(RoleType.VAMPIRE)) {
                formatOut("        The roles does not contain a vampire, determining how many Vampire Hunters exist.");
                int vampireHunterCounter = 0;
                for (RoleType roleType : roleTypes) {
                    if (roleType == RoleType.VAMPIRE_HUNTER) {
                        vampireHunterCounter++;
                    }
                }
                
                formatOut("        Found a total of %s Vampire Hunters, replacing with Vigilante", vampireHunterCounter);
                roleTypes.removeIf(role -> role == RoleType.VAMPIRE_HUNTER);
                
                for (int i = 0; i < vampireHunterCounter; i++) {
                    roleTypes.add(RoleType.VIGILANTE);
                }
            }
        }
        
        formatOut("Checking for the existence of Mafia and a Mafia Killing Role");
        List<RoleType> nonMafiaKillingRoleTypes = List.of(RoleType.CONSIGLIERE, RoleType.AMBUSHER, RoleType.BLACKMAILER, RoleType.CONSORT, RoleType.DISGUISER, RoleType.FORGER, RoleType.FRAMER, RoleType.HYPNOTIST);
        if (!(roleTypes.contains(RoleType.MAFIOSO) || roleTypes.contains(RoleType.GODFATHER))) {
            formatOut("    The list of roles does not contain a Mafia Killing role, checking to see if Mafia exists");
            boolean containsMafia = false;
            List<RoleType> mafiaRoleTypes = new ArrayList<>();
            for (RoleType roleType : roleTypes) {
                if (nonMafiaKillingRoleTypes.contains(roleType)) {
                    containsMafia = true;
                    mafiaRoleTypes.add(roleType);
                }
            }
            
            if (containsMafia) {
                formatOut("        The list of roles contains other Mafia members, replacing one with Mafioso");
                Random random = new Random();
                int index = random.nextInt(mafiaRoleTypes.size());
                RoleType roleType = mafiaRoleTypes.get(index);
                roleTypes.remove(roleType);
                roleTypes.add(RoleType.MAFIOSO);
                formatOut("            Replaced %s with Mafioso", roleType.name());
            }
        }
    }
    
    public List<RoleType> getRoles() {
        return new LinkedList<>(roleTypes);
    }
    
    public int size() {
        return this.roleTypes.size();
    }
    
    public Iterator<RoleType> iterator() {
        return this.roleTypes.iterator();
    }
    
    public void forEach(Consumer<? super RoleType> action) {
        this.roleTypes.forEach(action);
    }
    
    public Spliterator<RoleType> spliterator() {
        return this.roleTypes.spliterator();
    }
}
