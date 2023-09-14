package session4.challenges;

public class Challenge7 {

    public static void main(String[] args) {
        int sideOne = 20;
        int sideTwo = 25;
        int sideThree = 30;

        // sideOne == sideTwo && sideOne == sideThree ? "Equilateral"
        // sideOne == sideTwo || sideOne == sideThree || sideTwo == sideThree ? "Isosceles"

        System.out.println(sideOne == sideTwo && sideOne == sideThree ? "Equilateral"
                : sideOne == sideTwo || sideOne == sideThree || sideTwo == sideThree ? "Isosceles" : "Scalene");
    }
}
