package session04.challenges;

public class Challenge19 {

    public static void main(String[] args) {
        int age = 77;

        System.out.println(
                age < 12 ? "Child"
                        : age >= 12 && age <= 17 ? "Teen"
                        : age >= 18 && age <= 64 ? "Adult"
                        : "Senior"
        );
    }
}
