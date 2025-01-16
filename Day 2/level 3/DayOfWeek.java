//Create a class DayOfWeek 
// importing Scanner class for taking input
import java.util.Scanner;
public class DayOfWeek{
	public static void main(String []args){
		System.out.println("Program to print the Day of the week !");
		//Create a Scanner object to take user input
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year: ");
		int y=sc.nextInt();
		System.out.println("Enter the month (1-12)");
		int m=sc.nextInt();
		System.out.println("Enter the date: ");
		int date=sc.nextInt();
		int day;
		y=y-((14-m)/12);
		int x=y+(y/4)-(y/100)+(y/400);
		m=m+12*((14-m)/12)-2;
		day=(date+x+31*m/12)%7;

        //Control flow statements
		switch(day){
			case 0: System.out.println("Its Sunday!" );
			break;

			case 1: System.out.println("Its Monday!" );break;

			case 2: System.out.println("Its Tuesday!" );break;
				
			case 3: System.out.println("Its Wednesday!" );break;


			case 4: System.out.println("Its Thursday!" );break;

			case 5: System.out.println("Its Friday!" );break;
				
			case 6: System.out.println("Its Saturday!" );break;

		}
	}}