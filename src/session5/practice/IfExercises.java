package session5.practice;

public class IfExercises {

    public static void main(String[] args) {
        int numberValue = 5;
        int numberToCompareValue = 10;
        printNumberComparisonInfo(numberValue, numberToCompareValue);
        printMultipleNumberComparison(67);
    }

    public static void printNumberComparisonInfo(int number, int numberToCompare) {
        if (number > numberToCompare) {
            System.out.println("The number is greater than 10");
        } else if (number == numberToCompare) {
            System.out.println("The number is 10");
        } else {
            System.out.println("The number is smaller than 10");
        }
    }

    private static void printMultipleNumberComparison(int number) {
        if (number >= 0 && number <= 50) {
            System.out.println("The number is between 0 and 50");
        } else if (number >= 51 && number <= 100) {
            System.out.println("The number is between 51 and 100");
        } else {
            System.out.println("The number is out of range");
        }
    }
}
