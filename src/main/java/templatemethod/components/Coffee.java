package templatemethod.components;

public class Coffee extends CaffeineBeverage {

    @Override
    protected void addCondiments() {
        System.out.println("Adding milk and sugar...");
    }

    @Override
    protected void brew() {
        System.out.println("Dripping coffee through filter....");
    }
}
