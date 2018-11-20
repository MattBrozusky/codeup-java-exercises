package grades;
import java.util.ArrayList;
import java.util.List;

public class Student {

    private String studentName;
    private List<Integer> studentGrades;

    public String getStudentName(){
        return this.studentName;
    }

    public List<Integer> getStudentGrades(){
        return this.studentGrades;
    }

    public void addGrade(int grade){
        this.studentGrades.add(0, grade);
    }

    public double getGradeAverage(){
        double finalGrade = 0;
        for (int i = 0; i < this.studentGrades.size(); i++){
            finalGrade += this.studentGrades.get(i);
        }
        return finalGrade / this.studentGrades.size();
    }


    public Student(String studentName, int grade1, int grade2, int grade3) {
        this.studentName = studentName;
        this.studentGrades = new ArrayList<>(){{
            add(grade1);
            add(grade2);
            add(grade3);
        }};
    }



}