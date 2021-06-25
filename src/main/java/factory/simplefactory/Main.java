package factory.simplefactory;

import factory.Pizza;

public class Main {

    public static void main(String[] args) {
        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(simplePizzaFactory);

        Pizza pizza = pizzaStore.orderPizza("cheese");
        pizza = pizzaStore.orderPizza("pepperoni");

    }
}
