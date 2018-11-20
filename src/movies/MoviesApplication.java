package movies;
import util.Input;

import java.util.Scanner;


public class MoviesApplication {
    
    public static void main(String[] args) {
        Input in = new Input(new Scanner(System.in));
        Movie[] allMovies = MoviesArray.findAll();
        searchOrAdd(in, allMovies);
    }

    public static void searchOrAdd(Input in, Movie [] allMovies){
        System.out.println("Would you like to search through the movies or add to the list? (Type 'search' or 'add')");
        String searchOrAddInput = in.getString(), userChoice;

        if (searchOrAddInput.equalsIgnoreCase("search")){
            MovieSearchFunction.allOrGenre(in, allMovies);
        } else if (searchOrAddInput.equalsIgnoreCase("add")){
            allMovies = MovieAddFunction.addMovieMethod(in, allMovies);
        } else {
            searchOrAdd(in, allMovies);
        }

        do {
            System.out.println("Would you like to search/add again? [yes/no]");
            userChoice = in.getString().trim();
        } while (!userChoice.equalsIgnoreCase("yes") && !userChoice.equalsIgnoreCase("no"));
        if (userChoice.equalsIgnoreCase("yes")){
            searchOrAdd(in, allMovies);
        }
    }
}

