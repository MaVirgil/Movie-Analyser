import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {

        String path = "datasource/film-imdb.csv";

        try (CsvReader reader = new CsvReader(path, ";")){

            Analyser analyser = new Analyser(reader.getList());

            System.out.println("Movie with the longest title: " + analyser.getLongestMovieTitle());
            System.out.println("Movie with most words in title: " + analyser.getHighestWordTitle());
            System.out.println("Star Trek movies: " + analyser.moviesContainingString("Star Trek"));
            System.out.printf("Average runtime: %d minutes \n", analyser.getAverageRuntime());
            System.out.println("Amount of movies that won awards: " + analyser.getAmountOfMoviesWithPrizes());

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }



    }
}
