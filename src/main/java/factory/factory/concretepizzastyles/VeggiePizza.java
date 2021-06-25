package factory.factory.concretepizzastyles;

import factory.Pizza;
import factory.factory.PizzaIngredientFactory;

import java.util.Arrays;
import java.util.Collections;

public class VeggiePizza extends Pizza {

    PizzaIngredientFactory pizzaIngredientFactory;

    public VeggiePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
        veggies = pizzaIngredientFactory.createVeggies();

        toppings.add(String.valueOf(cheese));
        Collections.addAll(toppings, Arrays.toString(veggies));

    }
}
