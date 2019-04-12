package nazjara.movies;

class MovieFactory extends AbstractMovieFactory {

    @Override
    Movie getMovie(String movieType) {
        switch (movieType.toLowerCase()) {
            case "hollywood": return new HollywoodMovie();
            case "bollywood": return new BollywoodMovie();
            default: return null;
        }
    }
}
