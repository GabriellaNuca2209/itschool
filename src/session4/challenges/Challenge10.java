package session4.challenges;

public class Challenge10 {

    public static void main(String[] args) {
        int[] listOne = {1, 2, 3, 4};
        int[] listTwo = listOne;

        printArray(listOne);
        printArray(listTwo);

    }

    public static void printArray(int[] numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
