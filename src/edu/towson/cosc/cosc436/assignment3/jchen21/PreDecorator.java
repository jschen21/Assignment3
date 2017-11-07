package edu.towson.cosc.cosc436.assignment3.jchen21;

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
}