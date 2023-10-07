package session09.challenges.school_gradebook;

import java.util.ArrayList;
import java.util.List;

public class Teacher {

    private String firstName;
    private String lastName;
    private final String subject;
    List<Student> students = new ArrayList<>();
    private List<ArrayList<Double>> studentGrades = new ArrayList<>();

    public Teacher(String firstName, String lastName, String subject) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
    }

    public void addStudent(Student student) {
        students.add(student);
        studentGrades.add(new ArrayList<>());
    }

    public void addGrade(double grade, Student student) {
        studentGrades.get(students.indexOf(student)).add(grade);
    }

    public List<Double> getStudentGrade(Student student) {
        return studentGrades.get(students.indexOf(student));
    }

    public void getAllStudentsGrades() {
        System.out.println(studentGrades);
    }

    public double getAverageStudentGrade(Student student) {
        double sum = 0;
        List<Double> grades = getStudentGrade(student);
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    public double getAverageClassGrade() {
        double sum = 0;
        List<Double> averagePerStudent = new ArrayList<>();
        for (Student student : students) {
            averagePerStudent.add(getAverageStudentGrade(student));
        }
        for (double grade : averagePerStudent) {
            sum += grade;
        }
        return sum / averagePerStudent.size();
    }

    public void getStudents() {
        System.out.println("Students of " + firstName + ":");
        for (Student student : students) {
            System.out.println(student.getFirstName() + ": " + studentGrades.get(students.indexOf(student)));
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", subject='" + subject + '\'' +
                ", students=" + students +
                ", studentGrades=" + studentGrades +
                '}';
    }
}
