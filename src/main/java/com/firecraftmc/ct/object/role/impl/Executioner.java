package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.*;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.game.Player;
import com.firecraftmc.ct.object.role.NeutralRole;
import com.firecraftmc.ct.object.game.Target;

public class Executioner extends NeutralRole {
    
    public Executioner(Game game, Player player, Target target) {
        super(game, RoleType.EXECUTIONER, player, Attack.NONE, Defense.BASIC, 0, Alignment.EVIL, Goal.EXECUTIONER, "ACACAC");
        this.target = target;
        
        addImmunities(Immunity.DETECTION);
        addAbilities("Trick the Town into lynching your target.");
        addAttributes("Your target is " + target.getName(), "If you target is killed at night you will become a Jester");
    }
}
