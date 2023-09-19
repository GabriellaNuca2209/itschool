package session6.practice;

public class StringVsStringBuilder {

    public static void main(String[] args) {
        //using String
        String str = "";
        for (int index = 0; index < 10; index++) {
            str += "word" + index + " ";
        }
        System.out.println("Final str using String: " + str);

        //using StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        for (int index = 0; index < 10; index++) {
            stringBuilder.append("word")
                    .append(index)
                    .append(" ");
        }
        System.out.println("Final stringBuilder using StringBuilder: " + stringBuilder);

        String name = "John"; // immutable
        String nameUpdated = name.replace('o', 'a');
        System.out.println(nameUpdated);
    }
}
