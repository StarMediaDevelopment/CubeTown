package com.firecraftmc.ct.object.role;

import com.firecraftmc.ct.enums.*;
import com.firecraftmc.ct.enums.GameState;
import com.firecraftmc.ct.enums.NightPhase;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.game.Player;
import com.firecraftmc.ct.object.game.Target;

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
    protected Target target = null; //Target of the role, this is related to the game itself
    protected boolean rampages = false, isProtective = false; //Some booleans about the metadata of the role
    protected Defense protectiveDefense = Defense.NONE; //This is the protective defense that this role provides, the isProtective boolean should be true
    protected String killMessage = ""; //The message for this role when it kills
    protected boolean blocksGame = true; //If this role blocks a game end. This is also based on faction
    protected final Set<WinCondition> winConditions = new HashSet<>(); //Win conditions for this role. This can be based on a faction
    protected RoleType transformRole = null; //The role that this role turns into on special conditions
    
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
        addWinConditions(RoleType.SURVIVOR); //Survivor wins with everyone
        if (faction == FactionType.NEUTRAL || faction == FactionType.ANARCHY || faction == FactionType.MYTHICAL) {
            addWinConditions(type); //Adds this role as a win condition if it is not Coven, Mafia, Town or Apocalypse
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
        return priority;
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
    
    protected void addWinConditions(WinCondition... conditions) {
        this.winConditions.addAll(Arrays.asList(conditions));
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
    
    public Target getTarget() {
        return target;
    }
    
    public void setTarget(Target target) {
        this.target = target;
    }
    
    public boolean isValidTarget(GameState state, DayPhase dayPhase, NightPhase nightPhase, Target target) {
        return state == GameState.NIGHT && target != null && !target.isSelf() && target.isAlive();
    }
    
    public boolean isAstral() {
        return false;
    }
    
    public boolean canTarget(GameState state, DayPhase dayPhase, NightPhase nightPhase) {
        return state == GameState.NIGHT && priority > 0;
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
        this.isProtective = true;
    }
    
    protected final void setKillMessage(String killMessage) {
        this.killMessage = killMessage;
    }
    
    /**
     * Actions that occur when a player visits this role
     * @param game The current game
     * @param player The player that is visiting
     */
    public void otherVisit(Game game, Player player) {
        
    }
    
    /**
     * What happens when a player visits this player
     * The default implementation checks for an attack and then kills the target player using the Game.killPlayer() method
     * @param game The current game
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
}
