package session15_equals_and_hashcode.challenges.challenge09;

public class Student {

    private String name;
    private int age;
    private double generalGrade;

    public Student(String name, int age, double generalGrade) {
        this.name = name;
        this.age = age;
        this.generalGrade = generalGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGeneralGrade() {
        return generalGrade;
    }

    public void setGeneralGrade(double generalGrade) {
        this.generalGrade = generalGrade;
    }

    @Override
    public String toString() {
        return "Name " + name + " Age " + age + " Grade " + generalGrade;
    }
}
