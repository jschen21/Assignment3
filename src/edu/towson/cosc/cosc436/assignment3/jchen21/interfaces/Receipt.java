package edu.towson.cosc.cosc436.assignment3.jchen21.interfaces;

import edu.towson.cosc.cosc436.assignment3.jchen21.abstract_classes.TaxComputation;
import edu.towson.cosc.cosc436.assignment3.jchen21.decorator_assignment.ReceiptDate;
import edu.towson.cosc.cosc436.assignment3.jchen21.decorator_assignment.StoreHeader;

/**
 * Created by jchen21 on 10/19/2017.
 */
public interface Receipt { // type of all receipt components (i.e., BasicReceipt and receipt decorators)
    void prtReceipt();
    void setDate(ReceiptDate date);
    void setTaxComputation(TaxComputation tc);
    void setStoreHeader(String street_addr, String zip_code, String state_code, String phone_num, String store_num);
}
