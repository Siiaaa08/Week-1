//Create a class AbundantNumber  to check if a number taken from the user is a Abundant Number.
// importing Scanner class for taking input
import java.util.Scanner;
public class AbundantNumber{
	public static void main(String []check){
		//Create a Scanner object to take user input
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check if its a Abundant number: ");
		int number=sc.nextInt();
		int sum=0;
		
		//Control flow statements
		for(int i=1;i<=number/2;i++){
			if(number%i==0){
				sum+=i;
			}
		}
		if(sum>number){System.out.println("Its a abundant number ");}
		else{
			System.out.println("Its not a Abundant Number");
		}
	}
}