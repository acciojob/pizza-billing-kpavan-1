package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
//        super.getPrice();
        addExtraCheese();
        addExtraToppings();

        // your code goes here
    }
}
