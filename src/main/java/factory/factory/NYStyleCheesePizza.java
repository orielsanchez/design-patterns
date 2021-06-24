package factory.factory;

import factory.Pizza;

public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust";
        sauce = "Marinara Sauce";

        toppings.add("Three Cheese Blend");
    }
}
