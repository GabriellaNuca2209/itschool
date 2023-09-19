package session6.challenges;

public class Challenge3 {

    public static void main(String[] args) {
        String[] strings = {"This", "Is", "A", "List", "Of", "Strings"};
        concatenateListOfStrings(strings);
    }

    public static void concatenateListOfStrings(String[] str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String string : str) {
            stringBuilder.append(string);
        }
        System.out.println(stringBuilder);
    }
}
