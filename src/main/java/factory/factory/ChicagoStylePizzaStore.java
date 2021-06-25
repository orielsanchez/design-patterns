package factory.factory;

import factory.Pizza;
import factory.factory.concretepizzastyles.CheesePizza;
import factory.factory.concretepizzastyles.ClamPizza;
import factory.factory.concretepizzastyles.PepperoniPizza;
import factory.factory.concretepizzastyles.VeggiePizza;

public class ChicagoStylePizzaStore extends PizzaStore {


    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;

        PizzaIngredientFactory pizzaIngredientFactory = new ChicagoStyleIngredientFactory();



        switch (type) {
            case "cheese" -> {
                pizza = new CheesePizza(pizzaIngredientFactory);
                pizza.setName("Chicago Style Cheese Pizza");
            }
            case "pepperoni" -> {
                pizza = new PepperoniPizza(pizzaIngredientFactory);
                pizza.setName("Chicago Style Pepperoni Pizza");
            }
            case "veggie" -> {
                pizza = new VeggiePizza(pizzaIngredientFactory);
                pizza.setName("Chicago Style Veggie Pizza");
            }
            case "clam" -> {
                pizza = new ClamPizza(pizzaIngredientFactory);
                pizza.setName("Chicago Style Clam Pizza");
            }
        }

        return pizza;
    }

}
