package util;

import java.util.Scanner;

public class InputTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Input test = new Input(sc);

        System.out.printf("The string you entered is %s", test.getString());

        test.getDouble(1, 50);

    }
}
