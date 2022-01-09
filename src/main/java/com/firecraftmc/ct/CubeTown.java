package com.firecraftmc.ct;

import com.firecraftmc.ct.enums.Role;
import com.firecraftmc.ct.object.game.Game;
import com.firecraftmc.ct.object.role.AbstractRole;
import com.starmediadev.utils.helper.StringHelper;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class CubeTown extends Application {
    
    public void start(Stage stage) throws Exception {
        VBox root = new VBox();
        ScrollPane scrollPane = new ScrollPane(root);
    
        Game game = new Game();
        for (Role role : Role.values()) {
            javafx.scene.control.Label label = new Label(StringHelper.capitalizeEveryWord(role.name().toLowerCase()));
            AbstractRole abstractRole = (AbstractRole) role.getClazz().getConstructor(Game.class).newInstance(game);
            label.setTextFill(Color.web("#" + abstractRole.getColor()));
            label.setFont(new Font(20));
            label.addEventHandler(MouseEvent.MOUSE_CLICKED, e -> {
                Stage labelStage = new Stage();
                labelStage.initModality(Modality.APPLICATION_MODAL);
                VBox labelRoot = new VBox();
                Label attack = new Label("Attack: " + StringHelper.capitalizeEveryWord(abstractRole.getAttack().name().toLowerCase()));
                Label defense = new Label("Defense: " + StringHelper.capitalizeEveryWord(abstractRole.getDefense().name().toLowerCase()));
                TextFlow alignment = new TextFlow();
                Text beginning = new Text("Alignment: ");
                alignment.getChildren().add(beginning);
                Text faction = new Text(StringHelper.capitalizeEveryWord(abstractRole.getFaction().name()) + " (");
                faction.setFill(Color.web("#" + abstractRole.getFaction().getColor()));
                alignment.getChildren().add(faction);
                Text subAlignment = new Text(StringHelper.capitalizeEveryWord(abstractRole.getAlignment().name()));
                subAlignment.setFill(Color.web("#44A6C6"));
                Text closing = new Text(")");
                closing.setFill(Color.web("#" + abstractRole.getFaction().getColor()));
                alignment.getChildren().addAll(subAlignment, closing);
                Label goal = new Label("Goal: " + abstractRole.getGoal().getText());
                Label abilitiesHeader = new Label("Abilities");
                labelRoot.getChildren().addAll(attack, defense, alignment, goal, abilitiesHeader);
                for (String ability : abstractRole.getAbilities()) {
                    labelRoot.getChildren().add(new Label("- " + ability));
                }
                
                Label attributesHeader = new Label("Attributes");
                labelRoot.getChildren().add(attributesHeader);
    
                if (abstractRole.getAttributes().isEmpty()) {
                    labelRoot.getChildren().add(new Label("- None."));
                } else {
                    for (String attribute : abstractRole.getAttributes()) {
                        labelRoot.getChildren().add(new Label("- " + attribute));
                    }
                }
                
                labelStage.setScene(new Scene(labelRoot, 400, 500));
                labelStage.show();
            });
            root.getChildren().add(label);
        }
        
        Scene scene = new Scene(scrollPane, 100, 100);
        stage.setScene(scene);
        stage.setMaximized(true);
        stage.show();
    }
    
    public static void main(String[] args) {
        launch();
    }
    
    public static void formatOut(String text, Object... args) {
        System.out.printf((text) + "%n", args);
    }
    
    //Process what would be a visit before any actions are taken and then produce messages/preventions based on role priority
}
