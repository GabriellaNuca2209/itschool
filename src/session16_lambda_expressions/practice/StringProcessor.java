package session16_lambda_expressions.practice;

@FunctionalInterface
public interface StringProcessor {

    String process(String string);

    default StringProcessor andThen(StringProcessor after) {
        return input -> after.process(this.process(input));
    }
}
