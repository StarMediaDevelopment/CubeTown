package com.firecraftmc.ct.object.game;

import com.firecraftmc.ct.enums.RoleType;
import com.firecraftmc.ct.object.role.Role;

import java.util.Objects;

public class Player {
    protected final String name;
    protected RoleType roleType;
    protected Role roleInstance;
    protected Target target;
    protected boolean alive = true;
    protected boolean doused = false;
    protected boolean framed = false;
    protected boolean markedFoe = false;
    protected boolean hexed = false;
    protected boolean cleaned = false;
    protected boolean stoned = false;
    protected boolean markedBurial = false;
    protected boolean necromancerUsed = false;
    protected boolean infected = false;
    protected boolean poisoned = false;
    protected boolean obliterated = false;
    protected boolean blackmailed = false;
    protected boolean roleblocked = false;
    
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
