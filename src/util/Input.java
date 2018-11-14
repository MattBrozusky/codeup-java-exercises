package util;
import java.util.Scanner;

public class Input {
    private Scanner sc;

    public Input(){
        this.sc = new Scanner(System.in);
    }

    public Scanner getSc() {
        return sc;
    }

    public String getString(Scanner sc){
        return sc.nextLine();
    }

    public boolean yesNo(Scanner sc){
        String yesOrNo = sc.nextLine();
        if (yesOrNo.equalsIgnoreCase("y") || yesOrNo.equalsIgnoreCase("yes")){
            System.out.println("True");
            return true;
        } else {
            System.out.println("False");
            return false;
        }
    }

//    int getInt(int min, int max, Scanner sc){
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
    int getInt(Scanner sc){
        if (!sc.hasNextInt()){
            System.out.println("Not valid integer.");
            sc.nextLine();
            return getInt(sc);
        } else {
            return sc.nextInt();
        }
    }

    public double getDouble(double min, double max, Scanner sc){
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


//    double getDouble(Scanner sc){
//
//    }

}
