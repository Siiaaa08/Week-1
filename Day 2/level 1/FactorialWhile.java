//Create a class FactorialWhile  to find the factorial of an integer entered by the user.
// importing Scanner class for taking input
import java.util.Scanner;
public class FactorialWhile {
    public static void main(String[] args) {
		// Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
		
		//Control flow statements
        if (number <0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int factorial = 1; 
            int i = 1;

            while (i <= number) {
                factorial *= i; 
                i++; 
            }

            System.out.println("The factorial of " + number + " is " + factorial);
        }
    }
}