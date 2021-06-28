package facade.components;

public class Projector {

    boolean wideScreenMode;


    public void on() {
        System.out.println("Projector is on");
    }

    public boolean wideScreenModeToggle() {
        if (wideScreenMode) {
            wideScreenMode = false;
            System.out.println("Wide Screen Mode toggled off");
        } else {
            wideScreenMode = true;
            System.out.println("Wide Screen mode toggled on");
        }
        return wideScreenMode;
    }

    public void off() {
        System.out.println("Projector is off");
    }
}
