package com.firecraftmc.ct.object.game;

import com.firecraftmc.ct.enums.Gender;
import com.firecraftmc.ct.utils.NameGenerator;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    
    @Test
    void handleEndOfNight() {
        RoleList roleList = RoleList.ALL_ROLES_LIST_NON_HORSEMAN;
        int playerCount = roleList.size();
        List<Player> players = new ArrayList<>();
        for (int i = 0; i < playerCount; i++) {
            players.add(new Player(NameGenerator.generateRandomName(Gender.UNSPECIFIED)));
        }
        Game game = new Game(roleList, players);
        game.assignRoles();
        game.initializeRoles();
        assertDoesNotThrow(game::handleEndOfNight);
    }
}