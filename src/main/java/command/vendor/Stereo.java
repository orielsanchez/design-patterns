package command.vendor;

public class Stereo {

    public void on() {
        System.out.println("Stereo is on");
    }

    public void off() {
        System.out.println("Stereo is off");
    }

    public void setCD() {
        System.out.println("CD set");
    }

    public void setDVD() {
        System.out.println("DVD set");
    }

    public void setRadio() {
        System.out.println("Radio set");
    }

    public void setVolume(int volume) {
        System.out.println("Volume set to " + volume);
    }
}
