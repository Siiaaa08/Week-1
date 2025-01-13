//Create a class Bonus  to find the bonus of employees based on their years of service.
// importing Scanner class for taking input
import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
		// Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter years of service: "); 
        int yearsOfService = sc.nextInt();
		
         //Control flow statements
        if (yearsOfService > 5) { 
            double bonus = 0.05 * salary;
            System.out.println("The bonus amount is: " + bonus); //  print the bonus 
        } else {
            System.out.println("No bonus for employees with 5 or fewer years of service."); 
        }
    }
}