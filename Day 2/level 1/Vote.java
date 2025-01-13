// Create a class Vote to check whether a person can vote, depending on whether his/her age is greater than or equal to 18.
// importing Scanner class for taking input
import java.util.Scanner;

public class Vote{

    public static void main(String args[]) {

        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		int age = sc.nextInt();
		//Control flow statements
		if(age>=18){
			System.out.println("The person's age is " +age+ " and can vote");
		}
		else{
			System.out.println("The person's age is " +age+ " and cannot vote");
		}
	}
}