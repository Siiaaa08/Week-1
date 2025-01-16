//Create a class GreatestFactor to print the greatest factor of a number beside itself using a loop
// importing Scanner class for taking input
import java.util.Scanner;
public class GreatestFactor {
    public static void main(String[] args) {
		//Create a Scanner object to take user input
		 Scanner scanner = new Scanner(System.in);
         System.out.print("Enter a number to find its factors: ");
        int number = scanner.nextInt();
		System.out.println("Factors of " + number + " are:");

        //Control flow statements
        for (int i = 1; i <= ((number/2)+1); i++) {
            if (number % i == 0) { // Checking the factor
                System.out.print(i + " ");             }
        }
    }
}