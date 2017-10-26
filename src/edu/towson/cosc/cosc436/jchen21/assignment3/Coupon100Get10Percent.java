package edu.towson.cosc.cosc436.jchen21.assignment3;

/**
 * Created by jchen21 on 10/19/2017.
 */
public class Coupon100Get10Percent implements AddOn, Coupon {
    @Override
    public boolean applies(PurchasedItems items) {
        if(items.getTotalCost() >= 100){
            return true;
        }
        return false;
    }

    @Override
    public String getLines() {
        return "Thanks for spending over $100! Here is a coupon for 10% off your next purchase.";
    }
}
