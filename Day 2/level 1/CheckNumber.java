// Create a class CheckNumber  to check whether a number is positive, negative, or zero.
// importing Scanner class for taking input
import java.util.Scanner;

public class CheckNumber{

    public static void main(String args[]) {

        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int number = sc.nextInt();
		
		//Control flow statements
		if(number>0){
			System.out.println("The number is positive");
		}
		else if(number<0){
			System.out.println("The number is negative");
		}
		else{
			System.out.println("Thr number is zero");
		}
	}
}
		
		