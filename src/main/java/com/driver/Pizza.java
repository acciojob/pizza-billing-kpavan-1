package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill="";
    private int toppings=0;
    private int cheese=80;
    private int takeaway=20;
    private boolean isbillgenerated=false;
    private boolean isCheeseAdded=false;
    private boolean isToppingAdded=false;
    private boolean isTakeAwayAdded=false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg==true){
            price=300;
            toppings=70;
        }

        else {
            price=400;
            toppings=120;
        }
        this.bill = "Base Price Of The Pizza: "+this.price + "\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isCheeseAdded==false){
            price=price+cheese;
            isCheeseAdded=true;
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(isToppingAdded==false){
            price=price+toppings;
            isToppingAdded=true;
        }

    }

    public void addTakeaway(){
        // your code goes here
        if(isTakeAwayAdded==false){
            price=price + takeaway;
            isTakeAwayAdded=true;
        }

    }

    public String getBill(){
        // your code goes here
        if(isbillgenerated==false){
            isbillgenerated=true;
            if(isCheeseAdded==true){
                this.bill = this.bill + "Extra Cheese Added: " + this.cheese + "\n";
            }
            if (isToppingAdded == true) {
                this.bill = this.bill + "Extra Toppings Added: " + this.toppings + "\n";
            }
            if (isTakeAwayAdded == true) {
                this.bill = this.bill + "Paperbag Added: " + this.takeaway + "\n";
            }
            this.bill = this.bill + "Total Price: "+this.price + "\n";
        }
        return this.bill;
        }
    }

