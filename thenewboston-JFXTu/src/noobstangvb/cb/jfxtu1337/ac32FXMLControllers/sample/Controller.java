/*
 * 
 */
package noobstangvb.cb.jfxtu1337.ac32FXMLControllers.sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;


/**
 * FXML Controller class
 *
 * @author noobstang
 */
public class Controller implements Initializable {

    /**
     * Initializes the controller class.
     */
    public Button button;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void handleButtonClick() {
        System.out.println("Run some code the user doesn't see");
    }
    
}
