package com.firecraftmc.ct.object.gui;

import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.game.RoleList;
import com.firecraftmc.ct.object.role.AbstractRole;
import com.firecraftmc.ct.object.game.Target;
import com.firecraftmc.ct.utils.CTUtils;
import com.starmediadev.utils.helper.StringHelper;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.ArrayList;

public class MainRoleListGui {
    public MainRoleListGui(Stage stage) {
        VBox root = new VBox();
        ScrollPane scrollPane = new ScrollPane(root);
    
        Game game = new Game(RoleList.ALL_ROLES_LIST, new ArrayList<>());
        for (Role role : Role.values()) {
            Text label = new Text(StringHelper.capitalizeEveryWord(role.name().toLowerCase()));
            AbstractRole abstractRole = CTUtils.createRoleInstance(role, game, new Target("Player 1", false));
            label.setFill(Color.web("#" + abstractRole.getColor()));
            label.setFont(new Font(20));
            label.addEventHandler(MouseEvent.MOUSE_CLICKED, e -> new RoleInfoDialog(abstractRole));
            root.getChildren().add(label);
        }
    
        Scene scene = new Scene(scrollPane, 100, 100);
        stage.setScene(scene);
        stage.setMaximized(true);
        stage.show();
    }
}