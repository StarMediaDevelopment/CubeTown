package com.firecraftmc.ct.object.game;

import com.firecraftmc.ct.enums.Role;

import java.util.*;
import java.util.function.Consumer;

import static com.firecraftmc.ct.CubeTown.formatOut;

public class RoleList implements Iterable<Role> {
    
    public static final Set<Role> MAFIA_ROLES = EnumSet.of(Role.AMBUSHER, Role.BLACKMAILER, Role.CONSIGLIERE, Role.CONSORT, Role.DISGUISER, Role.FORGER, Role.FRAMER, Role.GODFATHER, Role.HYPNOTIST, Role.JANITOR, Role.MAFIOSO);
    public static final Set<Role> COVEN_ROLES = EnumSet.of(Role.COVEN_LEADER, Role.HEX_MASTER, Role.MEDUSA, Role.NECROMANCER, Role.POISONER, Role.POTION_MASTER);
    public static final Set<Role> ROLES_WITH_TARGETS = EnumSet.of(Role.EXECUTIONER, Role.GUARDIAN_ANGEL);
    public static final Set<Role> ACOLYTE_ROLES = EnumSet.of(Role.HUNGER, Role.GENERAL, Role.MORTICIAN, Role.PLAGUEBEARER);
    public static final Set<Role> HORSEMAN_ROLES = EnumSet.of(Role.FAMINE, Role.WAR, Role.DEATH, Role.PESTILENCE);
    public static final Set<Role> SELF_TARGETING_ROLES = EnumSet.of(Role.MAYOR, Role.SURVIVOR, Role.VETERAN);
    public static final Set<Role> HYBRID_TARGETTING_ROLES = EnumSet.of(Role.ARSONIST, Role.BODYGUARD, Role.COVEN_LEADER, Role.DISGUISER, Role.DOCTOR, Role.MEDUSA, Role.NECROMANCER, Role.WEREWOLF);
    
    protected List<Role> roles = new LinkedList<>();
    
    public static final RoleList ALL_ROLES_LIST = new RoleList(List.of(Role.values()));
    
    private RoleList(Collection<Role> roles) {
        this.roles.addAll(roles);
    }
    
    public RoleList(int totalPlayers) {
        formatOut("Starting role determinination for %s total players", totalPlayers);
        final int MAX_FACTION_ROLES = totalPlayers / 4;
        formatOut("Determined the maximum size for a faction to be %s", MAX_FACTION_ROLES);
        List<Role> roleChances = new ArrayList<>();
        for (Role role : Role.values()) {
            for (int i = 0; i < role.getWeight(); i++) {
                if (role.getWeight() != 0) {
                    roleChances.add(role);
                }
            }
            formatOut("    Added role %s to the chances with a weight of %s", role.name(), role.getWeight());
        }
        
        Collections.shuffle(roleChances);
        formatOut("Randomized the chances for all of the roles");
        int totalMafia = 0, totalCoven = 0, totalVampires = 0;
        for (int i = 0; i < totalPlayers; i++) {
            formatOut("Generating a role for the %s player", totalPlayers);
            Random random = new Random();
            int index = random.nextInt(roleChances.size());
            Role role = roleChances.get(index);
            formatOut("    Randomly selected the role %s, beginning checks to see if it can exist.", role.name());
            if (role.isUnique()) {
                roleChances.removeIf(next -> next == role);
                formatOut("        The chosen role is unique, removed it from the possible chances.");
            }
            
            roles.add(role);
            
            if (MAFIA_ROLES.contains(role)) {
                totalMafia++;
                if (totalMafia >= MAX_FACTION_ROLES) {
                    formatOut("       The count of Mafia Members has met or exceeded the total faction maximum, removing Mafia Roles from the role chances");
                    roleChances.removeIf(MAFIA_ROLES::contains);
                }
            } else if (COVEN_ROLES.contains(role)) {
                totalCoven++;
                if (totalCoven >= MAX_FACTION_ROLES) {
                    formatOut("       The count of Coven Members has met or exceeded the total faction maximum, removing Coven Roles from the role chances");
                    roleChances.removeIf(COVEN_ROLES::contains);
                }
            } else if (role == Role.VAMPIRE) {
                totalVampires++;
                if (totalVampires >= MAX_FACTION_ROLES) {
                    formatOut("       The count of Vampires has met or exceeded the total faction maximum, removing Vampire from the role chances");
                    roleChances.removeIf(next -> next == Role.VAMPIRE);
                }
            }
        }
        
        formatOut("Finished generating the role list, performing other cleanup actions.");
        
        formatOut("Performing checks for Vampire Hunters and Vampires");
        if (roles.contains(Role.VAMPIRE_HUNTER)) {
            formatOut("    The role list contains a Vampire Hunter, checking to see if Vampires exist");
            if (!roles.contains(Role.VAMPIRE)) {
                formatOut("        The roles does not contain a vampire, determining how many Vampire Hunters exist.");
                int vampireHunterCounter = 0;
                for (Role role : roles) {
                    if (role == Role.VAMPIRE_HUNTER) {
                        vampireHunterCounter++;
                    }
                }
                
                formatOut("        Found a total of %s Vampire Hunters, replacing with Vigilante", vampireHunterCounter);
                roles.removeIf(role -> role == Role.VAMPIRE_HUNTER);
                
                for (int i = 0; i < vampireHunterCounter; i++) {
                    roles.add(Role.VIGILANTE);
                }
            }
        }
        
        formatOut("Checking for the existence of Mafia and a Mafia Killing Role");
        List<Role> nonMafiaKillingRoles = List.of(Role.CONSIGLIERE, Role.AMBUSHER, Role.BLACKMAILER, Role.CONSORT, Role.DISGUISER, Role.FORGER, Role.FRAMER, Role.HYPNOTIST);
        if (!(roles.contains(Role.MAFIOSO) || roles.contains(Role.GODFATHER))) {
            formatOut("    The list of roles does not contain a Mafia Killing role, checking to see if Mafia exists");
            boolean containsMafia = false;
            List<Role> mafiaRoles = new ArrayList<>();
            for (Role role : roles) {
                if (nonMafiaKillingRoles.contains(role)) {
                    containsMafia = true;
                    mafiaRoles.add(role);
                }
            }
            
            if (containsMafia) {
                formatOut("        The list of roles contains other Mafia members, replacing one with Mafioso");
                Random random = new Random();
                int index = random.nextInt(mafiaRoles.size());
                Role role = mafiaRoles.get(index);
                roles.remove(role);
                roles.add(Role.MAFIOSO);
                formatOut("            Replaced %s with Mafioso", role.name());
            }
        }
    }
    
    public List<Role> getRoles() {
        return new LinkedList<>(roles);
    }
    
    public int size() {
        return this.roles.size();
    }
    
    public Iterator<Role> iterator() {
        return this.roles.iterator();
    }
    
    public void forEach(Consumer<? super Role> action) {
        this.roles.forEach(action);
    }
    
    public Spliterator<Role> spliterator() {
        return this.roles.spliterator();
    }
}
