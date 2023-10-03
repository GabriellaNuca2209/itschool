package session9.challenges.college_management_system;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class CollegeManagementApp {

    public static void main(String[] args) {
        LocalDate dateOfBirthAlice = LocalDate.of(2002, 8, 12);
        LocalDate dateOfBirthMicah = LocalDate.of(1986, 5, 23);
        LocalDate dateOfBirthJane = LocalDate.of(1980, 8, 7);

        // Student construction
        Student alice = new Student("2000000000000", "Alice", "Twain", "female", calculateAge(dateOfBirthAlice),
                dateOfBirthAlice, "The Monument nr. 3");

        // Professor construction
        Professor micah = new Professor("1000000000000", "Micah", "Johnson", "male", calculateAge(dateOfBirthMicah),
                dateOfBirthMicah, "Burglar nr. 13");
        Professor jane = new Professor("2000000000000", "Jane", "Doe", "female", calculateAge(dateOfBirthJane),
                dateOfBirthJane, "There nr. 10");

        // Course construction
        Course math = new Course("Math", LocalDateTime.of(2023, 10, 12, 15, 0), 2, "Introduction in Algebra", micah);
        Course computerScience = new Course("Computer Science", LocalDateTime.of(2023, 10, 12, 17, 0), 2.5, "Methodologies", jane);

        alice.addCourse(math);
        alice.addCourse(computerScience);
        alice.getCourses();
    }

    public static int calculateAge(LocalDate dateOfBirth) {
        LocalDate today = LocalDate.now();
        return Period.between(dateOfBirth, today).getYears();
    }
}
