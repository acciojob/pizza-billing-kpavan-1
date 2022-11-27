package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int totalPrice=0;
    private int toppings=0;
    private int cheese=0;
    private int takeaway=0;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg==true){
//            totalPrice+=300;
            price=300;
        }

        else {
//            totalPrice+=400;
            price=400;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        cheese=80;
//        totalPrice+=cheese;
//        System.out.println("Extra Cheese Added: 80" + "\\");
    }

    public void addExtraToppings(){
        // your code goes here
        if(isVeg){
            toppings=70;
//            totalPrice+=70;
//            System.out.println("Extra Toppings Added: 70" + "\\");
        }
        else{
            toppings=120;
//            totalPrice+=120;
//            System.out.println("Extra Toppings Added: 120" + "\\");
        }

    }

    public void addTakeaway(){
        // your code goes here
        takeaway=20;
//        totalPrice+=20;
//        System.out.println("Paperbag Added: 20" + "\\");
    }

    public String getBill(){
        // your code goes here
        System.out.println("Base Price Of The Pizza: " + price);
        if(cheese!=0)
        System.out.println("Extra Cheese Added: "+ cheese);
        if(toppings!=0)
        System.out.println("Extra Toppings Added: " + toppings);
        if(takeaway!=0)
        System.out.println("Paperbag Added: " + takeaway);
        totalPrice= cheese+ toppings+ takeaway + price;
        this.bill="Total Price: " + totalPrice + "\n";
        return this.bill;
    }
}
