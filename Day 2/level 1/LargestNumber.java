// Create a class largest number to check which number is the largest
// importing Scanner class for taking input
import java.util.Scanner;

public class LargestNumber {

    public static void main(String args[]) {

        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter number1");
		double number1 = sc.nextDouble();
		System.out.println("Enter number2");
		double number2 = sc.nextDouble();
		System.out.println("Enter number3");
		double number3 = sc.nextDouble();
		//Control flow statements
		if(number1>number2 && number1>number3){
			System.out.println("The first number is the largest");
		}
		else if(number2>number1 && number2>number3){
			System.out.println("The second number is the largest");
		}
		else{
			System.out.println("The third number is the largest");
		}
	}
}