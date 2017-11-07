package edu.towson.cosc.cosc436.assignment3.jchen21.abstract_classes;

import edu.towson.cosc.cosc436.assignment3.jchen21.interfaces.Receipt;

/**
 * Created by jchen21 on 10/19/2017.
 */
public abstract class Decorator implements Receipt {
    private Receipt trailer;
    public Decorator(Receipt r) {
        trailer = r;
    }
    protected void callTrailer() {
        trailer.prtReceipt();
    }
    public abstract void prtReceipt();
}
