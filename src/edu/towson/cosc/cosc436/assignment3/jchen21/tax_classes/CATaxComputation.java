package edu.towson.cosc.cosc436.assignment3.jchen21.tax_classes;

import edu.towson.cosc.cosc436.assignment3.jchen21.decorator_assignment.PurchasedItems;
import edu.towson.cosc.cosc436.assignment3.jchen21.abstract_classes.TaxComputation;
import edu.towson.cosc.cosc436.assignment3.jchen21.decorator_assignment.ReceiptDate;

/**
 * Created by jchen21 on 10/19/2017.
 */
public class CATaxComputation extends TaxComputation {
    private final  static double tax = .075;
    public double computeTax(PurchasedItems items, ReceiptDate date) {
        if(!taxHoliday(date)){
            return (items.getTotalCost() * tax);
        }
        return 0;
    }
    protected boolean taxHoliday(ReceiptDate date){
        return false;
    }
}

