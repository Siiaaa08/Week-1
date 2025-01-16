//importing util package to take input from the user
import java.util.*;
// creating class Findstring
public class FindString{
	//defining a method findReturn to find the length of a string
	public static int findReturn(String s){
		int count = 0;
		int i=0;
		//implementing infimite loop
		while(i>=0){
			try{
				s.charAt(i);
				count++;
				i++;
			}
			catch(RuntimeException e){
				break;
			}
		}
		return count;
	}
				
// defining main method				
	public static void main(String[]args){
		//creating scanner class to take input from the user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word");
		String word = sc.next();
		//printing the result
		System.out.println("The length of the string is " +findReturn(word));
	}
}
		