package session5.challenges;

public class Challenge3 {

    public static void main(String[] args) {
        int[] myArray = {1, 2, 5, -7, 14, -12, 67, -2};
        countNegativeNumbers(myArray);
    }

    public static void countNegativeNumbers(int[] array) {
        int sum = 0;
        for (int number : array) {
            if (number < 0) {
                sum += number;
            }
        }
        System.out.println(sum);
    }
}
