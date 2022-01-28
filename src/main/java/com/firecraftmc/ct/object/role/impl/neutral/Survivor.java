package com.firecraftmc.ct.object.role.impl.neutral;

import com.firecraftmc.ct.enums.*;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.game.Player;
import com.firecraftmc.ct.object.role.NeutralRole;

public class Survivor extends NeutralRole {
    
    private final int vests = 4;
    
    public Survivor(Game game, Player player) {
        super(game, RoleType.SURVIVOR, player, 3, Alignment.BENIGN, Goal.SURVIVOR, "C8C800");
        
        addAbilities("Put on a bulletproof vest at night.");
        addAttributes("Putting on a bulletproof vest gives you Basic defense.", 
                "You can only use the bulletproof vest 4 times.");
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
    
    public int getVests() {
        return vests;
    }
}
