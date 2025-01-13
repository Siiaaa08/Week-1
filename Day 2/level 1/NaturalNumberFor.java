//Create a class NaturalNumberFor to find the sum of n natural numbers using for loop
// importing Scanner class for taking input
import java.util.Scanner;
public class NaturalNumberFor {
    public static void main(String[] args) {
		// Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
		
		//Control flow statements
        if (n > 0) {
            int sumFormula = n * (n + 1) / 2; 
            int sumLoop = 0;
	for (int i = 1; i <= n; i++) { 
                sumLoop +=i;
            }

            System.out.println("Sum using formula: " + sumFormula);
            System.out.println("Sum using loop: " + sumLoop);
        } else
       	{
            System.out.println("Not a natural number");
        }	
    }
}