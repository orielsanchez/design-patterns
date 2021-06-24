package decorator.components;

import decorator.Beverage;

public class DarkRoast extends Beverage {

    private String size;

    public DarkRoast(String size) {
        setDescription("Dark Roast");
        this.size = size;
    }

    @Override
    public double cost() {
        return .99;
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
