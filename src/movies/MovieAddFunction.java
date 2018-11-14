package movies;
import util.Input;
import java.util.Arrays;

public class MovieAddFunction {

    public static Movie userCreatedMovie(Input in){
        System.out.println("Please enter a title for the movie.");
        String newMovieTitle = in.getSc().nextLine();
        System.out.println("Please enter a category for the movie.");
        String newMovieCategory = in.getSc().nextLine();
        return new Movie(newMovieTitle, newMovieCategory);
    }

    public static Movie[] addMovie(Movie [] allMovies, Movie newMovie){
        Movie[] newMovieList = Arrays.copyOf(allMovies, allMovies.length + 1);
        newMovieList[allMovies.length] = newMovie;
        return  newMovieList;
    }
}
