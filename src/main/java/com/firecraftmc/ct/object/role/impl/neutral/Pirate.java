package com.firecraftmc.ct.object.role.impl.neutral;

import com.firecraftmc.ct.enums.*;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.game.Player;

public class Pirate extends NeutralRole {
    
    public Pirate(Game game, Player player) {
        super(game, RoleType.PIRATE, player, Attack.POWERFUL, Defense.NONE, 1, Alignment.KILLING, Goal.PIRATE, "DBAD59");
        
        addImmunities(Immunity.CONTROL, Immunity.DETECTION, Immunity.ROLEBLOCK);
        
        addAbilities("Choose a player to plunder each night.");
        addAttributes("When you plunder a player, you will duel the player for their valuables.", 
                "If the player defends against your attack, you get no loot.");
        setKillMessage("{pronown} {verb} plundered by the {rolename}.");
        addWinConditions(FactionType.MAFIA, TypeRelation.WIN,
                FactionType.TOWN, TypeRelation.WIN,
                RoleType.ARSONIST, TypeRelation.WIN,
                FactionType.COVEN, TypeRelation.WIN,
                FactionType.APOCALYPSE, TypeRelation.WIN,
                RoleType.JUGGERNAUT, TypeRelation.WIN,
                RoleType.SERIAL_KILLER, TypeRelation.WIN,
                RoleType.VAMPIRE, TypeRelation.WIN,
                RoleType.WEREWOLF, TypeRelation.WIN);
    }
}
