// Create a class SpringSeason to check whether it's a spring season or not
// importing Scanner class for taking input
import java.util.Scanner;

public class SpringSeason{

    public static void main(String args[]) {

        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter month");
		int month = sc.nextInt();
		System.out.println("Enter day");
		int day = sc.nextInt();
		
		//Control flow statements
		if((month>=3 && month<=6) && day>=20){
			System.out.println("It's a spring season");
		}
		else{
			System.out.println("It's not a spring season");
		}
	}
}