/*
 * 
 */

package noobstangvb.cb.jfxtu1337.ab20TableRowsAddDelete;

/**
 * 
 * 
 * @author noobstang
 * @date Jan 24, 2020
 * @version 1.0
 * @see java.lang.System
 */
public class Product {
    
    private String name;
    private double price;
    private int quantity;
    
    public Product() {
        this.name = "";
        this.price = 0;
        this.quantity = 0;
    }
    
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
    
}
