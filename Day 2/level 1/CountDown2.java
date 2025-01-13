// Create a class CountDown to to count down the number from the user input value
// importing Scanner class for taking input
import java.util.Scanner;

public class CountDown2{

    public static void main(String args[]) {

        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int number = sc.nextInt();
		
		//Control flow statements
		System.out.println("The count down ");
		for(int i=number;i>0;i--){
			System.out.println(number);
		}
	}
}