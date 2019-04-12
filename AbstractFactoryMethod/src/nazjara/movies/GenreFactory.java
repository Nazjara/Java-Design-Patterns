package nazjara.movies;

class GenreFactory extends AbstractGenreFactory {

    @Override
    Genre getGenre(String genreType) {
        switch (genreType.toLowerCase()) {
            case "comedy": return new Comedy();
            case "action": return new Action();
            default: return null;
        }
    }
}
