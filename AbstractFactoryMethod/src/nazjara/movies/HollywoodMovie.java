package nazjara.movies;

public class HollywoodMovie implements Movie {

    private Genre genre;

    @Override
    public void getMovieInfo() {
        System.out.println("It's Hollywood movie");
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
