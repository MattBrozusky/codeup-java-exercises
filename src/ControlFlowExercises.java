import java.util.Scanner;
import javax.swing.*;
import java.awt.*;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");

//        int i = 5;
//
//        while (i <= 15){
//            System.out.println(i++);
//        }


//        int i = 0;
//
//        do {
//            System.out.println(i);
//            i += 2;
//        } while (i <= 100);


//        int i = 100;
//
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while (i >= -10);


//        double i = 2;
//
//        do {
//            int num = (int) i;
//            System.out.println(num);
//            i *= i;
//        } while (i <= 1000000);

//        for (int i = 100; i >= -10; i -= 5){
//            System.out.println(i);
//        }

//        for (double i = 2; i <= 1000000; i = Math.pow(i, 2)){
//            System.out.println(i);
//        }


//        for (int i = 1; i <= 100; i++){
//            if ((i % 3 == 0) && (i % 5 == 0)){
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0){
//                System.out.println("Fizz");
//            } else if (i % 5 == 0){
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }


//        Prompt the user to enter an integer.
//        Display a table of squares and cubes from 1 to the value entered.
//        Ask if the user wants to continue.
//        Assume that the user will enter valid data.
//        Only continue if the user agrees to.



//        System.out.println("What whole number would you like to go up to?");
//        double num = sc.nextInt();
//
//        final JFrame frame = new JFrame("JTable Demo");
//
//        String[] columns = {"Number", "Squared", "Cubed"};
//
//
//
//        for (int i = 1; i <= num; i++) {
//            Object[][] data = {
//                    {i, i * i, i * i * i},
//            };
//        }
//
//        JTable table = new JTable(data, columns);
//        JScrollPane scrollPane = new JScrollPane(table);
//        table.setFillsViewportHeight(true);
//
//        JLabel lblHeading = new JLabel("Stock Quotes");
//        lblHeading.setFont(new Font("Arial",Font.TRUETYPE_FONT,24));
//
//        frame.getContentPane().setLayout(new BorderLayout());
//
//        frame.getContentPane().add(lblHeading,BorderLayout.PAGE_START);
//        frame.getContentPane().add(scrollPane,BorderLayout.CENTER);
//
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(550, 200);
//        frame.setVisible(true);

//        System.out.println("Enter a number: ");
//
//        int i, numLimit, square, cube;
//        numLimit = sc.nextInt();
//
//        System.out.println("number | squared | Cubed ");
//        System.out.println("------ | ------- | ----- ");
//
//        for(i = 1; i <= numLimit; i++) {
//            square = i * i;
//            cube = i * i * i;
//
//            System.out.printf("%-7d| ", i);
//            System.out.printf("%-8d| ", square);
//            System.out.printf("%d\n", cube);
//        }


//        Convert given number grades into letter grades.
//        Prompt the user for a numerical grade from 0 to 100.
//        Display the corresponding letter grade.
//        Prompt the user to continue.
//        Assume that the user will enter valid integers for the grades.
//        The application should only continue if the user agrees to.
//        Grade Ranges:
//
//        A : 100 - 88
//        B : 87 - 80
//        C : 79 - 67
//        D : 66 - 60
//        F : 59 - 0



        String keepGoing;

        do {
            System.out.println("Please enter a number grade from 0-100");
            int numGrade = Integer.parseInt(sc.nextLine());
            if (numGrade <= 59){
                System.out.println('F');
            } else if (numGrade <= 66) {
                System.out.println('D');
            } else if (numGrade <= 79) {
                System.out.println('C');
            } else if (numGrade <= 87) {
                System.out.println('B');
            } else if (numGrade <= 100) {
                System.out.println('A');
            }

            System.out.println("Would you like to check another grade?");
            keepGoing = sc.nextLine();

        } while (keepGoing.equalsIgnoreCase("yes"));





//        Create a command line adventure game...
//        Be creative in communicating with your user different options and for given scenerios. Create at least three phases of the adventure, for example...
//        Home
//                |             |
//        Store     or      Park
//                |        |        |         |
//        School  or  Park     Zoo  or  Pool
//                  |
//        Home
//        Keep the game relatively simple and plan it out clearly before coding it.
//                Create a command line Hangman game...
//        Prompt a player 1 to enter a word for player 2 to guess.
//        Track the number of guesses by player 2. Display to the user the partially completed word
//        String lesson methods will be helpful for this bonus


    }
}
