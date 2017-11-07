package edu.towson.cosc.cosc436.assignment3.jchen21;

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
}
