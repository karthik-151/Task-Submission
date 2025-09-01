import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("==================================================");
        System.out.println("🎮 Welcome to the Number Guessing Game 🎮");
        System.out.println("==================================================");
        System.out.println("Rules:");
        System.out.println("1. I have chosen a number between 1 and 20.");
        System.out.println("2. Try to guess the number in as few attempts as possible.");
        System.out.println("3. I will give you hints after each guess.\n");

        int secretNumber = random.nextInt(20) + 1; // random number 1–20
        int attempts = 0;
        boolean guessed = false;

        while (!guessed) {
            System.out.print("👉 Enter your guess (1–20): ");

            if (!scanner.hasNextInt()) {
                System.out.println("⚠️  Please enter a valid number!");
                scanner.next(); // discard invalid input
                continue;
            }

            int guess = scanner.nextInt();
            attempts++;

            // Game logic
            if (guess == secretNumber) {
                System.out.println("\n🎉 BOOM! You got it! The number was " + secretNumber + ".");
                System.out.println("👏 You guessed it in " + attempts + " attempts.\n");
                guessed = true;
            } else if (guess < secretNumber) {
                System.out.println("📉 Too low! Try again.\n");
            } else {
                System.out.println("📈 Too high! Try again.\n");
            }
        }

        System.out.println("==================================================");
        System.out.println("🎊 GAME OVER - Thanks for playing! 🎊");
        System.out.println("==================================================");

        scanner.close();
    }
}
