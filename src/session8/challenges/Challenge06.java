package session8.challenges;

import java.util.LinkedList;

public class Challenge06 {

    public static void main(String[] args) {
        LinkedList<String> studentList = new LinkedList<>();
        studentList.add("Alice");
        studentList.add("John");
        studentList.add("Bob");
        studentList.add("Michael");
        System.out.println("Before removing: " + studentList);

        removeParticularStudent("Bob", studentList);
        System.out.println("After removal: " + studentList);
    }

    public static void removeParticularStudent(String name, LinkedList<String> studentArr) {
        if (studentArr.contains(name)) {
            studentArr.remove(name);
            System.out.println(name + " was removed");
        } else {
            System.out.println("Not here");
        }
    }
}
