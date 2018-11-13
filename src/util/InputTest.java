package util;

public class InputTest {

    public static void main(String[] args) {
        Input test = new Input();

        System.out.printf("The string you entered is %s", test.getString(test.getSc()));

        test.getDouble(1, 50, test.getSc());

    }
}
