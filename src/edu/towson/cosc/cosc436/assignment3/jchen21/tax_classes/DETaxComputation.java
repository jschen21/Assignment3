package edu.towson.cosc.cosc436.assignment3.jchen21.tax_classes;

import edu.towson.cosc.cosc436.assignment3.jchen21.decorator_assignment.PurchasedItems;
import edu.towson.cosc.cosc436.assignment3.jchen21.abstract_classes.TaxComputation;
import edu.towson.cosc.cosc436.assignment3.jchen21.decorator_assignment.ReceiptDate;

public class DETaxComputation extends TaxComputation {
    public double computeTax(PurchasedItems items, ReceiptDate date) {
        return 0;
    }
    protected boolean taxHoliday(ReceiptDate date){
        return false;
    }
}
