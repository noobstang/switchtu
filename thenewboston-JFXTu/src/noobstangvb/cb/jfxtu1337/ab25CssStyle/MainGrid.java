/*
 * 
 */

package noobstangvb.cb.jfxtu1337.ab25CssStyle;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;

import javafx.stage.Stage;
/**
 * 
 * 
 * @author noobstang
 * @date Jan 23, 2020
 * @version 1.0
 * @see java.lang.System
 */
public class MainGrid extends Application {
    
    Stage window;
    
    public static void main(String[] args) {
        launch(args);
        
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("noobstangofdusk - JavaFX");
        
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(8);
        grid.setHgap(10);
        
        //Name Label
        Label nameLabel = new Label("Username:");
        GridPane.setConstraints(nameLabel, 0, 0);
        
        //Name input
        TextField nameInput = new TextField("Noobstang");
        GridPane.setConstraints(nameInput, 1, 0);
        
        //Password Label
        Label passLabel = new Label("Password:");
        GridPane.setConstraints(passLabel, 0, 1);
        
        //Password Input
        TextField passInput = new TextField();
        passInput.setPromptText("password");
        GridPane.setConstraints(passInput, 1, 1);
        
        //Login
        Button loginButton = new Button("Log In");
        GridPane.setConstraints(loginButton, 1, 2);

        //Set style for element upon loginButton action
//        loginButton.setOnAction(e -> {
//            setUserAgentStylesheet(STYLESHEET_CASPIAN);
//        });
        
        
        grid.getChildren().addAll(nameLabel, nameInput, passLabel, passInput, loginButton);
        
        Scene scene = new Scene(grid, 300, 200);
        //Apply CSS to entire program
        scene.getStylesheets().add("Viper.css");
        window.setScene(scene);
        window.show();
    }
    
    
}
