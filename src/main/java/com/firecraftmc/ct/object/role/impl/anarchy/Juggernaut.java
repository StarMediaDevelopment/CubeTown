package com.firecraftmc.ct.object.role.impl.anarchy;

import com.firecraftmc.ct.enums.*;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.game.Player;
import com.firecraftmc.ct.object.role.AnarchyRole;

public class Juggernaut extends AnarchyRole {
    private int kills = -1;
    
    public Juggernaut(Game game, Player player) {
        super(game, RoleType.JUGGERNAUT, player, Attack.POWERFUL, Defense.BASIC, 5, Alignment.KILLING, Goal.KILL_OPPOSE, "631A35");
        
        addAbilities("You may choose to attack a player on full moon nights.");
        setKillMessage("{pronown} {verb} assaulted by the {rolename}.");
        incrementKills(); //Sets the base abilities
        addWinConditions(FactionType.MAFIA, TypeRelation.KILL,
                FactionType.TOWN, TypeRelation.KILL,
                RoleType.ARSONIST, TypeRelation.KILL,
                FactionType.COVEN, TypeRelation.KILL,
                FactionType.APOCALYPSE, TypeRelation.KILL,
                RoleType.SERIAL_KILLER, TypeRelation.KILL,
                RoleType.VAMPIRE, TypeRelation.KILL,
                RoleType.WEREWOLF, TypeRelation.KILL);
    }
    
    public void incrementKills() {
        kills += 1;
        abilities.clear();
        attributes.clear();
        if (kills > 0) {
            addAbilities("You may choose to attack someone each night.");
        }
        
        if (kills >= 0 && kills <= 2) {
            addAttributes("With each kill your powers grow");
        }
        
        if (kills == 3) {
            addAttributes("You have reached ultimate power");
        }
        
        if (kills == 1) {
            addAttributes("You may now attack every night");
        }
        
        if (kills >= 2) {
            addAttributes("You may attack every night");
        }
        
        if (kills == 2) {
            addAttributes("You now Rampage when you attack");
            setRampages(true);
        }
        
        if (kills >= 3) {
            addAttributes("You Rampage when you attack", "You ignore all effects that would protect a player");
            setAttack(Attack.UNSTOPPABLE);
        }
    }
}
