import java.util.Random;
import java.util.Scanner;
public class HighLow {
    public static void main(String[] args) {

//        guessRandomNumber(randomNumTo100());

    }

    public static int randomNumTo100(){
        Random rand = new Random();
        return rand.nextInt(100) + 1;
    }

    public static int getGuess(){
        Scanner sc = new Scanner(System.in);
        int guess = Integer.parseInt(sc.nextLine());
        if (guess < 1){
            System.out.println("Invalid Input. Try Again!");
            return getGuess();
        } else if (guess > 100){
            System.out.println("Invalid Input. Try Again!");
            return getGuess();
        } else {
            return guess;
        }
    }

    public static int guessRandomNumber(int random){
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess a random number between 1 and 100!");

        int numberOfGuesses = 0;
        do {
            int guess = getGuess();
            if (guess == random){
                System.out.format("Congrats, you got it! But it took %d guesses...", numberOfGuesses);
                break;
            } else if (numberOfGuesses == 10){
                System.out.println(failedGuesses());
                break;
            } else if (guess > random){
                System.out.println("LOWER!");
            } else if (guess < random) {
                System.out.println("HIGHER!");
            }
            numberOfGuesses += 1;
            System.out.println(numberOfGuesses);
        } while(true);

        System.out.println("\nWould you like to guess another number? [yes/no]");
        String continueGuessing = sc.nextLine();
        return continueGuessing.equalsIgnoreCase("yes") ? guessRandomNumber(randomNumTo100()) : 0;

    }


    public static String failedGuesses(){
        return "You guessed 10 times already... You lose.";
    }















}
