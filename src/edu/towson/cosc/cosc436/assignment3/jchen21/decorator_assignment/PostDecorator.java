package edu.towson.cosc.cosc436.assignment3.jchen21.decorator_assignment;

import edu.towson.cosc.cosc436.assignment3.jchen21.abstract_classes.Decorator;
import edu.towson.cosc.cosc436.assignment3.jchen21.abstract_classes.TaxComputation;
import edu.towson.cosc.cosc436.assignment3.jchen21.interfaces.AddOn;
import edu.towson.cosc.cosc436.assignment3.jchen21.interfaces.Receipt;

/**
 * Created by jchen21 on 10/19/2017.
 */
public class PostDecorator extends Decorator {
    private AddOn a;
    public PostDecorator(AddOn a, Receipt r) {
        super(r);
        this.a = a;
    }
    public void prtReceipt() {
        callTrailer();
        System.out.println(a.getLines());
    }

    @Override
    public void setDate(String date) {

    }

    @Override
    public void setTaxComputation(TaxComputation tc) {

    }
}