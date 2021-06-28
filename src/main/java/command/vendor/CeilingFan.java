package command.vendor;

public class CeilingFan {

    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String location;
    int speed;

    public CeilingFan(String location) {
        this.location = location;
    }



    public void high() {
        this.speed = HIGH;
        System.out.println("Ceiling fan is on HIGH");
    }

    public void medium() {
        this.speed = MEDIUM;
        System.out.println("Ceiling fan is on MEDIUM");
    }

    public void low() {
        this.speed = LOW;
        System.out.println("Ceiling fan is on LOW");
    }

    public void off() {
        this.speed = OFF;
        System.out.println("Ceiling fan is OFF");
    }

    public int getSpeed() {
        return speed;
    }


}
