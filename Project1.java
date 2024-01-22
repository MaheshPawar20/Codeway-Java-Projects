
import java.util.*;

public class Project1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter the minRange: ");
        int minRange = scanner.nextInt();
        System.out.println();
        System.out.print("Enter the maxRange: ");
        int maxRange = scanner.nextInt();
        System.out.println();
        int maxAttempts = 10;
        int roundsWon = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess the number between " + minRange + " and " + maxRange);

        boolean playAgain = true;

        while (playAgain) {
            int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            int attempts = 0;
            System.out.println();
            System.out.println("New round! You have " + maxAttempts + " attempts.");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();

                if (userGuess == targetNumber) {
                	System.out.println();
                    System.out.println("Congratulations! You guessed the correct number!");
                    System.out.println("Number of Attempt taken "+ attempts++);
                    roundsWon++;
                    break;
                } else if (userGuess < targetNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }

                attempts++;
                System.out.println("Attempts left: " + (maxAttempts - attempts));
            }

            if (attempts == maxAttempts) {
            	System.out.println();
                System.out.println("Sorry, you've run out of attempts. The correct number was: " + targetNumber);
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainResponse = scanner.next().toLowerCase();
            playAgain = playAgainResponse.equals("yes");

            if (playAgain) {
            	System.out.println();
                System.out.println("Let's play again!");
                
            } else {
            	System.out.println();
                System.out.println("Thanks for playing! Rounds won: " + roundsWon);
            }
        }


	}

}
