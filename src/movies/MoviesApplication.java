package movies;
import util.Input;
import java.util.Arrays;

public class MoviesApplication {
    public static void main(String[] args) {
        Input in = new Input();
        Movie[] allMovies = MoviesArray.findAll();

        searchOrAdd(in, allMovies);


    }

    public static void searchOrAdd(Input in, Movie [] allMovies){
        System.out.println("Would you like to view search through the movies or add to the list? (Type 'search' or 'add')");
        String searchOrAddInput = in.getSc().nextLine(), userChoice;
        if (searchOrAddInput.equalsIgnoreCase("search")){
            MovieSearchFunction.allOrGenre(in, allMovies);
        } else if (searchOrAddInput.equalsIgnoreCase("add")){
            allMovies = addMovie(allMovies, userCreatedMovie(in));
        } else {
            searchOrAdd(in, allMovies);
        }
        do {
            System.out.println("Would you like to search/add again? [yes/no]");
            userChoice = in.getSc().nextLine().trim();
        } while (!userChoice.equalsIgnoreCase("yes") && !userChoice.equalsIgnoreCase("no"));
        if (userChoice.equalsIgnoreCase("yes")){
            searchOrAdd(in, allMovies);
        }
    }

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

