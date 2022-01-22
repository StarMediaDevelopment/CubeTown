package com.firecraftmc.ct;

import com.firecraftmc.ct.object.gui.MockGameGui;
import javafx.application.Application;
import javafx.stage.Stage;

public class CubeTown extends Application {
    
    //TODO Include Horseman of the Apocalypse at the end when processing names for horseman roles
    
    public void start(Stage stage) {
        new MockGameGui(stage);
    }
    
    public static void main(String[] args) {
        launch();
    }
    
    public static void formatOut(String text, Object... args) {
        //System.out.printf((text) + "%n", args);
    }
    
    //Process what would be a visit before any actions are taken and then produce messages/preventions based on role priority
}
