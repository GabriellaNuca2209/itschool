package session17_streams.challenges;

import java.util.Arrays;
import java.util.List;

public class Challenge10 {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Java Streams", "Method References", "Lambda Expressions");

        int num = strings.stream()
                .flatMap(str -> Arrays.stream(str.split(" ")))
                .map(String::length)
                .reduce(0, Integer::sum);

        System.out.println(num);
    }
}
