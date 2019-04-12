package nazjara.movies;

public class Client {

    public static void main(String[] args) {
        AbstractMovieFactory movieFactory = FactoryProducer.getMovieFactory();
        AbstractGenreFactory genreFactory = FactoryProducer.getGenreFactory();

        Movie movie1 = movieFactory.getMovie("hollywood");
        movie1.setGenre(genreFactory.getGenre("action"));
        movie1.getMovieInfo();
        movie1.getGenreInfo();
        System.out.println("-------------------------------------");

        Movie movie2 = movieFactory.getMovie("hollywood");
        movie2.setGenre(genreFactory.getGenre("comedy"));
        movie2.getMovieInfo();
        movie2.getGenreInfo();
        System.out.println("-------------------------------------");

        Movie movie3 = movieFactory.getMovie("bollywood");
        movie3.setGenre(genreFactory.getGenre("action"));
        movie3.getMovieInfo();
        movie3.getGenreInfo();
        System.out.println("-------------------------------------");

        Movie movie4 = movieFactory.getMovie("bollywood");
        movie4.setGenre(genreFactory.getGenre("comedy"));
        movie4.getMovieInfo();
        movie4.getGenreInfo();
        System.out.println("-------------------------------------");
    }
}
