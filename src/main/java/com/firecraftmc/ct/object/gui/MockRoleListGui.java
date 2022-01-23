package com.firecraftmc.ct.object.gui;

import com.firecraftmc.ct.enums.RoleType;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.game.Player;
import com.firecraftmc.ct.object.game.RoleList;
import com.firecraftmc.ct.object.role.Role;
import com.firecraftmc.ct.object.game.Target;
import com.firecraftmc.ct.utils.CTUtils;
import com.starmediadev.utils.helper.StringHelper;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.ArrayList;

public class MockRoleListGui {
    public MockRoleListGui(Stage stage, int players) {
        VBox root = new VBox();
        
        RoleList roleList = new RoleList(players);
        Game game = new Game(roleList, new ArrayList<>());
        for (RoleType roleType : roleList.getRoles()) {
            Text label = new Text(StringHelper.capitalizeEveryWord(roleType.name().toLowerCase()));
            Role role = CTUtils.createRoleInstance(roleType, game, new Player("Player"), new Target(game, "Target", false));
            label.setFill(Color.web("#" + role.getColor()));
            label.setFont(new Font(20));
            label.addEventHandler(MouseEvent.MOUSE_CLICKED, e -> new RoleInfoDialog(role));
            root.getChildren().add(label);
        }
        
        Scene scene = new Scene(root, 100, 100);
        stage.setScene(scene);
        stage.setMaximized(true);
        stage.show();
    }
}
