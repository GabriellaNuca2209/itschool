package session18_recap.challenge05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {

    public static void main(String[] args) {
        String sentence = "Java is fun";

        List<String> stringList = new ArrayList<>(List.of(sentence.split(" ")));
        Collections.reverse(stringList);
        System.out.println(stringList);
    }
}
