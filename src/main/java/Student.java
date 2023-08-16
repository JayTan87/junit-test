import java.util.ArrayList;

public class Student {

    private String name;
    private int studentID;

    private ArrayList<Integer> grades;
    public Student(String name, int studentID) {
        this.name = name;
        this.studentID = studentID;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public int getStudentID() {
        return this.studentID;
    }

    public ArrayList<Integer> getGrades() {
        return this.grades;
    }
    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public double getGradeAverage() {
        int total = 0;
        for (int grade : grades) {
            total += grade;
        }
        return (double) total / grades.size();
    }
}
