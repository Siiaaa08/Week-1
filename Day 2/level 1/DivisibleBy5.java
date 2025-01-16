// Create a class DivisibleBy5 to check if a number is divisible by 5
// importing Scanner class for taking input
import java.util.Scanner;

public class DivisibleBy5 {

    public static void main(String args[]) {

        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		double number = sc.nextDouble();
		//Control flow statements
		if(number%5==0){
		    System.out.println("The number " +number+ " is divisible by 5");
		}
		else{
			System.out.println("The number " +number+ " is not divisible by 5");
		}
	}
}
			
		

