package decorator.decorators;

import decorator.Beverage;
import decorator.CondimentDecorator;

public class Mocha extends CondimentDecorator {

    Beverage beverage;
    private double cost = 0.1;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public double cost() {
        switch (getSize()) {
            case "tall":
                cost = .1;
                break;
            case "grande":
                cost = .15;
                break;
            case "venti":
                cost = .2;
                break;
            default:
                break;
        }

        return beverage.cost() + cost;

    }

    @Override
    public void setSize(String size) {
        beverage.setSize(size);
    }

    @Override
    public String getSize() {
        return beverage.getSize();
    }
}
