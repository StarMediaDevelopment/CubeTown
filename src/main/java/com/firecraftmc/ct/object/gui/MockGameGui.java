package com.firecraftmc.ct.object.gui;

import com.firecraftmc.ct.enums.Gender;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.game.Player;
import com.firecraftmc.ct.object.game.RoleList;
import com.firecraftmc.ct.utils.NameGenerator;
import com.starmediadev.utils.helper.StringHelper;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

//TODO
public class MockGameGui {
    public MockGameGui(Stage stage) {
        VBox root = new VBox();
        int playerCount = 15;
    
        List<Player> players = new ArrayList<>();
        for (int i = 0; i < playerCount; i++) {
            players.add(new Player(NameGenerator.generateRandomName(Gender.UNSPECIFIED)));
        }
    
        RoleList roleList = new RoleList(playerCount);
        
        Game game = new Game(roleList, players);
        game.assignRoles();
        game.initializeRoles();
        
        Font font = new Font("Arial", 20);
        game.getPlayers().forEach((position, player) -> {
            TextFlow textFlow = new TextFlow();
            Text nameAndNumber = new Text(position + ". " + player.getName() + " (");
            nameAndNumber.setFont(font);
            nameAndNumber.setFill(Color.BLACK);
            
            Text role = new Text(StringHelper.capitalizeEveryWord(player.getRole().name()));
            role.setFont(font);
            role.setFill(Color.web("#" + player.getRoleInstance().getColor()));
            
            Text closingPar = new Text(")");
            closingPar.setFont(font);
            closingPar.setFill(Color.BLACK);
            textFlow.getChildren().addAll(nameAndNumber, role, closingPar);
            root.getChildren().add(textFlow);
        });
        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setMaximized(true);
        stage.show();
    }
}
