package session6.challenges;

public class Challenge7 {

    public static void main(String[] args) {
        String string = "balloon";
        removeDuplicateLetters(string);
    }

    public static void removeDuplicateLetters(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int index = 0; index < str.length(); index++) {
            if (stringBuilder.indexOf(String.valueOf(str.charAt(index))) == -1) {
                stringBuilder.append(str.charAt(index));
            }
        }
        System.out.println(stringBuilder);
    }
}
