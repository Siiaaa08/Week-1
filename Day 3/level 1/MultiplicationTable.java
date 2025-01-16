//importing the Scanner class for taking the input form the user 
import java.util.*;
// Creating MultiplicationTable class to print a multiplication table of a number.
public class MultiplicationTable{
	public static void main(String [] args){
		
		// creating the input object for using scanner class 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		
		// initializing the number array of numbers 10
		int numberArray [] = new int[10];
		for(int i=0;i<numberArray.length;i++){
			numberArray[i] = number*(i+1);
			System.out.println(number + "*" +(i+1)+ "=" +numberArray[i]);
		}
	}
}