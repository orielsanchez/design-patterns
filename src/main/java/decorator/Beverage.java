package decorator;

/**
 * THE OPEN-CLOSED PRINCIPLE:
 * Classes should be open for extension, but closed for modification.
 */

public abstract class Beverage {


    private String description = "Unknown Beverage";

    private String size;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract double cost();

    public abstract void setSize(String size);

    public abstract String getSize();
}
