package facade.components;

public class Amplifier {

    StreamingPlayer streamingPlayer;
    boolean isSurroundSoundOn;
    int volume;

    public void on() {
        System.out.println("Amp is on");
    }

    public void setStreamingPlayer(StreamingPlayer streamingPlayer) {
        this.streamingPlayer = streamingPlayer;
    }

    public void setSurroundSoundOn(boolean surroundSoundOn) {
        isSurroundSoundOn = surroundSoundOn;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void off() {
        System.out.println("Amp is off");
    }
}
