package factory.factory;

import factory.Pizza;

public class ChicagoStylePepperoniPizza extends Pizza {

    public ChicagoStylePepperoniPizza() {
        name = "Chicago Style Pepperoni Pizza";
        dough = "Extra Thick Crust";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Pepperoni");
    }

    @Override
    public void cut() {
        System.out.println("Cutting pizza into square slices");
    }
}
