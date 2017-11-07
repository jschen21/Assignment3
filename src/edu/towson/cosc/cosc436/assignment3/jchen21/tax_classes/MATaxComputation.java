package edu.towson.cosc.cosc436.assignment3.jchen21.tax_classes;

import edu.towson.cosc.cosc436.assignment3.jchen21.decorator_assignment.PurchasedItems;
import edu.towson.cosc.cosc436.assignment3.jchen21.abstract_classes.TaxComputation;

/**
 * Created by jchen21 on 10/19/2017.
 */
public class MATaxComputation extends TaxComputation {
    private final static double tax = .0625;
    public double computeTax(PurchasedItems items, String date) {
        if(!taxHoliday(date)){
            return(items.getTotalCost() * tax);
        }
        return 0;
    }
    protected boolean taxHoliday(String date){
        if(date.equals("August 13, 2016") || date.equals("August 14, 2016")){
            return true;
        }
        else
            return false;
    }
}

