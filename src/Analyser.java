import java.util.ArrayList;

public class Analyser {

    //--instance fields--
    private final ArrayList<Movie> movieList;

    //--constructor--
    public Analyser (ArrayList<Movie> movieList) {
        this.movieList = movieList;
    }

    //--methods--
    public Movie getLongestMovieTitle() {

        Movie returnMovie = movieList.get(0);

        for (Movie movie : movieList) {
            if (movie.getTitle().length() > returnMovie.getTitle().length()) {
                returnMovie = movie;
            }
        }

        return returnMovie;
    }

    public int moviesContainingString(String string) {

        int count = 0;

        for (Movie movie : movieList) {
            if (movie.getTitle().toLowerCase().contains(string.toLowerCase())) {
                count++;
            }
        }

        return count;
    }

    public int getAverageRuntime() {

        int totalRuntime = 0;

        for (Movie movie : movieList) {
            totalRuntime += movie.getRuntime();
        }

        return totalRuntime/movieList.size();
    }

    public Movie getHighestWordTitle() {

        Movie returnMovie = movieList.get(0);

        for (Movie movie : movieList) {
            if (movie.getTitle().split(" ").length > returnMovie.getTitle().split(" ").length) {
                returnMovie = movie;
            }
        }
        return returnMovie;
    }

    public int getAmountOfMoviesWithPrizes() {

        int count = 0;

        for (Movie movie : movieList) {
            if (movie.getWonAward()) {
                count++;
            }
        }
        return count;
    }
}
