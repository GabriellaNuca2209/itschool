package session6.challenges;

public class Challenge1 {

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        str.append("Hello");
        reverseString(str);
    }

    public static void reverseString(StringBuilder input) {
        System.out.println(input.reverse());
    }
}
