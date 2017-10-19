package edu.towson.cosc.cosc436.jchen21.assignment3;

/**
 * Created by jchen21 on 10/19/2017.
 */
public class PurchasedItems {
    private ArrayList<StoreItem> items;
    public PurchasedItems() {
        items = new ArrayList();
    }
    public void addItem(StoreItem item) { ... }
    public double getTotalCost() { ... }
    public boolean containsItem(String itemCode) { ... }
}
