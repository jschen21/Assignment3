package edu.towson.cosc.cosc436.assignment3.jchen21;

/**
 * Created by jchen21 on 10/19/2017.
 */
public class Rebate1406 implements AddOn, Rebate {
    public boolean applies(PurchasedItems items) {
        return items.containsItem("1406");
    }

    public String getLines() {
        return "Mail-in Rebate for Item #1406\n" + "Name:\n" + "Address:\n\n" + "Mail to: Best Buy Rebates, P.O. Box 1400, Orlando, FL";
    }
}