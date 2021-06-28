package facade.components;

public class StreamingPlayer {

    Movie movie;

    public void on() {
        System.out.println("Streaming Player is on");
    }

    public void play(Movie movie) {
        this.movie = movie;
        System.out.println("Playing " + movie.getName());
    }


    public void off() {
        System.out.println("Player is off");
    }
}
