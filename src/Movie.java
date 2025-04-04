import java.util.ArrayList;

public class Movie {

    private int year;
    private int runtime;
    private String title;
    private String genre;
    private int popularity;
    private boolean wonAward;
//    private static final ArrayList<Movie> movieList = new ArrayList<>();

    //--setters--
    public void setYear(int year) {
        this.year = year;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    public void setWonAward(boolean wonAward) {
        this.wonAward = wonAward;
    }

    //--getters--
    public int getYear() {
        return this.year;
    }

    public int getRuntime() {
        return this.runtime;
    }

    public String getTitle() {
        return this.title;
    }

    public String getGenre() {
        return this.genre;
    }

    public int getPopularity() {
        return this.popularity;
    }

    public boolean getWonAward() {
        return this.wonAward;
    }

    //--other methods--
    public String toString() {
        return String.format("%s (%d)",this.title, this.year);
    }

}
