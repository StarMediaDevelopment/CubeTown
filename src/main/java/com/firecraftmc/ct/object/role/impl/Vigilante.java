package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.Alignment;
import com.firecraftmc.ct.enums.Attack;
import com.firecraftmc.ct.enums.Defense;
import com.firecraftmc.ct.enums.RoleType;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.game.Player;
import com.firecraftmc.ct.object.role.TownRole;

public class Vigilante extends TownRole {
    
    public Vigilante(Game game, Player player) {
        super(game, RoleType.VIGILANTE, player, Attack.BASIC, Defense.BASIC, 5, Alignment.KILLING);
    
        addAbilities("Choose to take justice into your own hands and shoot someone");
        addAttributes("If you shoot another Town member you will commit suicide over the guilt.", "You can only shoot your gun 3 times.");
        setKillMessage("{pronown} {verb} shot by a {rolename}");
    }
}
