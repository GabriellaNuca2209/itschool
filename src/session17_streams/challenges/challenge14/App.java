package session17_streams.challenges.challenge14;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {
        Product bread = new Product("Bread", Category.BAKERY, 10.99);
        Product baguette = new Product("Baguette", Category.BAKERY, 12.99);
        Product croissant = new Product("Croissant", Category.BAKERY, 6.99);

        Product beef = new Product("Beef", Category.MEAT, 30.50);
        Product porkChop = new Product("Pork Chop", Category.MEAT, 27.99);
        Product chickenBreast = new Product("Chicken Breast", Category.MEAT, 14.99);

        Product soup = new Product("Soup", Category.READY_TO_EAT, 19.99);
        Product sarmale = new Product("Sarmale", Category.READY_TO_EAT, 23.99);

        // List of all products
        List<Product> productList = new ArrayList<>(List.of(bread, baguette, croissant, beef, porkChop, chickenBreast, soup, sarmale));

        // tested the math theory of calculating average based on the logic behind the reduce method
        Map<Category, Double> test = productList.stream()
                .collect(Collectors.toMap(Product::getCategory, Product::getPrice, (acc, val) -> (acc + val) / 2));

        System.out.println(test);

        // here we put the theory (which proved legit) in action
        Map.Entry<Category, Double> categoryWithHighestAverage = productList.stream()
                .collect(Collectors.toMap(Product::getCategory, Product::getPrice, (acc, val) -> (acc + val) / 2))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get();

        // seeing the category and the biggest average
        System.out.println(categoryWithHighestAverage);

    }
}
