package session17_streams.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsPractice {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<String> strings = Arrays.asList("apple", "banana", "peach", "watermelon");
        List<List<Integer>> listOfLists = Arrays.asList(Arrays.asList(1, 2, 3, 4, 5), Arrays.asList(2, 3, 4, 5, 6), Arrays.asList(3, 4, 5, 6, 7));

        List<Product> products = Arrays.asList(new Product("Phone", 999.9999),
                new Product("Laptop", 2499.9999),
                new Product("Gadget", 450.99));

//        printEvenNumbers(numbers);
//        printEvenNumbersWithStream(numbers);
//        printStringsByLengthBiggerThan(strings, 5);
//        printStringLength(strings);
//        printProductPrices(products);
//        printProductIncreasedPrices(products);
//        printFlatMap(listOfLists);
//        printSumOfNumbers(numbers);
//        printSortedProductByPrice(products);
//        printProcessedNumbers(numbers);
        isMatch(strings);
    }

    private static void isMatch(List<String> strings) {
        boolean anyMatch = strings.stream()
                .filter(fruit -> fruit.length() > 5)
                .anyMatch(fruit -> fruit.startsWith("a"));
        System.out.println("Is there any fruit with length greater than 5 that starts with 'a'? " + anyMatch);
    }

    private static void printProcessedNumbers(List<Integer> integerList) {
        integerList.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .filter(n -> n > 20)
                .forEach(System.out::println);
    }

    private static void printSortedProductByPrice(List<Product> productList) {
        List<Product> sortedProducts = productList.stream()
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .toList();
        sortedProducts.forEach(product -> System.out.println(product.getName() + " " + product.getPrice()));
    }

    private static void printSumOfNumbers(List<Integer> numbers) {
        int sum = numbers.stream()
                    .reduce(0, Integer::sum);
        System.out.println("Sum of numebrs: " + sum);
    }

    private static void printFlatMap(List<List<Integer>> listOfLists) {
        List<Integer> flattenedList = listOfLists.stream()
                .flatMap(List::stream)
                .toList();
        System.out.println("Flattened list: " + flattenedList);
    }

    private static void printProductIncreasedPrices(List<Product> productList) {
        List<String> formattedPrices = productList.stream()
                .map(product -> product.getPrice() * 1.10)
                .map(newPrice -> "$" + String.format("%.2f", newPrice))
                .toList();
        System.out.println("Increased prices: " + formattedPrices);
    }

    private static void printProductPrices(List<Product> productList) {
        productList.stream()
                .map(Product::getPrice)
                .forEach(System.out::println);
    }

    private static void printStringLength(List<String> stringList) {
        List<Integer> resultList = stringList.stream()
                .map(String::length)
                .toList();
        System.out.println("The length of the strings: " + resultList);
    }

    private static void printStringsByLengthBiggerThan(List<String> inputList, int minLength) {
        List<String> filteredStrings = new ArrayList<>();
        for (String element : inputList) {
            if (element.length() > minLength) filteredStrings.add(element);
        }
        System.out.println("Traditional approach: " + filteredStrings);

        List<String> filteredStringsStream = inputList.stream()
                .filter(el -> el.length() > minLength)
                .toList();
        System.out.println("Stream approach: " + filteredStringsStream);
    }

    private static void printEvenNumbersWithStream(List<Integer> numbers) {
        // stream approach
        List<Integer> evenNumbersStream = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        System.out.println("Stream approach: " + evenNumbersStream);
    }

    private static void printEvenNumbers(List<Integer> numbers) {
        // traditional approach
        List<Integer> evenNumbers = new ArrayList<>();
        for (int number : numbers) {
            if (number % 2 == 0) evenNumbers.add(number);
        }
        System.out.println("Traditional approach: " + evenNumbers);
    }
}
