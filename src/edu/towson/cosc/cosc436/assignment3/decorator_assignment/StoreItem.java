package edu.towson.cosc.cosc436.assignment3.decorator_assignment;

/**
 * Created by jchen21 on 10/19/2017.
 */
public class StoreItem {
    private String itemCode; // e.g., 3010
    private String itemDescription; // e.g., Dell Laptop
    private double itemPrice;
    public StoreItem(String code, String descript, double price) {
        this.itemCode = code;
        this.itemDescription = descript;
        this.itemPrice = price;
    }
// appropriate getters and setters

    public String getItemCode() {
        return itemCode;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }
}
