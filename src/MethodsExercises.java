import java.util.Scanner;
import java.util.Random;
public class MethodsExercises {
    public static void main(String[] args) {

//        System.out.println(addition(1, 5));
//        System.out.println(subtraction(1, 5));
//        System.out.println(multiplication(1, 5, 0));
//        System.out.println(division(5, 5));
//        System.out.println(modulus(10, 5));

//        factorial(getInteger(1, 20));

//        diceRoll();


    }


    public static int addition(int num1, int num2){
        return num1 + num2;
    }

    public static int subtraction(int num1, int num2){
        return num1 - num2;
    }

    public static int multiplication(int num1, int num2, int total){
//        for (int i = num2; i > 0; i -= 1){
//            total += num1;
//        }
//        return total;
        if (num2 == 0){
            return total;
        } else {
            total += num1;
            return multiplication(num1, num2 - 1, total);
        }
    }

    public static int division(int num1, int num2){
        return num1 / num2;
    }

    public static int modulus(int num1, int num2){
        return num1 % num2;
    }



    public static int getInteger(int min, int max){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 20: ");
        int input = Integer.parseInt(sc.nextLine());
        if (input < min || input > max){
            System.out.println("Invalid Input!");
            return getInteger(min, max);
        } else {
            System.out.format("%d is a correct input. Good job!", input);
            return input;
        }
    }


    public static int factorial(int input){
        Scanner sc = new Scanner(System.in);

//        if (input == 1)return 1;
//        return input * factorial(input--);

        long total = 1;
        for (int i = input; i >= 1; i -= 1){
            total *= i;
        }
        System.out.format("\nHere is the factorial of %d: %d", input, total);

        System.out.println("\nWould you like to check another number? [yes/no]");
        String continueFactorial = sc.nextLine();
        return continueFactorial.equalsIgnoreCase("yes") ? factorial(getInteger(1, 20)) : 0;
    }



//    Create an application that simulates dice rolling.
//

//"Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
//            Use static methods to implement the method(s) that generate the random numbers.
//    Use the .random method of the java.lang.Math class to generate random numbers.


    public static int diceRoll(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of sides for your dice");
        int numOfSides = Integer.parseInt(sc.nextLine());
        if (numOfSides <= 0) {
         System.out.println("Invalid Input. Try Again");
         return diceRoll();
        }

        System.out.println("Type \"Roll\" to roll the dice.");
        String roll = sc.nextLine();
        if (!roll.equalsIgnoreCase("roll")) {
         System.out.println("Invalid Input. Try Again");
         return diceRoll();
        }

        int dice1 = randomNum(numOfSides), dice2 = randomNum(numOfSides);
        System.out.format("The first die landed on %d. And the second die landed on %d.", dice1, dice2);

        System.out.println("\nWould you like to roll another set of dice? [yes/no]");
        String continueFactorial = sc.nextLine();
        return continueFactorial.equalsIgnoreCase("yes") ? diceRoll() : 0;
    }

    public static int randomNum(int num){
        Random rand = new Random();
        return rand.nextInt(num) + 1;
    }
}
