import java.util.*;
public class IllegalArgument{
	public static void illException(String s){
		String text = s;
		 try{
			 System.out.println("The substring is " +s.substring(8,3));
		 }
		 catch(IllegalArgumentException e){
			 System.out.println("Found an error: " + e.getMessage());
		 }
	}
	
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word");
		String word = sc.nextLine();
		illException(word);
	}
}