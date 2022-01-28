package com.firecraftmc.ct.object.role.impl.mythical;

import com.firecraftmc.ct.enums.*;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.game.Player;

public class Werewolf extends MythicalRole {
    
    public Werewolf(Game game, Player player) {
        super(game, RoleType.WEREWOLF, player, Attack.POWERFUL, Defense.BASIC, 5, Alignment.KILLING, Goal.KILL_OPPOSE, "744A26");
        
        addAbilities("Transform into a Werewolf during the full moon.");
        addAttributes("You will Rampage at a player's house when you attack.", 
                "If you do not select a target you will stay home and Rampage at your home.");
        setKillMessage("{pronown} {verb} mauled by a {rolename}");
        setRampages(true);
        addWinConditions(FactionType.TOWN, TypeRelation.KILL,
                RoleType.VAMPIRE, TypeRelation.KILL,
                FactionType.MAFIA, TypeRelation.KILL,
                FactionType.COVEN, TypeRelation.KILL,
                FactionType.APOCALYPSE, TypeRelation.KILL,
                RoleType.ARSONIST, TypeRelation.KILL,
                RoleType.JUGGERNAUT, TypeRelation.KILL,
                RoleType.SERIAL_KILLER, TypeRelation.KILL);
    }
}
