package edu.towson.cosc.cosc436.assignment3.jchen21;

/**
 * Created by jchen21 on 10/19/2017.
 */
public interface AddOn { // the type of added info to a BasicReceipt (e.g., greetings, rebates, coupons)
    public boolean applies(PurchasedItems items);
    public String getLines();
}
