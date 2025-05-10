import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        int secretNumber = 7;
        Scanner scanner = new Scanner(System.in);
        int guess = 0;

        System.out.println("Guess the secret number between 1 and 10:");

        while (guess != secretNumber) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess < secretNumber) {
                System.out.println("Too low. Try again.");
            } else if (guess > secretNumber) {
                System.out.println("Too high. Try again.");
            } else {
                System.out.println("Congratulations! You guessed it.");
            }
        }

        scanner.close();
    }
}
