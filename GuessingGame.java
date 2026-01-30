import java.util.*;

public class GuessingGame {
    public static final int MIN_DIFF_MAX = 25;
    public static final int MED_DIFF_MAX = 100;
    public static final int HARD_DIFF_MAX = 500;
    public static final int EXTREME_DIFF_MAX = 1000;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        printGameIntro();
    }

    public static void printGameIntro() {
        System.out.println("JAVA GUESSING GAME");
        System.out.println("Welcome, contestant!");
        System.out.println("You are about to participate in a Guessing Game designed with the Java programming language.");
        System.out.println("The rules are simple:");
        System.out.println("1. Choose a difficulty.");
        System.out.println("2. Enter your guess when prompted.");
        System.out.println("3. A) If incorrect, carefully analyze feedback provided by the game system to guess again.");
        System.out.println("3. B) If correct, continue to next guess.");
        System.out.println("Note: If any anytime you'd like to end your session, enter q for QUIT anywhere in the game and the game system will provide you a final score and exit the program.");
    }

    public static int getDifficulty(Scanner console) {
        System.out.println("SELECT DIFFICULTY:");
        System.out.println("\t1. Easy (1-50)");
        System.out.println("\t2. Medium (1-100)");
        System.out.println("\t3. Hard (1-500)");
        System.out.println("\t4. Extreme (1-1000)");
        System.out.print("Your choice: ");

        int diff = console.nextInt();
        switch (diff) {
            case 1:
                return MIN_DIFF_MAX;
                break;
            case 2:
                return MED_DIFF_MAX;
                break;
            case 3:
                return HARD_DIFF_MAX;
                break;
            case 4:
                return EXTREME_DIFF_MAX;
                break;
            default:
                return MIN_DIFF_MAX;
                break;
        }
    }

    public static int generateRandomNumber(int max) {
        Random random = new Random();
        return random.nextInt(max) + 1;
    }

    public static int getGuess(Scanner console, int maxRange) {
        System.out.println("Enter your guess (1 - " + maxRange + "): ");
        return console.nextInt();
    }
}