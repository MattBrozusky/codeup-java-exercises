import java.util.Scanner;

public class HangmanGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        hangman(sc);

    }

    public static void hangman(Scanner sc){
        System.out.println("Please enter a word for Hangman!");
        String word = sc.nextLine();


    }




//    Create a command line Hangman game:
//            - prompt player 1 for a word
//  - player 2 (p2) has 9 guesses to correctly identify the word
//  - each round, display to the user...
//            1. the current visible letters of the word
//    2. the letters already incorrectly guessed
//    3. the number of guesses remaining
//  - at any round, they may guess a letter or multiple letters to complete the word
//    - if p2 guesses correctly, they WIN! and ask if they want to play again
//    - if p2 guesses wrong, they LOSE!
//            - if p2 runs out of guesses, they LOSE!







}
