package com.firecraftmc.ct.object.gui;

import com.firecraftmc.ct.enums.Gender;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.game.Player;
import com.firecraftmc.ct.object.game.RoleList;
import com.firecraftmc.ct.utils.NameGenerator;
import com.starmediadev.utils.helper.StringHelper;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class MockGameGui {
    public MockGameGui(Stage stage) {
        VBox root = new VBox();
        int playerCount = 25;
    
        generate(playerCount, root);
        
        Button regenerateButton = new Button("Regenerate");
        regenerateButton.setOnAction(e -> {
            root.getChildren().clear();
            generate(playerCount, root);
            root.getChildren().add(regenerateButton);
        });
        root.getChildren().add(regenerateButton);
        
        Scene scene = new Scene(root, 400, 600);
        stage.setScene(scene);
        stage.show();
    }
    
    private void generate(int playerCount, VBox root) {
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
            Text nameAndNumber = new Text(position + ". " + player.getName() + " ");
            nameAndNumber.setFont(font);
            nameAndNumber.setFill(Color.BLACK);
        
            Text role = new Text("(" + StringHelper.capitalizeEveryWord(player.getRole().name()) + ")");
            role.setFont(font);
            role.setFill(Color.web("#" + player.getRoleInstance().getColor()));
            
            textFlow.getChildren().addAll(nameAndNumber, role);
            textFlow.addEventHandler(MouseEvent.MOUSE_CLICKED, e -> new RoleInfoDialog(player.getRoleInstance()));
            root.getChildren().add(textFlow);
        });
    }
}
