package session05.challenges;

import java.util.Scanner;

public class Challenge4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any word you want to see reversed!");
        String string = scanner.next();
        reverseString(string);
        scanner.close();
    }

    public static void reverseString(String str) {
        char[] arr = str.toCharArray();

        for (int index = arr.length - 1; index >= 0; index--) {
            System.out.print(arr[index]);
        }
    }
}
