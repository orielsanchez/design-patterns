package factory.factory;

import factory.factory.ingredients.*;

public class ChicagoStyleIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ExtraThickDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new RedPeppers(), new Onions(), new Spinach(), new Artichokes()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FrozenClams();
    }

}
