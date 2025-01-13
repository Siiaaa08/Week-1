// Create a class NaturalNumber to check if a number is natural number or not
// importing Scanner class for taking input
import java.util.Scanner;

public class NaturalNumber{

    public static void main(String args[]) {

        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		double number = sc.nextDouble();
		//Control flow statements
		if(number>0){
		   System.out.println("The number is the natural number");
		}
		else {
			System.out.println("The number is not a natural number");
		}
		double sum =  (number * (number+1)) / 2;
		System.out.println(sum);
	}
}