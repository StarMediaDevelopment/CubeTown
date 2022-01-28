package com.firecraftmc.ct.object.role.impl.neutral;

import com.firecraftmc.ct.enums.*;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.game.Player;
import com.firecraftmc.ct.object.game.Target;

public class GuardianAngel extends NeutralRole {
    
    private Target target;
    
    private int protections = 3;
    
    public GuardianAngel(Game game, Player player, Target target) {
        super(game, RoleType.GUARDIAN_ANGEL, player, 2, Alignment.BENIGN, Goal.GUARDIAN_ANGEL, "c48a63");
        this.target = target;
        
        addImmunities(Immunity.DETECTION, Immunity.ROLEBLOCK);
        addAbilities("Keep your target alive.");
        addAttributes("Your target is " + target.getName(), 
                "If your target is killed you will become a Survivor without any bulletproof vests.", 
                "Three times a game you may Heal and Purge your target.", 
                "This may be done from the grave. Watching over a player ignores Jail.");
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
    
    public Target getTarget() {
        return target;
    }
}