package factory.factory;

import factory.Pizza;

public class PizzaStoreTest {
    public static void main(String[] args) {
        PizzaStore nyStylePizzaStore = new NYStylePizzaStore();
        PizzaStore chicagoStylePizzaStore = new ChicagoStylePizzaStore();

        Pizza pizza = nyStylePizzaStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");
        System.out.println(pizza);

        pizza = chicagoStylePizzaStore.orderPizza("pepperoni");
        System.out.println("Tom ordered a " + pizza.getName() + "\n");
        System.out.println(pizza);

        pizza = chicagoStylePizzaStore.orderPizza("veggie");
        System.out.println("Tom ordered a " + pizza.getName() + "\n");
        System.out.println(pizza);

        pizza = nyStylePizzaStore.orderPizza("clam");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");
        System.out.println(pizza);
    }
}
