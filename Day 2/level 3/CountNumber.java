//Create a class CountNumber  to count the number of digits in an integer.
// importing Scanner class for taking input
import java.util.Scanner;
public class CountNumber{
	public static void main(String []args){
	//Create a Scanner object to take user input
	Scanner sc=new Scanner(System.in);
    int count=0;
    System.out.println("Enter a integer to count number of digits it have: ");
    int num=sc.nextInt(); 
	int org=num; 
	
	 //Control flow statements
	while(num!=0){
		count++;
		num=num/10;
	}
	System.out.println("Digits in "+org+" are "+ count);
	}
}