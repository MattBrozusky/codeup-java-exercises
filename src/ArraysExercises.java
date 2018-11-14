import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {

//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));


        Person[] people = new Person[3];

        people[0] = new Person("Jim");
        people[1] = new Person("John");
        people[2] = new Person("Jaime");

//        for (Person person : people){
//            System.out.println(person.getName());
//        }


        Person matt = new Person("Matt");

        for (Person person : addPerson(people, matt)){
            System.out.println(person.getName());
        }


    }

    public static Person[] addPerson(Person[] people, Person singlePerson){
        Person[] people1 = Arrays.copyOf(people, people.length + 1);
        people1[people.length] = singlePerson;
        return people1;
    }

}

