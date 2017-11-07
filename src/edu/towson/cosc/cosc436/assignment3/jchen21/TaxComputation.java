package edu.towson.cosc.cosc436.assignment3.jchen21;

/**
 * Created by jchen21 on 10/19/2017.
 */
public abstract class TaxComputation {
    public abstract double computeTax(PurchasedItems items, ReceiptDate date);
    protected abstract boolean taxHoliday(ReceiptDate date);
}