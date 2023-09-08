package session3.practice;

public class Variables {

    private static String name = "John";

    public static void main(String[] args) {
        int age; // declaration
        age = 27; // initialization
        System.out.println(name);

        int myAge = 29;
        System.out.println("I'm John, and I'm " + myAge + " years old");
    }

    public static void practiceVariableScope() {
        int outerVar = 24;
        System.out.println(name);

        if (outerVar > 10) {
            int innerVal = 200;
            System.out.println(innerVal + outerVar);
        }

//        System.out.println(innerVal);  <-  this leads to a compile error due to variable scope
    }
}
