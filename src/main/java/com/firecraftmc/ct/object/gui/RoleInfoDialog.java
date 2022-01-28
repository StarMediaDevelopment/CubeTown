package com.firecraftmc.ct.object.gui;

import com.firecraftmc.ct.enums.*;
import com.firecraftmc.ct.object.game.WinCondition;
import com.firecraftmc.ct.object.role.impl.apocalypse.acolyte.AcolyteRole;
import com.firecraftmc.ct.object.role.impl.apocalypse.horseman.Horseman;
import com.firecraftmc.ct.object.role.Role;
import com.firecraftmc.ct.utils.CTUtils;
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
    
    private static int WIDTH = 800, HEIGHT = 600;
    
    private Stage stage;
    
    public RoleInfoDialog(Role role) {
        stage = new Stage();
        stage.initModality(Modality.WINDOW_MODAL);
        VBox root = generateRoot(role);
        
        Scene scene = new Scene(root, WIDTH, HEIGHT);
        stage.setScene(scene);
        stage.show();
    }
    
    private VBox generateRoot(Role role) {
        VBox root = new VBox();
    
        Text name = new Text(StringHelper.capitalizeEveryWord(role.getType().name().toLowerCase()));
        name.setFill(Color.web("#" + role.getColor()));
        name.setFont(Font.font("Arial", FontWeight.BOLD, 40));
    
        VBox nameBox = new VBox();
        nameBox.setAlignment(Pos.CENTER);
        nameBox.getChildren().add(name);
        root.getChildren().add(nameBox);
    
        Font infoFontBold = Font.font("Arial", FontWeight.BOLD, 20);
        Font infoFont = Font.font("Arial", 20);
    
        TextFlow attackFlow = new TextFlow();
        Text attackText = new Text("Attack: ");
        Text attackValue = new Text(CTUtils.formatEnum(role.getAttack()));
        attackText.setFont(infoFontBold);
        attackValue.setFont(infoFont);
        attackFlow.getChildren().addAll(attackText, attackValue);
    
        TextFlow defenseFlow = new TextFlow();
        Text defenseText = new Text("Defense: ");
        Text defenseValue = new Text(CTUtils.formatEnum(role.getDefense()));
        defenseText.setFont(infoFontBold);
        defenseValue.setFont(infoFont);
        defenseFlow.getChildren().addAll(defenseText, defenseValue);
    
        root.getChildren().addAll(attackFlow, defenseFlow);
        TextFlow alignment = new TextFlow();
        Text beginning = new Text("Alignment: ");
        beginning.setFont(infoFontBold);
        alignment.getChildren().add(beginning);
        Text faction = new Text(StringHelper.capitalizeEveryWord(role.getFaction().name()) + " (");
        faction.setFont(infoFont);
        faction.setFill(Color.web("#" + role.getFaction().getColor()));
        alignment.getChildren().add(faction);
        Text subAlignment = new Text(StringHelper.capitalizeEveryWord(role.getAlignment().name()));
        subAlignment.setFont(infoFont);
        subAlignment.setFill(Color.web("#44A6C6"));
        Text closing = new Text(")");
        closing.setFont(infoFont);
        closing.setFill(Color.web("#" + role.getFaction().getColor()));
        alignment.getChildren().addAll(subAlignment, closing);
        Label abilitiesHeader = new Label("Abilities");
        abilitiesHeader.setFont(infoFontBold);
        root.getChildren().addAll(alignment, abilitiesHeader);
        for (String ability : role.getAbilities()) {
            Label abilityLabel = new Label("- " + ability);
            abilityLabel.setFont(infoFont);
            root.getChildren().add(abilityLabel);
        }
    
        Label attributesHeader = new Label("Attributes");
        attributesHeader.setFont(infoFontBold);
        root.getChildren().add(attributesHeader);
    
        if (role.getAttributes().isEmpty()) {
            Label noneLabel = new Label("- None.");
            noneLabel.setFont(infoFont);
            root.getChildren().add(noneLabel);
        } else {
            for (String attribute : role.getAttributes()) {
                Label attributeLabel = new Label("- " + attribute);
                attributeLabel.setFont(infoFont);
                root.getChildren().add(attributeLabel);
            }
        }
    
        Label goalLabel = new Label("Goal");
        goalLabel.setFont(infoFontBold);
    
        Label goalText = new Label(role.getGoal().getText());
        goalText.setFont(infoFont);
    
        root.getChildren().addAll(goalLabel, goalText);
    
        if (role.getKillMessage() != null && !role.getKillMessage().equals("")) {
            Label killMessageLabel = new Label("Kill Message");
            killMessageLabel.setFont(infoFontBold);
        
            Color baseColor = Color.BLACK;
        
            TextFlow message = new TextFlow();
            String rawKillMessage = role.getKillMessage();
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
                    if (role instanceof Horseman) {
                        text = new Text(StringHelper.capitalizeEveryWord(role.getType().name()) + ", Horseman of the Apocalypse.");
                    } else {
                        text = new Text(StringHelper.capitalizeEveryWord(role.getType().name() + word.replace("{rolename}", "").replace(" ", "_")));
                    }
                    text.setFont(infoFont);
                    text.setFill(Color.web("#" + role.getColor()));
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
        
            root.getChildren().addAll(killMessageLabel, message);
        }
    
        Label winConditionsLabel = new Label("Win Conditions");
        winConditionsLabel.setFont(infoFontBold);
        root.getChildren().add(winConditionsLabel);
//        for (BaseType baseType : role.getWinConditions()) {
//            TextFlow conditionLabel = new TextFlow();
//            Text base = new Text("Wins with ");
//            base.setFont(infoFont);
//            Text conditionText = new Text(StringHelper.capitalizeEveryWord(baseType.name()));
//            conditionText.setFont(infoFont);
//            conditionText.setFill(Color.web("#" + baseType.getColor()));
//            conditionLabel.getChildren().addAll(base, conditionText);
//            root.getChildren().add(conditionLabel);
//        }
    
        for (WinCondition winCondition : role.getWinConditions()) {
            TextFlow conditionLabel = new TextFlow();
            BaseType baseType = winCondition.getBaseType();
            TypeRelation relation = winCondition.getTypeRelation();
            Text base = null;
            if (relation == TypeRelation.WIN) {
                if (baseType instanceof FactionType) {
                    base = new Text("Wins with the ");
                } else if (baseType instanceof RoleType roleType) {
                    if (roleType.isUnique()) {
                        base = new Text("Wins with the ");
                    } else {
                        base = new Text("Wins with ");
                    }
                }
            } else if (relation == TypeRelation.KILL) {
                if (baseType instanceof FactionType) {
                    base = new Text("Must kill the ");
                } else if (baseType instanceof RoleType roleType) {
                    if (roleType.isUnique()) {
                        base = new Text("Must kill the ");
                    } else {
                        base = new Text("Must kill ");
                    }
                }
            }
            
            if (base == null) {
                continue;
            }
            
            base.setFont(infoFont);
            
            Text typeText = new Text(StringHelper.capitalizeEveryWord(baseType.name()));
            if (baseType instanceof RoleType roleType) {
                if (!roleType.isUnique()) {
                    typeText.setText(typeText.getText() + "s");
                }
            }
            
            typeText.setFont(infoFont);
            typeText.setFill(Color.web("#" + baseType.getColor()));
            
            conditionLabel.getChildren().addAll(base, typeText);
            root.getChildren().add(conditionLabel);
        }
    
        if (role instanceof AcolyteRole acolyteRole) {
            Horseman horseman = (Horseman) CTUtils.createRoleInstance(acolyteRole.getHorsemanTransformation(), role.getGame(), role.getPlayer());
        
            Label acolyteInfo = new Label("Horseman Tranformation");
            acolyteInfo.setFont(infoFontBold);
        
            Label horsemanTransformation = new Label(StringHelper.capitalizeEveryWord(horseman.getType().name()) + ", Horseman of the Apocalypse");
            horsemanTransformation.setFont(infoFont);
            horsemanTransformation.setTextFill(Color.web("#" + horseman.getColor()));
        
            root.getChildren().addAll(acolyteInfo, horsemanTransformation);
        }
        return root;
    }
}
