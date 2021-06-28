package facade.facade;

import facade.components.*;

public class HomeTheaterFacade {

    Amplifier amp;
    Tuner tuner;
    StreamingPlayer player;
    Projector projector;
    TheaterLights lights;
    Screen screen;
    PopcornPopper popper;

    public HomeTheaterFacade(Amplifier amp,
                             Tuner tuner,
                             StreamingPlayer player,
                             Projector projector,
                             TheaterLights lights,
                             Screen screen,
                             PopcornPopper popper) {
        this.amp = amp;
        this.tuner = tuner;
        this.player = player;
        this.projector = projector;
        this.lights = lights;
        this.screen = screen;
        this.popper = popper;
    }

    public void watchMovie(Movie movie) {
        System.out.println("Get ready to watch a movie");
        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenModeToggle();
        amp.on();
        amp.setStreamingPlayer(player);
        amp.setSurroundSoundOn(true);
        amp.setVolume(5);
        player.on();
        player.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        popper.off();
        lights.dim(0);
        screen.up();
        projector.off();
        amp.off();
        player.off();

    }
}
