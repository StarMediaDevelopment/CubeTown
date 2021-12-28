package com.firecraftmc.ct.object.game;

import com.firecraftmc.ct.enums.Role;

import java.util.*;

import static com.firecraftmc.ct.CubeTown.formatOut;

public class RoleList {
    protected List<Role> roles = new LinkedList<>();
    
    public RoleList(int totalPlayers) {
        formatOut("Determining the chances for each of the different roles.");
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
        List<Role> roles = new LinkedList<>();
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
}
