package session17_streams.challenges;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Challenge09 {

    public static void main(String[] args) {
        List<String> sentences = Arrays.asList("Hello World", "Hello Everyone", "Welcome to the World of Java");

        List<String> words = sentences.stream()
                .flatMap(str -> Arrays.stream(str.split(" ")))
                .toList();

        System.out.println(words);

        Map.Entry<String, Long> frequentWord = words.stream()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get();

        System.out.println(frequentWord);
    }
}
