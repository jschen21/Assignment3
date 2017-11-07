package edu.towson.cosc.cosc436.assignment3.jchen21;

/**
 * Created by jchen21 on 10/19/2017.
 */
public class MATaxComputation extends TaxComputation {
    public double computeTax(PurchasedItems items, ReceiptDate date) {
// calls private method taxHoliday as part of this computation
    }
    private boolean taxHoliday(ReceiptDate date);
// returns true if date of receipt within the state’s tax free holiday,
// else returns false. Supporting method of method computeTax.
}

