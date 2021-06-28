package templatemethod.components;

public abstract class CaffeineBeverage {

    public void prepareRecipe() {
        boilWater();
        brew();
        pour();
        addCondiments();
    }

    protected abstract void addCondiments();

    private void pour() {
        System.out.println("Pouring in cup....");
    }

    protected abstract void brew();

    private void boilWater() {
        System.out.println("Boiling water...");
    }
}
