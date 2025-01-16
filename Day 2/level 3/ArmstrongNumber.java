//Create a class ArmstrongNumber  to check if a number is Armstrong or not
// importing Scanner class for taking input
import java.util.Scanner;
public class ArmstrongNumber{
	public static void main(String []args){
		 //Create a Scanner object to take user input
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check for Armstrong number: ");
		int number=sc.nextInt();
        int sum =0;
        int originalNumber=number;

        //Control flow statements
		while(originalNumber!=0){
			int temp=originalNumber;
			int temp2=temp%10;
			sum+=Math.pow(temp2,3);
			originalNumber=temp/10;
		}
		if(sum==number){System.out.println("The number is armstrong number");
		}
		else {
			System.out.println("The number is not a armstrong number");
		}
	}
}