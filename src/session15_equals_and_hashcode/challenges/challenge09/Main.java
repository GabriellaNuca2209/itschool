package session15_equals_and_hashcode.challenges.challenge09;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Student student = new Student("Alice", 20, 8.5);
        printObjectToJSON(student);
    }

    private static void printObjectToJSON(Object obj) {
        StringBuilder result = new StringBuilder();
        String[] objString = obj.toString().split(" ");
        System.out.println(Arrays.toString(objString));
        for (int index = 0; index < objString.length - 1; index++) {
            result.append(objString[index]).append(" : ").append(objString[index + 1]).append("\n");
            if(index + 1 < objString.length - 1) {
                index++;
            }
        }
        System.out.println(result);
    }
}
