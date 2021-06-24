package factory.simplefactory;

import factory.Pizza;

public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Cheese pizza prepared");
    }

    @Override
    public void bake() {
        System.out.println("Cheese pizza baked");
    }

    @Override
    public void cut() {
        System.out.println("Cheese pizza cut");
    }

    @Override
    public void box() {
        System.out.println("Cheese pizza boxed");
    }
}
