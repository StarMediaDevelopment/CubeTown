package com.firecraftmc.ct.object.role.impl.neutral;

import com.firecraftmc.ct.enums.*;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.game.Player;
import com.firecraftmc.ct.object.game.WinCondition;
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
    
    @Override
    public Set<WinCondition> getWinConditions() {
        if (rememberedRole != null) {
            return rememberedRole.getWinConditions();
        }
        return super.getWinConditions();
    }
    
    public void setRememberedRole(Role rememberedRole) {
        this.rememberedRole = rememberedRole;
    }
    
    public Role getRememberedRole() {
        return rememberedRole;
    }
}
