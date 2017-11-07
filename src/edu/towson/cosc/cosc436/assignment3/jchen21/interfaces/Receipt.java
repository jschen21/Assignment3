package edu.towson.cosc.cosc436.assignment3.jchen21.interfaces;

import edu.towson.cosc.cosc436.assignment3.jchen21.abstract_classes.TaxComputation;

/**
 * Created by jchen21 on 10/19/2017.
 */
public interface Receipt { // type of all receipt components (i.e., BasicReceipt and receipt decorators)
    void prtReceipt();
    void setDate(String date);
    void setTaxComputation(TaxComputation tc);
}
