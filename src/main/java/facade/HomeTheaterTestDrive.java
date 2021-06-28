package facade;

import facade.components.*;
import facade.facade.HomeTheaterFacade;

public class HomeTheaterTestDrive {
    public static void main(String[] args) {

        Amplifier amp = new Amplifier();
        Movie movie = new Movie("Kill BIll");
        PopcornPopper popcornPopper = new PopcornPopper();
        Projector projector = new Projector();
        Screen screen = new Screen();
        StreamingPlayer streamingPlayer = new StreamingPlayer();
        TheaterLights lights = new TheaterLights();
        Tuner tuner = new Tuner();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, streamingPlayer, projector, lights, screen, popcornPopper);

        homeTheater.watchMovie(movie);
        homeTheater.endMovie();

    }
}
