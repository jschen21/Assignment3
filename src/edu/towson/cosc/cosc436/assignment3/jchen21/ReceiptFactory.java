package edu.towson.cosc.cosc436.assignment3.jchen21;

/**
 * Created by jchen21 on 10/19/2017.
 */
public class ReceiptFactory {
    String header; // contains line with “Best Buy”, store_num, street_addr, phone
    String state_code;
    private TaxComputation[] taxComputationsObjs; // tax computation objects (for each state)
    private AddOn[] addOns; // secondary heading, rebate and coupon add-ons
    public ReceiptFactory() { // constructor

        public ReceiptFactory(){
            TaxComputation MD = new MDTaxComputation();
            TaxComputation CA = new CATaxComputation();
            TaxComputation MA = new MATaxComputation();
            AddOn coupon100Get10Percent = new Coupon100Get10Percent();
            AddOn holidayGreeting = new HolidayGreeting();
            AddOn rebate1406 = new Rebate1406();
            taxComputationsObjs = new TaxComputation[]{MD, CA, MA};
            addOns = new AddOn[]{coupon100Get10Percent, holidayGreeting, rebate1406};
        }
    }
    public getReceipt(PurchasedItems items, ReceiptDate date){
        Receipt receipt = new BasicReceipt(items, date);
        receipt.setDate(date);


        switch (state_code) {
            case "MD":
                receipt.setTaxComputation(taxComputationsObjs[0]);
                break;
            case "CA":
                receipt.setTaxComputation(taxComputationsObjs[1]);
                break;
            case "MA":
                receipt.setTaxComputation(taxComputationsObjs[2]);
            default:
                System.out.println("ERROR: Not a valid state code");
                break;
        }

        for(AddOn a: addOns){
            if(a.applies(items)){
                if(a instanceof SecondaryHeading){
                    receipt = new PreDecorator(a, receipt);
                }
                if(a instanceof Coupon || a instanceof Rebate){
                    receipt = new PostDecorator(a, receipt)
                }
            }
        }
// 3. Traverses over all AddOn objects, calling the applies method of each. If an AddOn object applies, then determines if the AddOn is of type SecondaryHeader, Rebate, or Coupon. If of type SecondaryHeader, then creates a PreDecorator for othe AddOn. If of type Rebate or Coupon, then creates a PostDecorator.
// 4. Links in the decorator object based on the Decorator design pattern.
// 5. Adds current date to
// 6. Returns decorated BasicReceipt object as type Receipt.
    }
}