package singleton;

public class SingletonTest {

    // Enum version of a Singleton
    public enum Singleton {
        UNIQUE_INSTANCE
    }

    public static void main(String[] args) {

        // Using the Enum version of Singleton
        Singleton singleton = Singleton.UNIQUE_INSTANCE;

        ChocolateBoiler boiler = ChocolateBoiler.getInstance();

        boiler.fill();
        boiler.boil();
        boiler.drain();
    }
}
