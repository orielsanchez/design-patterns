package adapter;

public class DuckTestDrive {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        Turkey turkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        System.out.println("The turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck says...");
        duck.quack();
        duck.fly();

        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
