package session04.challenges;

import java.util.Arrays;

public class Challenge18 {

    public static void main(String[] args) {
        Integer[] myArr = {5, 6, 7, 8, 9};
        incrementArrByIndex(myArr);
        System.out.println("-------");
        decrementArrByOne(myArr);
    }

    public static void incrementArrByIndex(Integer[] arr) {
        for (int number : arr) {
            System.out.println(Arrays.asList(arr).indexOf(number) + 1);
        }
    }

    public static void decrementArrByOne(Integer[] arr) {
        for (int number : arr) {
            System.out.println(--number);
        }
    }
}
