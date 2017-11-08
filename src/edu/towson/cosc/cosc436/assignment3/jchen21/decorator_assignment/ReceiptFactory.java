package edu.towson.cosc.cosc436.assignment3.jchen21.decorator_assignment;


import edu.towson.cosc.cosc436.assignment3.jchen21.abstract_classes.TaxComputation;
import edu.towson.cosc.cosc436.assignment3.jchen21.addons.Coupon100Get10Percent;
import edu.towson.cosc.cosc436.assignment3.jchen21.addons.HolidayGreeting;
import edu.towson.cosc.cosc436.assignment3.jchen21.addons.Rebate1406;
import edu.towson.cosc.cosc436.assignment3.jchen21.interfaces.*;
import edu.towson.cosc.cosc436.assignment3.jchen21.tax_classes.CATaxComputation;
import edu.towson.cosc.cosc436.assignment3.jchen21.tax_classes.DETaxComputation;
import edu.towson.cosc.cosc436.assignment3.jchen21.tax_classes.MATaxComputation;
import edu.towson.cosc.cosc436.assignment3.jchen21.tax_classes.MDTaxComputation;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by jchen21 on 10/19/2017.
 */
public class ReceiptFactory {
    private String store_num;
    private String phone_num;
    private String street_addr;
    private String zip_code;
    private String state_code;
    private TaxComputation[] taxComputationsObjs;
    private AddOn[] addOns;

    public ReceiptFactory() { // constructor
        TaxComputation MD = new MDTaxComputation();
        TaxComputation CA = new CATaxComputation();
        TaxComputation MA = new MATaxComputation();
        TaxComputation DE = new DETaxComputation();
        AddOn coupon100Get10Percent = new Coupon100Get10Percent();
        AddOn holidayGreeting = new HolidayGreeting();
        AddOn rebate1406 = new Rebate1406();
        taxComputationsObjs = new TaxComputation[]{MD, CA, MA, DE};
        addOns = new AddOn[]{coupon100Get10Percent, holidayGreeting, rebate1406};

        readFile();
    }

    public Receipt getReceipt(PurchasedItems items, ReceiptDate date){
        Receipt receipt = new BasicReceipt(items, date);
        receipt.setDate(date);
        receipt.setStoreHeader(street_addr, zip_code, state_code, phone_num, store_num);


        switch (state_code) {
            case "MD":
                receipt.setTaxComputation(taxComputationsObjs[0]);
                break;
            case "CA":
                receipt.setTaxComputation(taxComputationsObjs[1]);
                break;
            case "MA":
                receipt.setTaxComputation(taxComputationsObjs[2]);
                break;
            case "DE":
                receipt.setTaxComputation(taxComputationsObjs[3]);
                break;
            default:
                System.out.println("Not a valid state code");
                break;
        }

        for(AddOn a: addOns){
            if(a.applies(items)){
                if(a instanceof SecondaryHeading){
                    receipt = new PreDecorator(a, receipt);
                }
                if(a instanceof Coupon || a instanceof Rebate){
                    receipt = new PostDecorator(a, receipt);
                }
            }
        }
        return receipt;
    }

    private void readFile(){
        try{
            Scanner file = new Scanner(new File("config.txt"));
            store_num = file.nextLine();
            phone_num = file.nextLine();
            street_addr = file.nextLine();
            zip_code = file.nextLine();
            state_code = file.nextLine();
            file.close();
        } catch(IOException a){
            System.out.println("File error: " + a.getMessage());
        }
    }
}