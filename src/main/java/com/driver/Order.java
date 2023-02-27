package com.driver;

public class Order {

    private String id;
    private int deliveryTime;

    public Order(String id, String deliveryTime) {
        this.id=id;
        String[] arr=deliveryTime.split(":");
        int hour=Integer.parseInt(arr[0]);
        int minute=Integer.parseInt(arr[1]);

        hour=hour*60;
        this.deliveryTime=hour+minute;

        // The deliveryTime has to converted from string to int and then stored in the attribute
        //deliveryTime  = HH*60 + MM
    }

    public String getId() {
        return id;
    }

    public int getDeliveryTime() {return deliveryTime;}

    public void setId(String id) {
        this.id = id;
    }

    public void setDeliveryTime(int deliveryTime) {
        this.deliveryTime = deliveryTime;
    }
}
