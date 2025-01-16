//Create a class GreatestFactor to print the greatest factor of a number beside itself using a loop
// importing Scanner class for taking input

import java.util.Scanner;
public class GreatestFactor {
    public static void main(String[] args) {
		//Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number to find its greatest factor (beside itself): ");
        int number = scanner.nextInt();
		int greatestFactor = 1;

            //Control flow statements
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) { 
                greatestFactor = i; 
              break; 
        }
	}
        System.out.println("The greatest factor of " + number + " (beside itself) is: " + greatestFactor);
    }
}