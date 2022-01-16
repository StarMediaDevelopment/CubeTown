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
        formatOut("Determining the chances for each of the different roles.");
        final int MAX_FACTION_ROLES = totalPlayers / 4;
        List<Role> roleChances = new ArrayList<>();
        for (Role role : Role.values()) {
            formatOut("    Role %s has a weight of %s", role.name(), role.getWeight());
            for (int i = 0; i < role.getWeight(); i++) {
                roleChances.add(role);
            }
        }
        
        Collections.shuffle(roleChances);
        formatOut("Randomized role chances.");
        formatOut("Determining the roles for the simulated game.");
        int totalMafia = 0, totalCoven = 0, totalVampires = 0;
        for (int i = 0; i < totalPlayers; i++) {
            Random random = new Random();
            int index = random.nextInt(roleChances.size());
            Role role = roleChances.get(index);
            formatOut("    Choosen role %s as one of roles for the simulated game.", role.name());
            if (role.getWeight() != 0) {
                formatOut("        The role %s can be used as the weight is greater than 0", role.name());
                if (role.isUnique()) {
                    formatOut("        The role %s is unique, removing other chances from list.", role.name());
                    roleChances.removeIf(next -> next == role);
                }
                
                roles.add(role);
                formatOut("    Added the role %s to the possible roles", role.name());
                
                if (MAFIA_ROLES.contains(role)) {
                    totalMafia++;
                    if (totalMafia >= MAX_FACTION_ROLES) {
                        formatOut("        The Mafia Faction has reached the max role count, removing the rest of the roles from the Role Chances.");
                        roleChances.removeIf(MAFIA_ROLES::contains);
                    }
                } else if (COVEN_ROLES.contains(role)) {
                    totalCoven++;
                    if (totalCoven >= MAX_FACTION_ROLES) {
                        formatOut("        The Coven Faction has reached the max role count, removing the rest of the roles from the Role Chances.");
                        roleChances.removeIf(COVEN_ROLES::contains);
                    }
                } else if (role == Role.VAMPIRE) {
                    totalVampires++;
                    if (totalVampires >= MAX_FACTION_ROLES) {
                        formatOut("        The Vampire Faction has reached the max role count, removing the rest of the roles from the Role Chances.");
                        roleChances.removeIf(next -> next == Role.VAMPIRE);
                    }
                }
            } else {
                formatOut("        The role %s could not be used, removing one from current index for proper role count.", role.name());
                i--;
            }
        }
        
        formatOut("Finished determining the roles for the simulated game.");
        
        formatOut("Determining Vampire Hunters and Vampires");
        if (roles.contains(Role.VAMPIRE_HUNTER)) {
            formatOut("The role list contains Vampire Hunter, checking for Vampire in the role list.");
            if (!roles.contains(Role.VAMPIRE)) {
                formatOut("    The role list does not contain Vampire, replacing Vampire Hunter with Vigilante.");
                int vampireHunterCounter = 0;
                for (Role role : roles) {
                    if (role == Role.VAMPIRE_HUNTER) {
                        vampireHunterCounter++;
                    }
                }
                
                formatOut("        Determined that there were %s Vampire Hunter(s)", vampireHunterCounter);
                
                int counter = 0;
                for (int i = 0; i < vampireHunterCounter; i++) {
                    roles.add(Role.VIGILANTE);
                    counter++;
                }
                
                formatOut("        Added %s Vigilante's in place of Vampire Hunter", counter);
            }
        }
        
        formatOut("Determining the existence of Mafia and Mafia Killing");
        List<Role> nonMafiaKillingRoles = List.of(Role.CONSIGLIERE, Role.AMBUSHER, Role.BLACKMAILER, Role.CONSORT, Role.DISGUISER, Role.FORGER, Role.FRAMER, Role.HYPNOTIST);
        if (!(roles.contains(Role.MAFIOSO) || roles.contains(Role.GODFATHER))) {
            formatOut("    There is no Mafia Killing in the Role List, checking to see if Mafia exists.");
            boolean containsMafia = false;
            List<Role> mafiaRoles = new ArrayList<>();
            for (Role role : roles) {
                if (nonMafiaKillingRoles.contains(role)) {
                    formatOut("        Non Killing Mafia Role %s found", role.name());
                    containsMafia = true;
                    mafiaRoles.add(role);
                }
            }
            
            formatOut("    Other mafia roles exist %s", containsMafia);
            
            if (containsMafia) {
                formatOut("    Other mafia roles exist, replacing one of them with Mafioso");
                Random random = new Random();
                int index = random.nextInt(mafiaRoles.size());
                Role role = mafiaRoles.get(index);
                formatOut("        Replacing %s with Mafioso", role.name());
                roles.remove(role);
                roles.add(Role.MAFIOSO);
            }
        }
        
        System.out.println("Total roles: " + roles.size());
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
