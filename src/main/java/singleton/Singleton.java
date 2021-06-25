package singleton;

/**
 * “The Singleton Pattern ensures you have at most one instance of a class in your application.
 * <p>
 * The Singleton Pattern also provides a global access point to that instance.
 * <p>
 * Java’s implementation of the Singleton Pattern makes use of a private constructor,
 * a static method combined with a static variable.
 * <p>
 * Examine your performance and resource constraints and carefully choose an appropriate
 * Singleton implementation for multithreaded applications (and we should consider all applications multithreaded!).
 * <p>
 * Beware of the double-checked locking implementation; it isn’t thread safe in versions before Java 5.
 * <p>
 * Be careful if you are using multiple class loaders; this could defeat the Singleton implementation
 * and result in multiple instances.
 * <p>
 * You can use Java’s enums to simplify your Singleton implementation.”
 * <p>
 * Excerpt From: Eric Freeman. “Head First Design Patterns, 2nd Edition.”
 */

public class Singleton {

    private static Singleton uniqueInstance;

    // Other useful instance variables here

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }

        return uniqueInstance;
    }

    // other useful methods here
}
