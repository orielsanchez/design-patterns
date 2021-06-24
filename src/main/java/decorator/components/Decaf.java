package decorator.components;

import decorator.Beverage;

public class Decaf extends Beverage {

    private String size;

    public Decaf(String size) {
        setDescription("Decaf");
        this.size = size;
    }

    @Override
    public double cost() {
        return 1.05;
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
