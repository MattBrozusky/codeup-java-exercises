package util;
import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        getString(sc);

        getDouble(1, 50, sc);

    }

    static String getString(Scanner sc){
        System.out.println("Enter String.");
        String test = sc.nextLine();
        System.out.printf("The string you entered is %s", test);
        return test;
    }

    static boolean yesNo(Scanner sc){
        String yesOrNo = sc.nextLine();
        if (yesOrNo.equalsIgnoreCase("y") || yesOrNo.equalsIgnoreCase("yes")){
            System.out.println("True");
            return true;
        } else {
            System.out.println("False");
            return false;
        }
    }

//    static int getInt(int min, int max, Scanner sc){
//        System.out.print("Enter a number between 1 and 20: ");
//        int input = Integer.parseInt(sc.nextLine());
//        if (input < min || input > max){
//            System.out.println("Invalid Input!");
//            return getInt(min, max, sc);
//        } else {
//            System.out.format("%d is a correct input. Good job!", input);
//            return input;
//        }
//    }
//
//    static int getInt(Scanner sc){
//
//    }

    static double getDouble(double min, double max, Scanner sc){
        System.out.format("%nEnter a number between %f and %f: ", min, max);
        int input = Integer.parseInt(sc.nextLine());
        if (input < min || input > max){
            System.out.println("Invalid Input!");
            return getDouble(min, max, sc);
        } else {
            System.out.format("%d is a correct input. Good job!", input);
            return input;
        }
    }


//    static double getDouble(Scanner sc){
//
//    }

}
