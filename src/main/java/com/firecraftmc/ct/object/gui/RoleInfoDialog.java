package com.firecraftmc.ct.object.gui;

import com.firecraftmc.ct.enums.Gender;
import com.firecraftmc.ct.object.role.AbstractRole;
import com.firecraftmc.ct.object.role.Horseman;
import com.firecraftmc.ct.object.role.KillingRole;
import com.starmediadev.utils.helper.StringHelper;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.util.Random;

public class RoleInfoDialog {
    public RoleInfoDialog(AbstractRole abstractRole) {
        Stage labelStage = new Stage();
        labelStage.initModality(Modality.WINDOW_MODAL);
        VBox labelRoot = new VBox();
        
        Text name = new Text(StringHelper.capitalizeEveryWord(abstractRole.getType().name().toLowerCase()));
        name.setFill(Color.web("#" + abstractRole.getColor()));
        name.setFont(Font.font("Arial", FontWeight.BOLD, 40));
        
        VBox nameBox = new VBox();
        nameBox.setAlignment(Pos.CENTER);
        nameBox.getChildren().add(name);
        labelRoot.getChildren().add(nameBox);
        
        Font infoFontBold = Font.font("Arial", FontWeight.BOLD, 20); //TODO
        Font infoFont = Font.font("Arial", 20);
        
        Label attack = new Label("Attack: " + StringHelper.capitalizeEveryWord(abstractRole.getAttack().name().toLowerCase())); //TODO Change to Text and TextFlow
        Label defense = new Label("Defense: " + StringHelper.capitalizeEveryWord(abstractRole.getDefense().name().toLowerCase())); //TODO Change to Text and TextFlow
        attack.setFont(infoFont);
        defense.setFont(infoFont);
        TextFlow alignment = new TextFlow();
        Text beginning = new Text("Alignment: ");
        beginning.setFont(infoFont);
        alignment.getChildren().add(beginning);
        Text faction = new Text(StringHelper.capitalizeEveryWord(abstractRole.getFaction().name()) + " (");
        faction.setFont(infoFont);
        faction.setFill(Color.web("#" + abstractRole.getFaction().getColor()));
        alignment.getChildren().add(faction);
        Text subAlignment = new Text(StringHelper.capitalizeEveryWord(abstractRole.getAlignment().name()));
        subAlignment.setFont(infoFont);
        subAlignment.setFill(Color.web("#44A6C6"));
        Text closing = new Text(")");
        closing.setFont(infoFont);
        closing.setFill(Color.web("#" + abstractRole.getFaction().getColor()));
        alignment.getChildren().addAll(subAlignment, closing);
        Label goal = new Label("Goal: " + abstractRole.getGoal().getText());
        goal.setFont(infoFont);
        Label abilitiesHeader = new Label("Abilities");
        abilitiesHeader.setFont(infoFontBold);
        labelRoot.getChildren().addAll(attack, defense, alignment, goal, abilitiesHeader);
        for (String ability : abstractRole.getAbilities()) {
            Label abilityLabel = new Label("- " + ability);
            abilityLabel.setFont(infoFont);
            labelRoot.getChildren().add(abilityLabel);
        }
        
        Label attributesHeader = new Label("Attributes");
        attributesHeader.setFont(infoFontBold);
        labelRoot.getChildren().add(attributesHeader);
        
        if (abstractRole.getAttributes().isEmpty()) {
            Label noneLabel = new Label("- None.");
            noneLabel.setFont(infoFont);
            labelRoot.getChildren().add(noneLabel);
        } else {
            for (String attribute : abstractRole.getAttributes()) {
                Label attributeLabel = new Label("- " + attribute);
                attributeLabel.setFont(infoFont);
                labelRoot.getChildren().add(attributeLabel);
            }
        }
        
        if (abstractRole instanceof KillingRole killingRole) {
            Label killMessageLabel = new Label("Kill Message");
            killMessageLabel.setFont(infoFontBold);
            
            Color baseColor = Color.BLACK;
            
            TextFlow message = new TextFlow();
            String rawKillMessage = killingRole.getKillMessage();
            String[] killMsgWords = rawKillMessage.split(" ");
            
            Gender gender = Gender.values()[new Random().nextInt(Gender.values().length)];
            String pronown = switch (gender) {
                case MALE -> "He";
                case FEMALE -> "She";
                case UNSPECIFIED -> "They";
            };
            for (String word : killMsgWords) {
                if (word.contains("{pronown}")) {
                    Text text = new Text(pronown);
                    text.setFont(infoFont);
                    text.setFill(baseColor);
                    message.getChildren().add(text);
                } else if (word.contains("{rolename}")) {
                    Text text;
                    if (abstractRole instanceof Horseman) {
                        text = new Text(StringHelper.capitalizeEveryWord(abstractRole.getType().name()) + ", Horseman of the Apocalypse.");
                    } else {
                        text = new Text(StringHelper.capitalizeEveryWord(abstractRole.getType().name() + word.replace("{rolename}", "").replace(" ", "_")));
                    }
                    text.setFont(infoFont);
                    text.setFill(Color.web("#" + abstractRole.getColor()));
                    message.getChildren().add(text);
                } else if (word.contains("{verb}")) {
                    String verbWord = switch (gender) {
                        case MALE, FEMALE -> "was";
                        case UNSPECIFIED -> "were";
                    };
                    Text verb = new Text(verbWord);
                    verb.setFont(infoFont);
                    verb.setFill(baseColor);
                    message.getChildren().add(verb);
                } else {
                    Text text = new Text(word);
                    text.setFill(baseColor);
                    text.setFont(infoFont);
                    message.getChildren().add(text);
                }
                message.getChildren().add(new Text(" "));
            }
    
            labelRoot.getChildren().addAll(killMessageLabel, message);
        }
        
        Scene scene = new Scene(labelRoot, 700, 500);
        labelStage.setScene(scene);
        labelStage.show();
    }
}
