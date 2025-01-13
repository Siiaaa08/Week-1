// Create a class SumUntilZeroOrNegative to find the sum of numbers until the user enters 0 or a negative number
// importing Scanner class for taking input
import java.util.Scanner;
public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
		// Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
		//Control flow statements
        while (true){
            System.out.print("Enter a number (0 or negative to stop): ");
            double input = sc.nextDouble();

            if (input <= 0) break; 
            total += input; 
        }
        System.out.println("Total sum: " + total); 
 
    }
}


