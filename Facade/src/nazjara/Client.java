package nazjara;

public class Client  {

    public static void main(String[] args) {
        Amplifier amp = new Amplifier("Top-O-Line Amplifier");
        DvdPlayer dvd = new DvdPlayer("Top-O-Line DVD Player", amp);
        Projector projector = new Projector("Top-O-Line Projector", dvd);
        TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
        Screen screen = new Screen("Theater Screen");
        PopcornPopper popper = new PopcornPopper("Popcorn Popper");

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, dvd, popper, projector, screen, lights);
        homeTheater.watchMovie("Super movie");
        System.out.println("----------------------------------------");
        homeTheater.endMovie();
    }
}
