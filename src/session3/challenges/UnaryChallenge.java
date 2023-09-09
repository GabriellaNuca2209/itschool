package session3.challenges;

public class UnaryChallenge {

    public static void main(String[] args) {
        int number = 25;
        int incremented = ++number;
        System.out.println(incremented);
        int decremented = --number;
        System.out.println(decremented);

        int reversed =  reverseSign(25);
        System.out.println(reversed);
    }

    public static int reverseSign(int n) {
        return -n;
    }
}
