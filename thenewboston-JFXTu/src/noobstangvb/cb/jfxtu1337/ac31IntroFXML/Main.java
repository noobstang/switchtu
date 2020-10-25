/*
 * 
 */

package noobstangvb.cb.jfxtu1337.ac31IntroFXML;

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
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.IntegerProperty;
import javafx.geometry.Pos;
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
        
        //Input and labels
        TextField userInput = new TextField();
        userInput.setMaxWidth(200);
        Label firstLabel = new Label("Welcome to the site ");
        Label secondLabel = new Label();
        
        HBox bottomText = new HBox(firstLabel, secondLabel);
        bottomText.setAlignment(Pos.CENTER);
        
        VBox layout = new VBox(10, userInput, bottomText);
        layout.setAlignment(Pos.CENTER);
        
        secondLabel.textProperty().bind(userInput.textProperty());
        
        Scene scene = new Scene(layout, 300, 200);
        window.setScene(scene);
        window.show();
        
        
    }
    
    
    
}
