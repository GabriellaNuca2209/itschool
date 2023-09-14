package session4.challenges;

public class Challenge21 {

    public static void main(String[] args) {
        double score = 34;

        System.out.println(
                score >= 90 && score <= 100 ? "A"
                        : score >= 80 && score < 90 ? "B"
                        : score >= 70 && score < 80 ? "C"
                        : score >= 60 && score < 70 ? "D"
                        : "F"
        );
    }
}
