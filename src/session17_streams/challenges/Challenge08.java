package session17_streams.challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Challenge08 {

    public static void main(String[] args) {
        String sentence = "Hello World";
        List<String> vowels = new ArrayList<>(List.of("A", "a", "E", "e", "I", "i", "O", "o", "U", "u"));

        int numOfVowels = (int) Arrays.stream(sentence.split(""))
                .filter(vowels::contains)
                .count();

        System.out.println(numOfVowels);
    }
}
