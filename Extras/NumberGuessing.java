//importing util package
import java.util.Scanner;
//Creating the class NumberGuessing
public class NumberGuessing{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Think of a number between 1 and 100, and I will try to guess it.");
        playGame(input);
    }

    // Method to play the number guessing game
    public static void playGame(Scanner input) {
        int lowerBound = 1;
        int upperBound = 100;
        int guess = 0;
        String feedback = "";
		while (!feedback.equals("correct")) {
            guess = generateGuess(lowerBound, upperBound); 
            System.out.println("My guess is: " + guess);
            feedback = getFeedback(input);
            if (feedback.equals("high")) {
                upperBound = guess - 1; 
            } else if (feedback.equals("low")) {
                lowerBound = guess + 1; 
            } else if (!feedback.equals("correct")) {
                System.out.println("Invalid input! Please enter 'high', 'low', or 'correct'.");
            }
        }
        System.out.println("Yay! I guessed your number correctly.");
    }

    // Method to generate a random guess within the current range
    public static int generateGuess(int lowerBound, int upperBound) {
        Random rand = new Random();
        return rand.nextInt(upperBound - lowerBound + 1) + lowerBound;
    }

    // Method to get feedback from the user
    public static String getFeedback(Scanner input) {
        System.out.print("Is my guess high, low, or correct? ");
        String feedback = input.nextLine().trim().toLowerCase(); 
        return feedback;
    }
}