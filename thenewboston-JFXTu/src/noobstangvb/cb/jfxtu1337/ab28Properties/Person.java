/*
 * 
 */

package noobstangvb.cb.jfxtu1337.ab28Properties;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
/**
 * 
 * 
 * @author noobstang
 * @date Jan 24, 2020
 * @version 1.0
 * @see java.lang.System
 */
public class Person {
    
//    String firstName = "";
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
    
    private StringProperty firstName = new SimpleStringProperty(this, "firstName", "");
    
    public StringProperty firstNameProperty() {
        return firstName;
    }
    
    public StringProperty getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }

    
    
    
    
}
