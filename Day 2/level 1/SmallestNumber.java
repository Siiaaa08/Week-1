// Create a class SmallestNumber to check if first number is the smallest
// importing Scanner class for taking input
import java.util.Scanner;

public class SmallestNumber {

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
		if(number1<number2 && number1<number3){
			System.out.println("the first number is the smallest");
		}
		else {
			System.out.println("The first number is not the smallest");
		}
	}
}
			