package session16_lambda_expressions.practice.conditional_printer;

public class TestConditionalPrinter {

    public static void main(String[] args) {
        ConditionalPrinter conditionalPrinter = (str, condition) -> showCondition(str, condition);

        conditionalPrinter.print("Hello World", true);
        conditionalPrinter.print("Hello World", false);
    }

    public static void showCondition(String str, boolean condition) {
        if (condition) {
            System.out.println(str);
        }
    }
}
