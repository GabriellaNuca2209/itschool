package session05.challenges;

public class Challenge9 {

    public static void main(String[] args) {
        int[] someArray = {2, 6, 89, 23, 44, 56, 13};
        printDefinedNumbers(someArray);
    }

    public static void printDefinedNumbers(int[] array) {
        for (int number : array) {
            if (number % 2 == 0) {
                System.out.println(number + " is even");
            } else {
                System.out.println(number + " is odd");
            }
        }
    }
}
