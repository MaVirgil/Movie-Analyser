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
    public int getRuntime() {
        return this.runtime;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean getWonAward() {
        return this.wonAward;
    }

    //--other methods--
    public String toString() {
        return String.format("%s (%d)",this.title, this.year);
    }

}
