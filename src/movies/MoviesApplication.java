package movies;
import util.Input;

import java.util.Arrays;

public class MoviesApplication {
    public static void main(String[] args) {
        Input in = new Input();
        System.out.println("Would you like to view all movies or sort by genre?");
        String allOrGenre = in.getSc().nextLine();


        Movie[] allMovies = MoviesArray.findAll();

        for (Movie movie : allMovies){
            System.out.println(movie.getName());
        }

    }






}


//    Give the user a list of options for viewing all the movies or viewing movies by category.
//        Use your Input class to get input from the user, and display information based on their choice. (Remember to import your Input class)
//        If a category is selected, only movies from that category should be displayed.
//        Your application should continue to run until the user chooses to exit.
