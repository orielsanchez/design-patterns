package singleton;

/**
 * Uses double-checked locking to reduce the use of synchronization in getInstance();
 */

public class ChocolateBoiler {

    // The volatile keyword ensures that multiple threads handle the uniqueInstance variable correctly
    // when it is being initialized to the ChocolateBoiler (Singleton) instance.
    private volatile static ChocolateBoiler uniqueInstance;
    private boolean empty;
    private boolean boiled;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getInstance() {

        // Check for an instance and if there isn't one, enter a synchronized block
        if (uniqueInstance == null) {

            // Note that we only synchronize the first time through
            synchronized (ChocolateBoiler.class) {

                // Once in the block, check again and if it's still null, create an instance
                if (uniqueInstance == null) {
                    uniqueInstance = new ChocolateBoiler();
                }
            }
        }

        return uniqueInstance;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            // fill the boiler with chocolate/milk mixture
        }

    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            empty = false;
            boiled = true;
            // boil
        }

    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
        }

    }

    public boolean isEmpty() {
        return empty;

    }

    public boolean isBoiled() {
        return boiled;

    }


}
