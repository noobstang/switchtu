/*
 * 
 */

package noobstangvb.cb.jfxtu1337.aa11CheckBox;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.geometry.Insets;
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
    Scene scene;
    Button button;
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Checkbox Example");
        
        //Checkboxes
        CheckBox box1 = new CheckBox("Bacon");
        CheckBox box2 = new CheckBox("Tuna");
        
        //Button
        button = new Button("Order Now!");
        button.setOnAction(e -> handleOptions(box1, box2));
        
        //Layout
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20,20,20,20));
        layout.getChildren().addAll(box1, box2, button);
        
        scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
    }
    
    //Handles checkbox options
    private void handleOptions(CheckBox box1, CheckBox box2) {
        String message = "Users order:\n";
        
        if(box1.isSelected()) 
            message += "Bacon\n";
        
        if(box2.isSelected())
            message += "Tuna\n";
        
        System.out.println(message);
    }
    
    
}
