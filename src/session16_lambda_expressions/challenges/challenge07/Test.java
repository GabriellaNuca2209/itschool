package session16_lambda_expressions.challenges.challenge07;

public class Test {

    public static void main(String[] args) {
        CharacterBringer newString = (str, n) -> getString(str, n);
        System.out.println(newString.getNCharOfString("Halloween", 6));
    }

    public static StringBuilder getString(String str, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int index = 0; index < n; index++) {
            if (str.length() < n) {
                return stringBuilder.append(str);
            }
            stringBuilder.append(str.charAt(index));
        }
        return stringBuilder;
    }
}
