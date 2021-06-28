package templatemethod.components;

public abstract class CaffeineBeverageWithHook {

    public void prepareRecipe() {
        boilWater();
        brew();
        pour();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    private void boilWater() {
        System.out.println("Boiling water...");
    }

    protected abstract void brew();

    private void pour() {
        System.out.println("Pouring in cup....");
    }

    protected abstract void addCondiments();

    boolean customerWantsCondiments() {
        return true;
    }
}
