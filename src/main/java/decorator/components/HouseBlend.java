package decorator.components;

import decorator.Beverage;

public class HouseBlend extends Beverage {

    private String size;

    public HouseBlend(String size) {
        setDescription("House Blend");
        this.size = size;
    }


    @Override
    public double cost() {
        return .89;

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
