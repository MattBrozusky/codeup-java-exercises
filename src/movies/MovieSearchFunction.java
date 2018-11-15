package movies;
import util.Input;

public class MovieSearchFunction {

    public static void allOrGenre(Input in, Movie[] allMovies){
        System.out.println("Would you like to view all movies or sort by genre? (Type 'all' or genre name: scifi, drama, musical, horror, comedy, animated)");
        String allOrGenre = in.getSc().nextLine();
        switch (allOrGenre) {
            case "all": case "scifi": case "drama": case "musical": case "horror": case "comedy": case "animated":
                masterSearchMovies(allMovies, allOrGenre);
                break;
            default:
                System.out.println("Invalid Input");
                allOrGenre(in, allMovies);
                break;
        }
    }
    private static void masterSearchMovies(Movie[] allMovies, String searchQuery){
        if (searchQuery.equalsIgnoreCase("all")) {
            for (Movie movie : allMovies){
                System.out.format("%-15s ---- %s%n", movie.getName(), movie.getCategory());
            }
        } else {
            for (Movie movie : allMovies){
                if (movie.getCategory().equalsIgnoreCase(searchQuery)){
                    System.out.format("%-15s ---- %s%n", movie.getName(), movie.getCategory());
                }
            }
        }
    }
}
