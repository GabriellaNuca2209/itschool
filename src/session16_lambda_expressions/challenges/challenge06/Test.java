package session16_lambda_expressions.challenges.challenge06;

public class Test {

    public static void main(String[] args) {
        StringComparator stringComparator = (str1, str2) -> str1.length() > str2.length() ? str1.length() : str2.length();
        System.out.println(stringComparator.compareString("Elephant", "Tiger"));
    }
}
