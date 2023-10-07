package session09.challenges.school_gradebook;

import java.text.DecimalFormat;
import java.util.UUID;

public class GradeBookApp {

    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        Student sunny = new Student(UUID.randomUUID(), "Sunny", "Mason");
        Student jane = new Student(UUID.randomUUID(), "Jane", "Crook");

        Teacher mark = new Teacher("Mark", "Twain", "Biology");

        mark.addStudent(sunny);
        mark.addStudent(jane);

        mark.addGrade(5, sunny);
        mark.addGrade(10, jane);
        mark.addGrade(8.5, jane);
        mark.addGrade(7.5, sunny);
        mark.addGrade(9.5, sunny);

        mark.getStudents();
        double sunnyAverage = mark.getAverageStudentGrade(sunny);
        System.out.println("Average for Sunny: " + df.format(sunnyAverage));
        double classAverage = mark.getAverageClassGrade();
        System.out.println("Average in Marks's class: " + df.format(classAverage));

    }
}
