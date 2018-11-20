package grades;

import util.Input;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        Input sc = new Input(new Scanner(System.in));

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

        System.out.println(students.keySet());
        allGradesOrSpecific(students, sc);
    }


    private static void getUserDataChoice(HashMap<String, Student> students, Input sc){
        System.out.format("%n%nWhat student would you like to see more information on?");
        correctInput:
        do {
            String userNameChoice = sc.getString();
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
        System.out.format("%nWould you like to get info on another student? [yes/no]");
        String continueOrNot = sc.getString();

        if (continueOrNot.equalsIgnoreCase("yes") || continueOrNot.equalsIgnoreCase("y")) {
            allGradesOrSpecific(students, sc);
        } else {
            System.out.println("Goodbye");
        }
    }

    private static void displayStudentInfo(HashMap<String, Student> students, String userNameChoice){
        System.out.format("Student name: %s%nStudent grade: %s%nAll grades for student: %s",
                students.get(userNameChoice).getStudentName(),
                students.get(userNameChoice).getGradeAverage(),
                students.get(userNameChoice).getStudentGrades());
    }

    private static void allGradesOrSpecific(HashMap<String, Student> students, Input sc){
        System.out.println("Here are the github usernames of our students:");
        for (String keyName : students.keySet()) {
            System.out.print(" |" + keyName + "| ");
        }

        System.out.format("%n%nWould you like to see all grades for all students or look at one specifically? [all/one]");
        String allOrOne = sc.getString();

        if (allOrOne.equalsIgnoreCase("all")){
            for(Student student : students.values()) {
                System.out.println(student.getStudentGrades());
            }
            continueOrNot(students, sc);
        } else if (allOrOne.equalsIgnoreCase("one")){
            getUserDataChoice(students, sc);
        } else {
            System.out.println("Invalid Input. Try Again.");
            allGradesOrSpecific(students, sc);
        }

    }




}


