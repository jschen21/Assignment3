package edu.towson.cosc.cosc436.jchen21.assignment3;

/**
 * Created by jchen21 on 10/19/2017.
 */
public class CATaxComputation extends TaxComputation {
    public double computeTax(PurchasedItems items, ReceiptDate date) {
// calls private method taxHoliday as part of this computation
    }
    private boolean taxHoliday(ReceiptDate date);
// returns true if date of receipt within the state’s tax free holiday,
// else returns false. Supporting method of method computeTax.
}

