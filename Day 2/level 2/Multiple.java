
import java.util.Scanner;
//Create a class GreatestFactor to print the greatest factor of a number beside itself using a loop
// importing Scanner class for taking input
public class Multiple{
    public static void main(String[] args) {
	 //Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find its multiples below 100: ");
        int number = scanner.nextInt();
		System.out.println("Multiples of " + number + " below 100 are:");
	    int num=number;
		int count=1;
		int mult=num*1;
		
		 //Control flow statements
		while(mult<101){
			
			System.out.println(mult);
			mult=num*count;
		count++;}
			
    }
}