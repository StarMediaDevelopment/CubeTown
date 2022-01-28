package com.firecraftmc.ct.object.role;

import com.firecraftmc.ct.enums.*;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.game.Player;
import com.firecraftmc.ct.object.game.Target;
import com.firecraftmc.ct.object.game.WinCondition;
import com.firecraftmc.ct.utils.CTUtils;

import java.util.*;

public abstract class Role {
    
    protected final Game game; //The game that this references
    protected final Player player; //The player for this role
    protected final RoleType type; //The enum type that this role references
    protected Attack attack = Attack.NONE; //The attack value of the role
    protected Defense defense = Defense.NONE; //The defense value of the role, this is separate from any temporary defense
    protected int priority; //The role priority, this is not a concrete value as some roles override the method
    protected final FactionType faction; //The faction of this role
    protected final Alignment alignment; //The alignment for this role 
    protected final Goal goal; //The goal for this role
    protected final String color; //The color of this role
    protected final Set<Immunity> immunities = new HashSet<>(); //All immunities for this role
    protected final List<String> abilities = new LinkedList<>(); //The abilities of this role
    protected final List<String> attributes = new LinkedList<>(); //The attributes of this role
    protected boolean rampages = false, isProtective = false; //Some booleans about the metadata of the role
    protected Defense protectiveDefense = Defense.NONE; //This is the protective defense that this role provides, the isProtective boolean should be true
    protected String killMessage = ""; //The message for this role when it kills
    protected boolean blocksGame = true; //If this role blocks a game end. This is also based on faction
    protected RoleType transformRole = null; //The role that this role turns into on special conditions
    protected final Set<WinCondition> winConditions = new HashSet<>();
     protected boolean roleblocksOthers = false; //If this role roleblocks others
    
    public Role(Game game, RoleType type, Player player, Attack attack, Defense defense, int priority, FactionType faction, Alignment alignment, Goal goal, String color) {
        this(game, type, player, priority, faction, alignment, goal, color);
        this.attack = attack;
        this.defense = defense;
    }
    
    public Role(Game game, RoleType type, Player player, int priority, FactionType faction, Alignment alignment, Goal goal, String color) {
        this.game = game;
        this.type = type;
        this.player = player;
        this.faction = faction;
        this.alignment = alignment;
        this.goal = goal;
        this.color = color;
        this.priority = priority;
        addWinConditions(RoleType.SURVIVOR, TypeRelation.WIN); //Survivor wins with everyone
        if (faction == FactionType.NEUTRAL || faction == FactionType.ANARCHY || faction == FactionType.MYTHICAL) {
            addWinConditions(type, TypeRelation.WIN); //Adds this role as a win condition if it is not Coven, Mafia, Town or Apocalypse
        }
    }
    
    public RoleType getType() {
        return type;
    }
    
    public Attack getAttack() {
        return attack;
    }
    
    public Defense getDefense() {
        return defense;
    }
    
    public void setAttack(Attack attack) {
        this.attack = attack;
    }
    
    public void setDefense(Defense defense) {
        this.defense = defense;
    }
    
    public void setPriority(int priority) {
        this.priority = priority;
    }
    
    public int getPriority() {
        return getPriority(null);
    }
    
    public Set<Immunity> getImmunities() {
        return immunities;
    }
    
    public List<String> getAbilities() {
        return abilities;
    }
    
    public List<String> getAttributes() {
        return attributes;
    }
    
    protected void addAbilities(String... abilities) {
        this.abilities.addAll(Arrays.asList(abilities));
    }
    
    protected void addAttributes(String... attributes) {
        this.attributes.addAll(Arrays.asList(attributes));
    }
    
    protected void addImmunities(Immunity... immunities) {
        this.immunities.addAll(Arrays.asList(immunities));
    }
    
    protected void addWinCondition(BaseType baseType, TypeRelation typeRelation) {
        this.winConditions.add(new WinCondition(baseType, typeRelation));
    }
    
    public int getPriority(Target target) {
        return priority;
    }
    
    protected void addWinConditions(Object... objects) {
        if (objects == null) {
            throw new IllegalArgumentException("Win Conditions varargs is null for type " + getClass().getName());
        }
        
        if (objects.length % 2 != 0) {
            throw new IllegalArgumentException("Win Conditions varargs is not divisible by 2 for type " + getClass().getName());
        }
        
        for (int i = 0; i < objects.length; i += 2) {
            Object typeRaw = objects[i];
            Object relationRaw = objects[i+1];
            BaseType baseType;
            TypeRelation typeRelation;
            
            if (typeRaw instanceof BaseType type) {
                baseType = type;
            } else {
                throw new IllegalArgumentException("BaseType argument is not a valid BaseType");
            }
            
            if (relationRaw instanceof TypeRelation relation) {
                typeRelation = relation;
            } else {
                throw new IllegalArgumentException("TypeRelation argument is not a valid TypeRelation");
            }
            
            addWinCondition(baseType, typeRelation);
        }
    }
    
    public Game getGame() {
        return game;
    }
    
    public FactionType getFaction() {
        return faction;
    }
    
    public Alignment getAlignment() {
        return alignment;
    }
    
    public Goal getGoal() {
        return goal;
    }
    
    public String getColor() {
        return color;
    }
    
    public boolean isValidTarget(Game game, Target target) {
        return CTUtils.isNight(game) && CTUtils.defaultTargetValid(target);
    }
    
    public boolean isAstral() {
        return false;
    }
    
    public boolean canTarget(Game game) {
        return CTUtils.isNight(game) && priority > 0;
    }
    
    public boolean doesRampage() {
        return rampages;
    }
    
    public boolean isProtective() {
        return isProtective;
    }
    
    public Defense getProtectiveDefense() {
        return protectiveDefense;
    }
    
    public String getKillMessage() {
        return killMessage;
    }
    
    protected final void setRampages(boolean rampages) {
        this.rampages = rampages;
    }
    
    protected final void setProtectiveDefense(Defense protectiveDefense) {
        this.protectiveDefense = protectiveDefense;
        this.isProtective = protectiveDefense != Defense.NONE;
    }
    
    protected final void setKillMessage(String killMessage) {
        this.killMessage = killMessage;
    }
    
    /**
     * Actions that occur when a player visits this role
     *
     * @param game   The current game
     * @param player The player that is visiting
     */
    public void otherVisit(Game game, Player player) {
        
    }
    
    /**
     * What happens when a player visits this player
     * The default implementation checks for an attack and then kills the target player using the Game.killPlayer() method
     *
     * @param game   The current game
     * @param player The player that is the target
     */
    public void visit(Game game, Player player) {
        if (attack != Attack.NONE) {
            game.killPlayer(this, player);
        }
    }
    
    protected void setBlocksGame(boolean blocksGame) {
        this.blocksGame = blocksGame;
    }
    
    public Set<WinCondition> getWinConditions() {
        return winConditions;
    }
    
    public RoleType getTransformRole() {
        return transformRole;
    }
    
    public Player getPlayer() {
        return player;
    }
    
    public void setRoleblocksOthers(boolean roleblocksOthers) {
        this.roleblocksOthers = roleblocksOthers;
    }
    
    public boolean doesRoleblockOthers() {
        return roleblocksOthers;
    }
}
