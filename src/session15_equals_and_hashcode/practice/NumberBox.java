package session15_equals_and_hashcode.practice;

public class NumberBox<T extends Number> {

    private T number;

    public void setNumber(T number) {
        this.number = number;
    }

    public double doubleNumber() {
        return number.doubleValue();
    }

    public static void main(String[] args) {
        NumberBox<Integer> integerBox = new NumberBox<>();
        integerBox.setNumber(15);

        System.out.println(integerBox.doubleNumber());
    }
}
