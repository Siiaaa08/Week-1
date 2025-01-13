// Create a class SumUntilZero to find the sum of numbers until the user enters 0
// importing Scanner class for taking input
import java.util.Scanner;
public class SumUntilZero {
    public static void main(String[] args) {
		// Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        //Control flow statements
        while (true) {
            System.out.print("Enter a number (0 to stop the program): ");
            double input = sc.nextDouble();

            if (input==0) break;
            total +=input; 
        }
        System.out.println("Total sum: " + total); 
    }
}