package com.firecraftmc.ct.object.role.impl.neutral;

import com.firecraftmc.ct.enums.*;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.game.Player;
import com.firecraftmc.ct.object.role.NeutralRole;

public class Jester extends NeutralRole {
    
    public Jester(Game game, Player player) {
        super(game, RoleType.JESTER, player, Attack.UNSTOPPABLE, Defense.NONE, 1, Alignment.EVIL, Goal.JESTER, "F49FD0");
        
        addAbilities("Trick the Town into voting against you.");
        addAttributes("If you are lynched you will attack one of your guilty or abstaining voters the following night with an Unstoppable attack.");
        setKillMessage("{pronown} died from guilt over lynching the {rolename}.");
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
