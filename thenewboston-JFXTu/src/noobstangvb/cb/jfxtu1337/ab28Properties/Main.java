/*
 * 
 */

package noobstangvb.cb.jfxtu1337.ab28Properties;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import static java.lang.System.out;
/**
 * 
 * 
 * @author noobstang
 * @date Jan 24, 2020
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
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("noobstangofdusk");
        
        Person davy = new Person();
        
        davy.firstNameProperty().addListener((v, oldValue, newValue) -> {
            out.println("Name changed to " + newValue);
            out.println("firstNameProperty(): " + davy.firstNameProperty());
            out.println("getFirstName(): " + davy.getFirstName());
            
        });
        
        button = new Button("Submit");
        button.setOnAction(e -> davy.setFirstName("Porky"));
        
        StackPane layout = new StackPane();
        layout.getChildren().addAll(button);
        
        Scene scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
        
        
    }
    
    
    
}
