import java.io.*;
import java.util.ArrayList;

public class CsvReader implements Closeable{

    private final String separator;
    private final BufferedReader bufferedReader;

    //--constructor--
    public CsvReader(String path, String separator) throws FileNotFoundException {
        File file = new File(path);
        this.separator = separator;

        try {
            bufferedReader = new BufferedReader(new FileReader(file));
        } catch (IOException e) {
            throw new FileNotFoundException("File not found: " + file.getAbsolutePath());
        }
    }

    //--getters--
    public ArrayList<Movie> getList() {

        ArrayList<Movie> movieList = new ArrayList<>();
        String line;
        String[] movieInfo;

        try {

            //skip header
            bufferedReader.readLine();

            //go over each line in csv file
            while ((line = bufferedReader.readLine()) != null) {

                //set movieInfo array to each line of csv file
                movieInfo = line.split(separator);

                //create movie object
                Movie movie = new Movie();

                //set movie object data
                movie.setYear(Integer.parseInt(movieInfo[0]));
                movie.setRuntime(Integer.parseInt(movieInfo[1]));
                movie.setTitle(movieInfo[2]);
                movie.setGenre(movieInfo[3]);
                movie.setPopularity(Integer.parseInt(movieInfo[4]));
                movie.setWonAward(movieInfo[5].equalsIgnoreCase("yes"));

                //add movie to arrayList
                movieList.add(movie);
            }

            if (movieList.isEmpty()) {
                throw new RuntimeException("No movies found in file!");
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return movieList;
    }

    //--other methods--
    @Override
    public void close(){
        try {
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
