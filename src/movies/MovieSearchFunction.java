package movies;

import util.Input;

public class MovieSearchFunction {

    public static void allOrGenre(Input in, Movie[] allMovies){
        System.out.println("Would you like to view all movies or sort by genre? (Type 'all' or genre name: scifi, drama, musical, horror, comedy, animated)");
        String allOrGenre = in.getSc().nextLine();
        switch (allOrGenre) {
            case "all":
                allMovies(allMovies);
                break;
            case "scifi":
                scifiMovies(allMovies);
                break;
            case "drama":
                dramaMovies(allMovies);
                break;
            case "musical":
                musicalMovies(allMovies);
                break;
            case "horror":
                horrorMovies(allMovies);
                break;
            case "comedy":
                comedyMovies(allMovies);
                break;
            case "animated":
                animatedMovies(allMovies);
                break;
            default:
                System.out.println("Invalid Input");
                allOrGenre(in, allMovies);
                break;
        }
    }

    private static void allMovies(Movie[] allMovies){
        for (Movie movie : allMovies){
            System.out.format("%-15s ---- %s%n", movie.getName(), movie.getCategory());
        }
    }
    private static void scifiMovies(Movie[] allMovies){
        for (Movie movie : allMovies){
            if (movie.getCategory().equalsIgnoreCase("scifi")){
                System.out.format("%-15s ---- %s%n", movie.getName(), movie.getCategory());
            }
        }
    }
    private static void dramaMovies(Movie[] allMovies){
        for (Movie movie : allMovies){
            if (movie.getCategory().equalsIgnoreCase("drama")){
                System.out.format("%-15s ---- %s%n", movie.getName(), movie.getCategory());
            }
        }
    }
    private static void musicalMovies(Movie[] allMovies){
        for (Movie movie : allMovies){
            if (movie.getCategory().equalsIgnoreCase("musical")){
                System.out.format("%-15s ---- %s%n", movie.getName(), movie.getCategory());
            }
        }
    }
    private static void horrorMovies(Movie[] allMovies){
        for (Movie movie : allMovies){
            if (movie.getCategory().equalsIgnoreCase("horror")){
                System.out.format("%-15s ---- %s%n", movie.getName(), movie.getCategory());
            }
        }
    }
    private static void comedyMovies(Movie[] allMovies){
        for (Movie movie : allMovies){
            if (movie.getCategory().equalsIgnoreCase("comedy")){
                System.out.format("%-15s ---- %s%n", movie.getName(), movie.getCategory());
            }
        }
    }
    private static void animatedMovies(Movie[] allMovies){
        for (Movie movie : allMovies){
            if (movie.getCategory().equalsIgnoreCase("animated")){
                System.out.format("%-15s ---- %s%n", movie.getName(), movie.getCategory());
            }
        }
    }

}
