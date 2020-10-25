/*
 * 
 */

package noobstangvb.cb.jfxtu1337.aa15ListView;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
/**
 * 
 * 
 * @author noobstang
 * @date Jan 24, 2020
 * @version 1.0
 * @see java.lang.System
 */
public class MainList extends Application {
    
    Stage window;
    Scene scene;
    Button button;
    ListView<String> listView;
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("noobstangofdusk - ListViewTu1352");
        button = new Button("Submit");
        
        listView = new ListView<>();
        listView.getItems().addAll("Iron Man", "Titanic", "Contact", "Surrogates", "1", "2", "3", "4", "5");
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        
        button.setOnAction(e -> buttonClicked());
        
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20,20,20,20));
        layout.getChildren().addAll(listView, button);
        
        scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
        
    }
    
    private void buttonClicked() {
        String message = "";
        ObservableList<String> movies;
        movies = listView.getSelectionModel().getSelectedItems();
        
        for(String m: movies) {
            message += m + "\n";
        }
        
        System.out.println(message);
    }
    
}
