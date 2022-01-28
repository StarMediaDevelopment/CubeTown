package com.firecraftmc.ct.object.role.impl.anarchy;

import com.firecraftmc.ct.enums.*;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.game.Player;
import com.firecraftmc.ct.object.game.Target;
import com.firecraftmc.ct.object.role.AnarchyRole;

public class Arsonist extends AnarchyRole {

    public Arsonist(Game game, Player player) {
        super(game, RoleType.ARSONIST, player, Attack.UNSTOPPABLE, Defense.BASIC, -1, Alignment.KILLING, Goal.ARSONIST, "EE7600");
        addImmunities(Immunity.DETECTION);
        addAbilities("You may Douse someone in gasoline or ignite Doused targets.");
        addAttributes("Select yourself to ignite doused people dealing an Unstoppable attack.", 
                "You will douse anybody that visits you.", 
                "If you take no action, you will attempt to clean gasoline off yourself.");
        setKillMessage("{pronown} {verb} incinerated by an {rolename}.");
    
        addWinConditions(FactionType.MAFIA, TypeRelation.KILL,
                FactionType.TOWN, TypeRelation.KILL,
                FactionType.COVEN, TypeRelation.KILL,
                FactionType.APOCALYPSE, TypeRelation.KILL,
                RoleType.JUGGERNAUT, TypeRelation.KILL,
                RoleType.SERIAL_KILLER, TypeRelation.KILL,
                RoleType.VAMPIRE, TypeRelation.KILL,
                RoleType.WEREWOLF, TypeRelation.KILL);
    }
    
    public int getPriority(Target target) {
        if (target.isSelf()) {
            return 5;
        } else {
            return 3;
        }
    }
    
    @Override
    public void otherVisit(Game game, Player player) {
        player.setDoused(true);
    }
}
