package session9.challenges.college_management_system;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Student {

    private final String CNP;
    private String firstName;
    private String lastName;
    private String sex;
    private int age;
    private final LocalDate dateOfBirth;
    private String address;

    List<String> courses = new ArrayList<>();

    public Student(String CNP, String firstName, String lastName, String sex, int age, LocalDate dateOfBirth, String address) {
        this.CNP = CNP;
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    public void addCourse(Course course) {
        courses.add(course.toString());
    }

    public void getCourses() {
        System.out.println("Courses for " + firstName + ": " + "\n");
        for (String course : courses) {
            System.out.println(course);
        }
    }

    public String getCNP() {
        return CNP;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "CNP='" + CNP + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", dateOfBirth=" + dateOfBirth +
                ", address='" + address + '\'' +
                ", courses=" + courses +
                '}';
    }
}
