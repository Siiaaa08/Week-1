//Create a class GreatestFactor to print the greatest factor of a number beside itself using a loop
// importing Scanner class for taking input

import java.util.Scanner;
public class PowerNumber {
    public static void main(String[] args) {
		
        //Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        int baseNumber = scanner.nextInt();
        System.out.print("Enter the power: ");
        int power = scanner.nextInt();
        int result = 1;

         //Control flow statements
        for (int i = 1; i <= power; i++) {
            result *= baseNumber; 
        }
        System.out.println(baseNumber + " raised to the power " + power + " is: " + result);
    }
}