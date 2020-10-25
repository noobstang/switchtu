/*
 * 
 */

package noobstangvb.cb.jfxtu1337.a6commbtwnwindows;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import noobstangvb.cb.jfxtu1337.a5alertboxes.AlertBox;
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
        window.setTitle("thenewnoobstang");
        
        status = new Label();
        status.setText("LAWL");
        
        button = new Button("Click Me!");
        button.setOnAction(e -> AlertBox.display("Title of the window", "Wow this alert box is awesome"));
        
        button.setOnAction(e -> {
            boolean result = ConfirmBox.display("Title of Window", "Are you sure you want to order broken bottles?");
            System.out.println(result);
            
            String resultStr;
            
            if (result) {
                resultStr = "true";
            } else {
                resultStr = "false";
            }
                        
            status.setText(resultStr);
        });
        
        StackPane layout = new StackPane();
        
        layout.getChildren().addAll(button, status);
        Scene scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
        
    }
    
}
