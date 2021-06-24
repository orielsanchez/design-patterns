package factory.factory;

import factory.Pizza;

public class NYStylePepperoniPizza extends Pizza {

    public NYStylePepperoniPizza() {
        name = "NY Style Pepperoni Pizza";
        dough = "Thin Crust";
        sauce = "Marinara Sauce";

        toppings.add("Three Blend Cheese");
        toppings.add("Pepperoni");
    }
}
