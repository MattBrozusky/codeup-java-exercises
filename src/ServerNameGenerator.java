import java.util.Random;
public class ServerNameGenerator {

    public static String[] adjectives = {"quick", "ambitious", "aggressive", "agreeable", "brave", "calm", "delightful", "eager", "faithful", "fat"};

    public static String[] nouns = {"dog", "cat", "tree", "cup", "person", "plant", "building", "desk", "car", "apple"};


    public static String randomElement(String[] array){
        return array[new Random().nextInt(array.length)];
    }


    public static void main(String[] args) {

        String randomAdjective = randomElement(adjectives), randomNoun = randomElement(nouns);

        System.out.format("Here is your random adjective-noun: %s-%s", randomAdjective, randomNoun);

    }


}