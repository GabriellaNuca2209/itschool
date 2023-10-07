package session05.challenges;

public class Challenge8 {

    public static void main(String[] args) {
        fibonacci();
    }

    public static void fibonacci() {
        int num1 = 0;
        int num2 = 1;

        for (int counter = 0; counter <= 10; counter++) {
            System.out.print(num1 + " ");
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
    }
}
