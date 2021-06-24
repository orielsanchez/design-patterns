package factory.simplefactory;

import factory.Pizza;

public class PepperoniPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Pepperoni pizza prepared");
    }

    @Override
    public void bake() {
        System.out.println("Pepperoni pizza baked");
    }

    @Override
    public void cut() {
        System.out.println("Pepperoni pizza cut");
    }

    @Override
    public void box() {
        System.out.println("Pepperoni pizza boxed");
    }
}
