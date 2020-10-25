/*
 * 
 */

package noobstangvb.cb.jfxtu1337.a7closeprogram;

import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
/**
 * 
 * 
 * @author noobstang
 * @date Jan 23, 2020
 * @version 1.0
 * @see java.lang.System
 */
public class ConfirmBox {
    
    static boolean answer;
    
    public static boolean display(String title, String message) {
        
        Stage window = new Stage();
        
        //Block events to other windows
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(250);
        
        Label label = new Label();
        label.setText(message);
        
        //Create two buttons
        Button yeaButton = new Button("Yes");
        Button noButton = new Button("No");
        
        yeaButton.setOnAction(e -> {
            answer = true;
            window.close();
        });
        
        noButton.setOnAction(e -> {
            answer = false;
            window.close();
        });
        
        
        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, yeaButton, noButton);
        layout.setAlignment(Pos.CENTER);
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();
        
        return answer;
        
    }
    
    
    
}
