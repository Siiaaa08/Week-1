//Create a class LeapYearOperators  to determine Leap Year with single if condition using logical and && and or || operators
// importing Scanner class for taking input
import java.util.Scanner;

public class LeapYearOperators{
	public static void main(String []args){
		System.out.println("Enter a year to check for Leap Year: "); // prompting user to enter year to check if its a leap year or not 
		//Create a Scanner object to take user input							
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();

		//Control flow statements
		if(year>=1582){
			if((year%400==0)||((year%4==0) && (year%100!=0))){
				System.out.println(year+ " Year is a leap year");
			}
		}
		else {
			System.out.println(year+ " year it is not a leap year");
		}
	}
}