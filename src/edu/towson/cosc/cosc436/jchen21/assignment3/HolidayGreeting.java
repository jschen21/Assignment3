package edu.towson.cosc.cosc436.jchen21.assignment3;

/**
 * Created by jchen21 on 10/19/2017.
 */
public class HolidayGreeting implements AddOn, SecondaryHeading {
    public boolean applies(PurchasedItems items) {
        return true; // SecondaryHeading decorators always applied
    }
    public String getLines() {
        return "* Happy Holidays from Best Buy *";
    }
}

