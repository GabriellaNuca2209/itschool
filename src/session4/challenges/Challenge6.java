package session4.challenges;

public class Challenge6 {

    public static void main(String[] args) {
        int temp = 19;

        if (temp >= 30) {
            System.out.println("Hot");
        } else if (temp >= 20 && temp < 30) {
            System.out.println("Warm");
        } else {
            System.out.println("Cold");
        }
    }
}
