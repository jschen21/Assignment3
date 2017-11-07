package edu.towson.cosc.cosc436.assignment3.jchen21.addons;

import edu.towson.cosc.cosc436.assignment3.jchen21.decorator_assignment.PurchasedItems;
import edu.towson.cosc.cosc436.assignment3.jchen21.interfaces.AddOn;
import edu.towson.cosc.cosc436.assignment3.jchen21.interfaces.SecondaryHeading;

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

