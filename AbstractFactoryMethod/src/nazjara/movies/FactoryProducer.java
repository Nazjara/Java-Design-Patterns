package nazjara.movies;

public class FactoryProducer {

    public static AbstractMovieFactory getMovieFactory() {
        return new MovieFactory();
    }

    public static AbstractGenreFactory getGenreFactory() {
        return new GenreFactory();
    }
}
