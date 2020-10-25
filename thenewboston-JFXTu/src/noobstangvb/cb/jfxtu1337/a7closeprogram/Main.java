/*
 * 
 */

package noobstangvb.cb.jfxtu1337.a7closeprogram;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
/**
 * 
 * 
 * @author noobstang
 * @date Jan 23, 2020
 * @version 1.0
 * @see java.lang.System
 */
public class Main extends Application {
    
    Stage window;
    Button button;
    Label status;
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("JavaFX - noobstangofdusk");
        
        
        window.setOnCloseRequest(e -> {
            closeProgram();
            e.consume();
        });
        
        button = new Button("Close Program");
        button.setOnAction(e -> {
            closeProgram();
        });
        
        StackPane layout = new StackPane();
        
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
        
    }
    
//    private void closeProgram() {
//        System.out.println("File is saved!");
//        window.close();
//    }
    
    private void closeProgram() {
        boolean answer = ConfirmBox.display("Title", "Are you sure you want to exit?");
        if (answer) window.close();
        
    }
    
}
