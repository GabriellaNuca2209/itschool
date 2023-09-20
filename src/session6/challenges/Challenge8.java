package session6.challenges;

public class Challenge8 {

    public static void main(String[] args) {
        String string = "dear";
        insertString(string, 3);
    }

    public static void insertString(String str, int index) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hi, John");
        stringBuilder.insert(index, str);
        System.out.println(stringBuilder);
    }
}
