package session4.practice;

public class LoopPractice {

    public static void main(String[] args) {
//        for (int index = 0; index < 10; index++) {
//            System.out.println(index);
//        }

        int[] myArr = {1, 5, 7, 10, 24};
//        printArray(myArr);

        printEvenNumbers(100);
    }

    public static void printArray(int[] numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static void printEvenNumbers(int limitValue) {
        for (int index = 0; index <= limitValue; index++) {
            if (index % 2 == 0) {
                System.out.println(index);
            }
        }
    }
}
