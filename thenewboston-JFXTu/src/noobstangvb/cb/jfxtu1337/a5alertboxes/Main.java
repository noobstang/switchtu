/*
 * 
 */

package noobstangvb.cb.jfxtu1337.a5alertboxes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
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
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("thenewnoobstang");
        
        button = new Button("Click Me!");
        button.setOnAction(e -> AlertBox.display("Title of the window", "Wow this alert box is awesome"));
        
        
        StackPane layout = new StackPane();
        
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
        
    }
    
}
