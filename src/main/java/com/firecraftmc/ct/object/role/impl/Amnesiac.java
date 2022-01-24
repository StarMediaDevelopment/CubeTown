package com.firecraftmc.ct.object.role.impl;

import com.firecraftmc.ct.enums.*;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.game.Player;
import com.firecraftmc.ct.object.game.Target;
import com.firecraftmc.ct.object.role.NeutralRole;
import com.firecraftmc.ct.object.role.Role;

import java.util.Set;

public class Amnesiac extends NeutralRole {
    
    private Role rememberedRole;
    
    public Amnesiac(Game game, Player player) {
        super(game, RoleType.AMNESIAC, player, 6, Alignment.BENIGN, Goal.AMNESIAC, "44A6C6");
        addImmunities(Immunity.DETECTION);
        addAbilities("Remember who you were like by selecting a graveyard role.");
        addAttributes("When you choose a role it will be revealed to all the players in the game.");
    }
    
    @Override
    public boolean isValidTarget(GameState state, DayPhase dayPhase, NightPhase nightPhase, Target target) {
        boolean valid = state == GameState.NIGHT && target != null && !target.isAlive() && !target.isSelf();
        Player targetPlayer = game.getPlayer(target.getName());
        return valid && !targetPlayer.isCleaned() && !targetPlayer.isStoned();
    }
    
    @Override
    public Set<WinCondition> getWinConditions() {
        if (rememberedRole != null) {
            return rememberedRole.getWinConditions();
        }
        return super.getWinConditions();
    }
}
