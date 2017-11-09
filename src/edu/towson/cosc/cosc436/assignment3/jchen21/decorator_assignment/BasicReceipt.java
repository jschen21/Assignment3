package edu.towson.cosc.cosc436.assignment3.jchen21.decorator_assignment;


import edu.towson.cosc.cosc436.assignment3.jchen21.abstract_classes.TaxComputation;
import edu.towson.cosc.cosc436.assignment3.jchen21.interfaces.Receipt;

import java.text.DecimalFormat;

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
    public void setStoreHeader(String street_addr, String zip_code, String state_code, String phone_num, String store_num){
        store_header = new StoreHeader(street_addr, zip_code, state_code, phone_num, store_num);
    }

    public void prtReceipt() {
        DecimalFormat money = new DecimalFormat("###,###.00");
        double subtotal = items.getTotalCost();
        double tax = tc.computeTax(items, date);
        double total = subtotal + tax;

        System.out.println(store_header.toString());
        System.out.println("Date: " + date.getMonth() + "/" + date.getDay() + "/" + date.getYear());

        items.printItems();

        System.out.println("Subtotal: $" + money.format(subtotal));
        System.out.println("Tax: +$" + money.format(tax));
        System.out.println("Total: $" + money.format(total));

    }
}