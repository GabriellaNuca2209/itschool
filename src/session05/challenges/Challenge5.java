package session05.challenges;

public class Challenge5 {

    public static void main(String[] args) {
        fibonacci(15);
    }

    public static void fibonacci(int number) {
        int num1 = 0;
        int num2 = 1;
        int counter = 0;

        while (counter < number) {
            System.out.print(num1 + " ");

            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter++;
        }
    }
}
