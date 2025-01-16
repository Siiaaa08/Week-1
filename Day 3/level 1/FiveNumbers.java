//importing the Scanner class for taking the input form the user 
import java.util.*;
// Creating FiveNumbers class 
public class FiveNumbers{
	public static void main(String [] args){
		
		// creating the input object for using scanner class 
		Scanner sc = new Scanner(System.in);
		
		// initializing the numberay of numbers 5
		int number [] = new int[5];
		
		//Take user input for the numbers
		for(int i=0;i<number.length;i++){
			System.out.println("Enter the number");
			number[i] = sc.nextInt();
		}
		for(int i=0;i<number.length;i++){
			if(number[i]>0){
				if(number[i]%2==0){
					System.out.println("The number " +number[i]+ " is positive even ");
				}
				else{
					System.out.println("The number " +number[i]+ " is positive odd");
				}
			}
			else if(number[i]<0){
				System.out.println("The number " +number[i]+ " is negative");
			}
			else{
				System.out.println("The number " +number[i]+ " is zero");
			}
	    }
	    if(number[0]>number[4]){
			System.out.println("The first element is greater than the last element");
		}
		else if(number[0]==number[4]){
			System.out.println("The first and the last element is equal");
		}
		else{
			System.out.println("The first element is smaller than the last element");
		}
	}
}