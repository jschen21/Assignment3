package edu.towson.cosc.cosc436.assignment3.jchen21;

/**
 * Created by jchen21 on 10/19/2017.
 */
public class BasicReceipt implements Receipt {
    private StoreHeader store_header;
    private PurchasedItems items;
    private ReceiptDate date;
    private TaxComputation tc;

    public BasicReceipt(PurchasedItems items, ReceiptDate date) {
        this.items = items;
        this.date = date;
    }
    public void setDate(ReceiptDate date) {
        this.date = date;
    }
    public void setTaxComputation(TaxComputation tc) {
        this.tc = tc;
    }
    public void setStoreHeader(StoreHeader h){
        store_header = h;
    }

    public void prtReceipt() {
        double subtotal = items.getTotalCost();
        double tax = tc.computeTax(items, date);
        double total = subtotal + tax;

        System.out.println(store_header);
        System.out.println("Date: " + date);

        items.printItems();

        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax: +$" + tax);
        System.out.println("Total: $" + total);

    }
}