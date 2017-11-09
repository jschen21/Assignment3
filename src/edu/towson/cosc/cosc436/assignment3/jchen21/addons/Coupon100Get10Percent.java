package edu.towson.cosc.cosc436.assignment3.jchen21.addons;

import edu.towson.cosc.cosc436.assignment3.jchen21.decorator_assignment.PurchasedItems;
import edu.towson.cosc.cosc436.assignment3.jchen21.decorator_assignment.ReceiptDate;
import edu.towson.cosc.cosc436.assignment3.jchen21.interfaces.AddOn;
import edu.towson.cosc.cosc436.assignment3.jchen21.interfaces.Coupon;

/**
 * Created by jchen21 on 10/19/2017.
 */
public class Coupon100Get10Percent implements AddOn, Coupon {
    public boolean applies(PurchasedItems items, ReceiptDate date) {
        if(items.getTotalCost() >= 100){
            return true;
        }
        return false;
    }

    public String getLines() {
        return "Thanks for spending over $100! Here is a coupon for 10% off your next purchase.";
    }
}
