package nazjara.movies;

public class BollywoodMovie implements Movie {

    private Genre genre;

    @Override
    public void getMovieInfo() {
        System.out.println("It's Bollywood movie");
    }

    @Override
    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public void getGenreInfo() {
        genre.getGenreInfo();
    }
}
