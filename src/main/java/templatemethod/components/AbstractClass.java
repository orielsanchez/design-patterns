package templatemethod.components;

public abstract class AbstractClass {
    final void templateMethod() {
        primitiveOperation1();
        primitiveOperation2();
        concreteOperation1();
        concreteOperation2();
        hook();
    }

    /**
     * Primitive Operations:
     * Abstract methods that are implemented by concrete subclasses.
     */
    protected abstract void primitiveOperation1();

    protected abstract void primitiveOperation2();

    /**
     * Concrete Operation:
     * A method that is defined in the abstract class.
     * It may be used in the template method directly, or used by subclasses.
     * We can use the 'final' keyword so that subclasses can't override it.
     */
    final void concreteOperation1() {
        // implementation here
    }

    private void concreteOperation2() {
        // implementation here
    }


    /**
     * Hook:
     * A concrete method that does nothing by default.
     * Subclasses are free to override these but don't have to.
     */
    void hook() {
    }

}
