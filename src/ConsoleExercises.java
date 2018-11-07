import java.util.Scanner;
public class ConsoleExercises {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");

//        double pi = 3.14159;
//        System.out.format("The value of pi is approximately %.2f", pi);


//        int number = sc.nextInt();
//        System.out.println(number);

//        System.out.println("Enter three words here: ");
//        String word1 = sc.next();
//        String word2 = sc.next();
//        String word3 = sc.next();
//
//        System.out.println(word1);
//        System.out.println(word2);
//        System.out.println(word3);


//        System.out.println("Enter a sentence here: ");
//        String sentence = sc.nextLine();
//        System.out.println(sentence);


//        System.out.println("Enter a height in feet here: ");
//        String height = sc.nextLine();
//        float heightInt = Float.parseFloat(height);
//        System.out.println("Enter a width in feet here: ");
//        String width = sc.nextLine();
//        float widthInt = Float.parseFloat(width);
//        System.out.println("Enter a length in feet here: ");
//        String length = sc.nextLine();
//        float lengthInt = Float.parseFloat(length);



        System.out.println("Enter a height in feet here: ");
        float height = Float.parseFloat(sc.next());
        System.out.println("Enter a width in feet here: ");
        float width = Float.parseFloat(sc.next());
        System.out.println("Enter a length in feet here: ");
        float length = Float.parseFloat(sc.next());

        System.out.format("The area of the room is: %.2f", (height * width));
        System.out.format("\nThe perimeter of the room is: %.2f", (height * 2.0 + width * 2.0));
        System.out.format("\nThe volume of the room is: %.2f", (height * width * length));




    }
}
