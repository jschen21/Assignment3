package edu.towson.cosc.cosc436.jchen21.assignment3;

/**
 * Created by jchen21 on 10/19/2017.
 */
public class BasicReceipt implements Receipt {
    private String storeInfo; // store number, store address, phone number
    private String stateCode; // MD, DE, CA or MA
    private PurchasedItems items;
    private ReceiptDate date;
    private TaxComputation tc;
    public BasicReceipt(PurchasedItems items) {
        this.items = items;
    }
    public void setDate(ReceiptDate date) {
        this.date = date;
    }
    public void setTaxComputation(TaxComputation tc) {
        this.tc = tc;
    }
    public void setStoreInfo(String storeInfo){
        this.storeInfo = storeInfo;
    }
    public void setStateCode(String stateCode){
        this.stateCode = stateCode;
    }

    public void prtReceipt() {
        double subtotal = items.getTotalCost();
        double tax = tc.computeTax(items, date);
        double total = subtotal + tax;

    }
}