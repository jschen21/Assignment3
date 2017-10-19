package edu.towson.cosc.cosc436.jchen21.assignment3;

/**
 * Created by jchen21 on 10/19/2017.
 */
public class BasicReceipt implements Receipt {
    private String storeInfo; // store number, store address, phone number
    private String stateCode; // MD, DE, CA or MA
    private PurchasedItems items;
    private Date date;
    private TaxComputation tc;
    public BasicReceipt(PurchasedItems items) {
        this.items = items;
    }
    public void setTaxComputation(TaxComputation tc) { this.tc = tc; }
    public void setDate(String date) { this.date = date; }
    public void prtReceipt() {
// to implement
    }
}