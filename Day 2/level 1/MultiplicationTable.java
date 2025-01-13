//Create a class MultiplicationTable  to find the multiplication table of a number entered by the user from 6 to 9.
// importing Scanner class for taking input
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
		// Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
		
        //Control flow statements
        for (int i = 6;i<=9; i++) {
            System.out.println(number +" * " + i+ " =" + (number * i));
        }
    }
}