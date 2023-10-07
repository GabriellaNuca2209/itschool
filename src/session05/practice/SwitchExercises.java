package session05.practice;

public class SwitchExercises {

    public static void main(String[] args) {
        printGradeInfo('B');
        printGradeInfoEnhancedSwitch('D');
        printSeasonInfo("Winter");
    }

    private static void printGradeInfo(char grade) {
        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            default:
                System.out.println("Try harder, dude...");
        }
    }

    private static void printGradeInfoEnhancedSwitch(char grade) {
        switch (grade) {
            case 'A' -> System.out.println("Excellent");
            case 'B' -> System.out.println("Good");
            case 'C' -> System.out.println("Average");
            default -> System.out.println("Try harder, dude...");
        }
    }

    private static void printSeasonInfo(String season) {
        switch (season) {
            case "Winter" -> System.out.println("It's cold");
            case "Spring" -> System.out.println("Flowers bloom");
            case "Summer" -> System.out.println("It's hot");
            default -> System.out.println("Unknown season");
        }
    }
}
