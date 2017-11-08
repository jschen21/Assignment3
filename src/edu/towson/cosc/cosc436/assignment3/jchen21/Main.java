package edu.towson.cosc.cosc436.assignment3.jchen21;

import edu.towson.cosc.cosc436.assignment3.jchen21.decorator_assignment.PurchasedItems;
import edu.towson.cosc.cosc436.assignment3.jchen21.decorator_assignment.ReceiptDate;
import edu.towson.cosc.cosc436.assignment3.jchen21.decorator_assignment.ReceiptFactory;
import edu.towson.cosc.cosc436.assignment3.jchen21.decorator_assignment.StoreItem;
import edu.towson.cosc.cosc436.assignment3.jchen21.interfaces.Receipt;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        PurchasedItems items = null;

        System.out.println("What is the current month(in numbers)?: ");
        int month = cin.nextInt();
        System.out.println("What is the current date?: ");
        int day = cin.nextInt();
        System.out.println("What is the current year(yyyy)?: ");
        int year = cin.nextInt();

        ReceiptDate date = new ReceiptDate(month, day, year);

        ArrayList<StoreItem> available = new ArrayList<>();
        available.add(new StoreItem("1406", "iPhone X", 1099.99));
        available.add(new StoreItem("5465", "MacBook Air", 999.99));
        available.add(new StoreItem("5835", "Dell Inspiron", 349.99));
        available.add(new StoreItem("5580", "Lenovo Ideapad", 189.99));
        available.add(new StoreItem("5803", "Samsung Galaxy S8", 724.99));
        available.add(new StoreItem("4894", "Samsung Galaxy S7", 649.99));

        int input = 0;

        while(input != 4){
            System.out.println("1 - Start new receipt");
            System.out.println("2 - Add items to cart");
            System.out.println("3 - Display Receipt");
            System.out.println("4 - Exit");
            input = cin.nextInt();

            switch (input){
                case 1: items = null;
                    break;
                case 2: addItems(available, items);
                    break;
                case 3: ReceiptFactory factory = new ReceiptFactory();
                    Receipt receipt = factory.getReceipt(items, date);
                    receipt.prtReceipt();
                    break;
                case 4: break;
            }
        }
    }
    private static void addItems(ArrayList<StoreItem> list, PurchasedItems items){
        Scanner cin = new Scanner(System.in);
        int i = 0;

        for(StoreItem a: list){
            System.out.println("Item #" + i+1 + ": " + a.getItemDescription() + "      " + a.getItemPrice() + "\n");
            i++;
        }

        boolean cont = true;
        int input;
        while(cont){
            System.out.println("Which item would you like to add to your cart? (enter item #) or 10 to finish");
            input = cin.nextInt();
            if(input == 10)
                cont = false;
            else
                items.addItem(list.get(i-1));
        }
    }
}
