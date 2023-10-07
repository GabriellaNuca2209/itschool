package session06.challenges;

public class Challenge2 {

    public static void main(String[] args) {
        String str = "hello";
        String str2 = "radar";
        checkPalindrome(str);
        checkPalindrome(str2);
    }

    public static void checkPalindrome(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        String reversed = stringBuilder.reverse().toString();

        if (str.equals(reversed)) {
            System.out.println("This is a palindrome word.");
        } else {
            System.out.println("This isn't a palindrome word.");
        }
    }
}
