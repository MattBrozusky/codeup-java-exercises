package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input(Scanner scanner) {
        this.scanner = scanner;
    }

    public String getString() {
        return scanner.nextLine();
    }


    public boolean yesNo() {
        String userInput = getString();
        return (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes"));
    }

    public int getInt() {
        try {
            return Integer.valueOf(scanner.nextLine());
        } catch (NumberFormatException e){
            System.out.println("Input Valid Integer.");
            return getInt();
        }
    }

    public int getInt(int min, int max) {
        int userInt = getInt();
        if (userInt >= min && userInt <= max) {
            return userInt;
        } else {
            System.out.println("Number out of range!");
            return getInt(min, max);
        }
    }

    public double getDouble() {
        try {
            return Double.valueOf(scanner.nextLine());
        } catch (NumberFormatException e){
            System.out.println("Input Valid Integer.");
            return getDouble();
        }
    }

    public double getDouble(int min, int max) {
        double userDouble = getDouble();
        if (userDouble >= min && userDouble <= max) {
            return userDouble;
        } else {
            System.out.println("Number out of range!");
            return getDouble(min, max);
        }
    }

    public int getBinary(){
        try {
            return Integer.valueOf(scanner.nextLine(), 2);
        } catch (NumberFormatException e){
            System.out.println("Input Valid Integer.");
            return getBinary();
        }
    }

    public int getHex(){
        try {
            return Integer.valueOf(scanner.nextLine(), 16);
        } catch (NumberFormatException e){
            System.out.println("Input Valid Integer.");
            return getBinary();
        }
    }








}