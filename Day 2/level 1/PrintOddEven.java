//Create a class PrintOddEven  to print odd and even numbers between 1 to the number entered by the user.
// importing Scanner class for taking input

import java.util.Scanner;

public class PrintOddEven {
    public static void main(String[] args) {
		// Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
		
	    //Control flow statements
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else { 
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) { 
                    System.out.println(i + " is an even number.");
                } else { 
                    System.out.println(i + " is an odd number.");
                }
            }
        }
    }
}