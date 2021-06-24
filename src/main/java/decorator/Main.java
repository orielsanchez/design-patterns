package decorator;

import decorator.Beverage;
import decorator.components.DarkRoast;
import decorator.components.Espresso;
import decorator.components.HouseBlend;
import decorator.decorators.Mocha;
import decorator.decorators.Soy;
import decorator.decorators.UppercaseInputStream;
import decorator.decorators.Whip;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Beverage beverage = new Espresso("tall");
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast("venti");
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend("what");
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }
}
