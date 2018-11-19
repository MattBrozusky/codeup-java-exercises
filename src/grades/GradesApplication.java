package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        Input sc = new Input();

        Student bob = new Student("Bob", 90, 60, 70);
        Student shelly = new Student("Shelly", 97, 83, 94);
        Student matt = new Student("Matt", 72, 99, 65);
        Student dave = new Student("Dave", 76, 84, 62);

        HashMap<String, Student> students = new HashMap<>(){{
           put("bobby145", bob);
           put("shellySaysHi", shelly);
           put("MRMATT", matt);
           put("__DAVE__45", dave);
        }};

        getUserDataChoice(students, sc);

    }


    private static void getUserDataChoice(HashMap<String, Student> students, Input sc){
        System.out.println("Here are the github usernames of our students:");

        for (String keyName : students.keySet()) {
            System.out.print(" |" + keyName + "| ");
        }

        System.out.format("%n%nWhat student would you like to see more information on?");
        correctInput:
        do {
            String userNameChoice = sc.getSc().nextLine();
            for (String keyName : students.keySet()) {
                if (keyName.equals(userNameChoice)){
                    displayStudentInfo(students, userNameChoice);
                    break correctInput;
                }
            }
            System.out.println("Invalid Input. Enter correct username.");
        } while (true);
        continueOrNot(students, sc);
    }

    private static void continueOrNot(HashMap<String, Student> students, Input sc){
        System.out.println("Would you like to get info on another student? [yes/no]");
        String continueOrNot = sc.getSc().nextLine();

        if (continueOrNot.equalsIgnoreCase("yes") || continueOrNot.equalsIgnoreCase("y")) {
            getUserDataChoice(students, sc);
        } else {
            System.out.println("Goodbye");
        }
    }

    private static void displayStudentInfo(HashMap<String, Student> students, String userNameChoice){
        System.out.format("Student name: %s%nStudent grade: %s%n", students.get(userNameChoice).getStudentName(), students.get(userNameChoice).getGradeAverage());
    }
}


