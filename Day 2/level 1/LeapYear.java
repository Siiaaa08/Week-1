//Create a class LeapYear  takes a year as input and outputs the Year is a Leap Year or not a Leap Year. 
// importing Scanner class for taking input
import java.util.Scanner;

public class LeapYear{
	public static void main(String []args){
		System.out.println("Enter a year to check for Leap Year: "); // prompting user to enter year to check if its a leap year or not 
		//	Create a Scanner object to take user input	
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