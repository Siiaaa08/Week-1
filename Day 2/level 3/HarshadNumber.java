//Create a class HarshadNumber  to check if a number taken from the user is a Harshad Number.
// importing Scanner class for taking input
import java.util.Scanner;
public class HarshadNumber{
	public static void main(String []args){
        //Create a Scanner object to take user input
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an integer to check if its a Harshad number: ");
		int num=sc.nextInt();
		int sum=0;
		int org=num;
		
        //Control flow statements
		while(num!=0){
			int temp=num%10;
			sum+=temp;
			num=num/10;
		}
		if(org%sum==0){
			System.out.println("Its a Harshad Number");
		}else{
				System.out.println("Its not a Harshad Number");
			}

	}
}