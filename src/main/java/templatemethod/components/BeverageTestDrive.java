package templatemethod.components;

public class BeverageTestDrive {

    public static void main(String[] args) {
        CoffeeWithHook coffee = new CoffeeWithHook();
        Tea tea = new Tea();
        System.out.println("Preparing Coffee...");
        coffee.prepareRecipe();

        System.out.println("\nPreparing Tea...");
        tea.prepareRecipe();
    }
}
