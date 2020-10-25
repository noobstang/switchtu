/*
 * 
 */

package noobstangvb.cb.jfxtu1337.ac32FXMLControllers;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
/**
 * 
 * 
 * @author noobstang
 * @date Jan 24, 2020
 * @version 1.0
 * @see java.lang.System
 */
public class Main extends Application {
    
    public static void main (String[] args) {
        launch(args);
        
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/home/noobstang/gan/NetbeansProjects/JFXTu1337/src/me/noobstangofdusk/cb/jfxtu1337/ac32FXMLControllers/sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
        
    }
    
}
