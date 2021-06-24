package decorator.components;

import decorator.Beverage;

public class Espresso extends Beverage {

    private String size;

    public Espresso(String size) {
        setDescription("Espresso");
        this.size = size;
    }

    @Override
    public double cost() {
        return 1.99;
    }

    @Override
    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String getSize() {
        return this.size;
    }
}
