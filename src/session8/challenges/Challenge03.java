package session8.challenges;

import java.util.ArrayList;
import java.util.List;

public class Challenge03 {

    public static void main(String[] args) {
        String[] studentArray = {"Alice", "Marco", "Bob", "Jane", "Fillip", "Robert", "Sunny", "Judy", "Frank", "Jose"};
        ArrayList<String> studentList = new ArrayList<>(List.of(studentArray));
        ArrayList<String> graduateStudentList = new ArrayList<>(studentList);

        printGraduateStudents(graduateStudentList);
    }

    public static void printGraduateStudents(ArrayList<String> arr) {
        for (String student : arr) {
            System.out.println(student);
        }
    }
}
