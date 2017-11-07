package edu.towson.cosc.cosc436.assignment3.jchen21.interfaces;

import edu.towson.cosc.cosc436.assignment3.jchen21.decorator_assignment.PurchasedItems;

/**
 * Created by jchen21 on 10/19/2017.
 */
public interface AddOn { // the type of added info to a BasicReceipt (e.g., greetings, rebates, coupons)
    boolean applies(PurchasedItems items);
    String getLines();
}
