package session6.challenges;

public class Challenge5 {

    public static void main(String[] args) {
        String string = "This is a normal sentence";
        capitalizeFirstCharInWords(string);
    }

    public static void capitalizeFirstCharInWords(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] array = str.split(" ");

        for (String elem : array) {
            stringBuilder.append(String.valueOf(elem.charAt(0)).toUpperCase()).append(elem.substring(1)).append(" ");
        }
        System.out.println(stringBuilder);
    }
}
