/*
 * 
 */

package noobstangvb.cb.jfxtu1337.aa17TableViewIntro;

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
import javafx.scene.control.TreeView;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TableView;
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
public class MainTable extends Application {
    
    Stage window;
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("noobstangofdusk - JavaFX");
        
        VBox vBox = new VBox();
        vBox.getChildren().addAll();
        
        Scene scene = new Scene(vBox);
        window.setScene(scene);
        window.show();
        
    }
    
}
