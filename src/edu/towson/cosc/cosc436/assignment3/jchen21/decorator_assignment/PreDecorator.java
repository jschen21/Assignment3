package edu.towson.cosc.cosc436.assignment3.jchen21.decorator_assignment;

import edu.towson.cosc.cosc436.assignment3.jchen21.abstract_classes.Decorator;
import edu.towson.cosc.cosc436.assignment3.jchen21.abstract_classes.TaxComputation;
import edu.towson.cosc.cosc436.assignment3.jchen21.interfaces.AddOn;
import edu.towson.cosc.cosc436.assignment3.jchen21.interfaces.Receipt;

/**
 * Created by jchen21 on 10/19/2017.
 */
public class PreDecorator extends Decorator {
    private AddOn a;
    public PreDecorator(AddOn a, Receipt r) {
        super(r);
        this.a = a;
    }
    public void prtReceipt() {
        System.out.println(a.getLines());
        callTrailer();
    }

    @Override
    public void setDate(ReceiptDate date) {

    }

    @Override
    public void setTaxComputation(TaxComputation tc) {

    }

    @Override
    public void setStoreHeader(String street_addr, String zip_code, String state_code, String phone_num, String store_num) {

    }
}