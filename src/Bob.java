import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//
//                Bob is a lackadaisical teenager. In conversation, his responses are very limited.
//
//        Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
//        He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
//        He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
//        He answers 'Whatever.' to anything else.
//        Write the Java code necessary so that a user of your command line application can have a conversation with Bob.


//        System.out.println("Say something you want to Bob. Make sure you use proper punctuation");
//
//        String response, keepGoing;
//
//       finish:
//       do {
//           response = sc.nextLine();
//           if (response.endsWith("?")){
//               System.out.println("Sure.");
//           } else if (response.endsWith("!")){
//               System.out.println("Whoa, chill out!");
//           } else if (response.equalsIgnoreCase("")){
//               System.out.println("Fine. Be that way!");
//           } else {
//               System.out.println("Whatever.");
//           }
//
//           do {
//               System.out.println("Would you like to say something else to Bob?");
//               keepGoing = sc.nextLine();
//               if (keepGoing.equalsIgnoreCase("yes")){
//                   System.out.println("Out with it then.");
//                   break;
//               } else if (keepGoing.equalsIgnoreCase("no")){
//                   System.out.println("Cya");
//                   break finish;
//               }
//               System.out.println("Bob is simple, just say yes or no.");
//           } while (true);
//
//       } while (keepGoing.equalsIgnoreCase("yes"));





//        Create an application that allows the user to enter a sentence
//        and tells them how many vowels and consonants were used.
//
//        Example:
//
//        input - "The hill are alive."
//        output - 5 vowels and 10 consonants


        System.out.println("Enter any sentence you want.");
        String response = sc.nextLine();
        int vowels = 0, consonants = 0;

        for (int i = 0; i < response.length(); i++){
            char thisChar = response.charAt(i);
            thisChar = Character.toUpperCase(thisChar);
            switch (thisChar) {
                case 'A':
                    vowels += 1;
                    break;
                case 'E':
                    vowels += 1;
                    break;
                case 'I':
                    vowels += 1;
                    break;
                case 'O':
                    vowels += 1;
                    break;
                case 'U':
                    vowels += 1;
                    break;
                case ',': case '.': case '!': case '?': case '\'': case '"':
                    break;
                default:
                    consonants += 1;
                    break;
            }
        }
        System.out.format("Here is the number of vowels: %d\nAnd here is the number of consonants: %d", vowels, consonants);




    }
}
