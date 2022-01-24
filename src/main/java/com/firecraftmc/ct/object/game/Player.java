package com.firecraftmc.ct.object.game;

import com.firecraftmc.ct.enums.RoleType;
import com.firecraftmc.ct.object.role.Role;

import java.util.Objects;

public class Player {
    protected final String name; //The name of the player
    protected RoleType roleType; //The role type of the player
    protected Role roleInstance; //The role instance of the player
    protected Target target, secondTarget; //The selected target(s) of the player
    protected boolean alive = true; //If the player is alive
    protected boolean doused = false; //If the player is doused
    protected boolean framed = false; //If the player is framed
    protected boolean markedFoe = false; //If the player is marked as a foe
    protected boolean hexed = false; //If the player is hexed
    protected boolean cleaned = false; //If the player was cleaned
    protected boolean stoned = false; //If the player was stoned
    protected boolean markedBurial = false; //If the player is marked for burial
    protected boolean necromancerUsed = false; //If the player's grave was used by a necromancer
    protected boolean infected = false; //If the player is infected
    protected boolean poisoned = false; //If the player is poisoned
    protected boolean obliterated = false; //If the player was obliterated
    protected boolean blackmailed = false; //If the player is blackmailed
    protected boolean roleblocked = false; //If the player is roleblocked
    
    public Player(String name, RoleType roleType) {
        this.name = name;
        this.roleType = roleType;
    }
    
    public Player(String name) {
        this.name = name;
    }
    
    public Player(String name, RoleType roleType, Role roleInstance) {
        this(name, roleType);
        this.roleInstance = roleInstance;
    }
    
    public void setRole(RoleType roleType) {
        this.roleType = roleType;
    }
    
    public void setRoleInstance(Role roleInstance) {
        this.roleInstance = roleInstance;
    }
    
    public String getName() {
        return name;
    }
    
    public RoleType getRole() {
        return roleType;
    }
    
    public Role getRoleInstance() {
        return roleInstance;
    }
    
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Player player = (Player) o;
        return Objects.equals(name, player.name);
    }
    
    public int hashCode() {
        return Objects.hash(name);
    }
    
    public boolean isAlive() {
        return alive;
    }
    
    public void setAlive(boolean alive) {
        this.alive = alive;
    }
    
    public RoleType getRoleType() {
        return roleType;
    }
    
    public boolean isDoused() {
        return doused;
    }
    
    public boolean isFramed() {
        return framed;
    }
    
    public boolean isMarkedFoe() {
        return markedFoe;
    }
    
    public boolean isHexed() {
        return hexed;
    }
    
    public boolean isCleaned() {
        return cleaned;
    }
    
    public boolean isStoned() {
        return stoned;
    }
    
    public boolean isObliterated() {
        return obliterated;
    }
    
    public boolean isMarkedBurial() {
        return markedBurial;
    }
    
    public boolean isNecromancerUsed() {
        return necromancerUsed;
    }
    
    public boolean isInfected() {
        return infected;
    }
    
    public boolean isPoisoned() {
        return poisoned;
    }
    
    public void setDoused(boolean doused) {
        this.doused = doused;
    }
    
    public void setFramed(boolean framed) {
        this.framed = framed;
    }
    
    public void setMarkedFoe(boolean markedFoe) {
        this.markedFoe = markedFoe;
    }
    
    public void setHexed(boolean hexed) {
        this.hexed = hexed;
    }
    
    public void setCleaned(boolean cleaned) {
        this.cleaned = cleaned;
    }
    
    public void setStoned(boolean stoned) {
        this.stoned = stoned;
    }
    
    public void setMarkedBurial(boolean markedBurial) {
        this.markedBurial = markedBurial;
    }
    
    public void setNecromancerUsed(boolean necromancerUsed) {
        this.necromancerUsed = necromancerUsed;
    }
    
    public void setInfected(boolean infected) {
        this.infected = infected;
    }
    
    public void setPoisoned(boolean poisoned) {
        this.poisoned = poisoned;
    }
    
    public void setObliterated(boolean obliterated) {
        this.obliterated = obliterated;
    }
    
    public void setRoleType(RoleType roleType) {
        this.roleType = roleType;
    }
    
    public boolean isBlackmailed() {
        return blackmailed;
    }
    
    public void setBlackmailed(boolean blackmailed) {
        this.blackmailed = blackmailed;
    }
    
    public void sendMessage(String message) {
        
    }
    
    public Target getTarget() {
        return target;
    }
    
    public void setTarget(Target target) {
        this.target = target;
    }
    
    public boolean isRoleblocked() {
        return roleblocked;
    }
    
    public void setRoleblocked(boolean roleblocked) {
        this.roleblocked = roleblocked;
    }
    
    @Override
    public String toString() {
        return name + ": " + roleType.name();
    }
}
