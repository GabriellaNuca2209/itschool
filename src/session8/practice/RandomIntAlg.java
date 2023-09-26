package session8.practice;

import java.util.Random;

public class RandomIntAlg {

    public static void main(String[] args) {
        printRandomNumber();
    }

    public static void printRandomNumber() {
        Random random = new Random();
        int randomNumber = random.nextInt(1, 16);
        System.out.println(randomNumber);
    }
}
