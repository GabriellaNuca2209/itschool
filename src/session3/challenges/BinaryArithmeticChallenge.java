package session3.challenges;

import java.util.Scanner;

public class BinaryArithmeticChallenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, fellow adventurer! Let's go back to school and do some basic arithmetics!" + "\n" + "Enter first number, please.");
        int firstNumber = scanner.nextInt();
        System.out.println("Great! Give us the second number.");
        int secondNumber = scanner.nextInt();

        int additionResult = addition(firstNumber, secondNumber);
        int subtractionResult = subtraction(firstNumber, secondNumber);
        int multiplicationResult = multiplication(firstNumber, secondNumber);
        int divisionResult = division(firstNumber, secondNumber);
        int modulusResult = modulus(firstNumber, secondNumber);

        System.out.println("Addition: " + additionResult);
        System.out.println("Subtraction: " + subtractionResult);
        System.out.println("Multiplication: " + multiplicationResult);
        System.out.println("Division: " + divisionResult);
        System.out.println("Modulus: " + modulusResult);

        System.out.println("Now let's calculate the area of a rectangle! Give us the width.");
        int width = scanner.nextInt();
        System.out.println("And the length.");
        int length = scanner.nextInt();
        int area = multiplication(width, length);
        System.out.println("Area: " + area);

        scanner.close();
    }

    public static int addition(int number1, int number2) {
        return number1 + number2;
    }

    public static int subtraction(int number1, int number2) {
        return number1 - number2;
    }

    public static int multiplication(int number1, int number2) {
        return number1 * number2;
    }

    public static int division(int number1, int number2) {
        return number1 / number2;
    }

    public static int modulus(int number1, int number2) {
        return number1 % number2;
    }
}
