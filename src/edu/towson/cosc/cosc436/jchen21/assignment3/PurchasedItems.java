package edu.towson.cosc.cosc436.jchen21.assignment3;

import java.util.ArrayList;

/**
 * Created by jchen21 on 10/19/2017.
 */
public class PurchasedItems {
    private ArrayList<StoreItem> items;
    public PurchasedItems() {
        items = new ArrayList<StoreItem>();
    }
    public void addItem(StoreItem item) {
        items.add(item);
    }
    public double getTotalCost() {
        double totalCost = 0;
        for(StoreItem a: items){
            totalCost = totalCost + a.getItemPrice();
        }
        return totalCost;
    }
    public boolean containsItem(String itemCode) { ... }
}
