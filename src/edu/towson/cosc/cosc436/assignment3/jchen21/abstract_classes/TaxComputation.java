package edu.towson.cosc.cosc436.assignment3.jchen21.abstract_classes;

import edu.towson.cosc.cosc436.assignment3.jchen21.decorator_assignment.PurchasedItems;
import edu.towson.cosc.cosc436.assignment3.jchen21.decorator_assignment.ReceiptDate;

/**
 * Created by jchen21 on 10/19/2017.
 */
public abstract class TaxComputation {
    public abstract double computeTax(PurchasedItems items, ReceiptDate date);
    protected abstract boolean taxHoliday(ReceiptDate date);
}