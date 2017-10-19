package edu.towson.cosc.cosc436.jchen21.assignment3;

/**
 * Created by jchen21 on 10/19/2017.
 */
public class PostDecorator extends Decorator {
    private AddOn a;
    public PreDecorator(AddOn a, Receipt r) {
        super(r);
        this.a = a;
    }
    public void prtReceipt() {
        callTrailer();
        System.out.println(a.getLines());
    }
}
