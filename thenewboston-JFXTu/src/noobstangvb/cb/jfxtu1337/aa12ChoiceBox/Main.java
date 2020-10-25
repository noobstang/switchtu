/*
 * 
 */

package noobstangvb.cb.jfxtu1337.aa12ChoiceBox;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
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
        window.setTitle("ChoiceBox Demo");
        button = new Button("Click me");
        
        ChoiceBox<String> choiceBox = new ChoiceBox<>();
        
        //getItems returns the ObservableList obejct which you can add items to
        choiceBox.getItems().add("");
        choiceBox.getItems().add("Apples");
        choiceBox.getItems().add("Bananas");
        choiceBox.getItems().addAll("Bacon", "Ham", "Meatballs");
        
        //Set a default value
        choiceBox.setValue("");
        
        button.setOnAction(e -> getChoice(choiceBox));
        
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20,20,20,20));
        layout.getChildren().addAll(choiceBox, button);
        
        scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
        
        
    }
    
    //To get the value of the selected item
    private void getChoice(ChoiceBox<String> choiceBox) {
        String food = choiceBox.getValue();
        System.out.println(food);
        
    }
}
