package session6.challenges;

public class Challenge6 {

    public static void main(String[] args) {
        String string = "The cat sat on a mat. Another cat went for a walk";
        replaceCatWord(string);
    }

    public static void replaceCatWord(String str) {
        String newString = str.replace("cat", "dog");
        System.out.println(newString);
    }
}
