package edu.towson.cosc.cosc436.assignment3.jchen21.decorator_assignment;

public class StoreHeader {
    private String street_addr;
    private String zip_code;
    private String state_code;
    private String phone_num;
    private String store_num; // e.g., #1004
    public StoreHeader(String street_addr, String zip_code, String state_code, String phone_num, String store_num){
        this.street_addr = street_addr;
        this.zip_code = zip_code;
        this.state_code = state_code;
        this.phone_num = phone_num;
        this.store_num = store_num;
    }
    public String getStoreCode(){
        return store_num;
    }
    public String toString(){
        return ("Store Number: " + store_num + "\n" + street_addr + "\n" + state_code + " " + zip_code + "\n" + phone_num);
    }
}