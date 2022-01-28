package com.firecraftmc.ct.object.role.impl.mythical;

import com.firecraftmc.ct.enums.*;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.game.Player;
import com.firecraftmc.ct.object.role.MythicalRole;

public class Vampire extends MythicalRole {
    
    private boolean youngest;
    
    public Vampire(Game game, Player player) {
        super(game, RoleType.VAMPIRE, player, 5, Alignment.CHAOS, Goal.CONVERT, "7B8867");
        
        addImmunities(Immunity.DETECTION);
        addAbilities("Convert others to Vampires at night.");
        addAttributes("Vampires vote at night to bite a target.", "The youngest Vampire will visit the target at night.");
        setKillMessage("{pronown} {verb} bitten by a {rolename}.");
        addWinConditions(FactionType.TOWN, TypeRelation.KILL,
                RoleType.WEREWOLF, TypeRelation.KILL,
                FactionType.MAFIA, TypeRelation.KILL,
                FactionType.COVEN, TypeRelation.KILL,
                FactionType.APOCALYPSE, TypeRelation.KILL,
                RoleType.ARSONIST, TypeRelation.KILL,
                RoleType.JUGGERNAUT, TypeRelation.KILL,
                RoleType.SERIAL_KILLER, TypeRelation.KILL);
    }
}
