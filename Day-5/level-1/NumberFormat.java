import java.util.*;
public class NumberFormat{
	public static int numForException(String s){
		String text = s;
		int k=0;
		try{
			k=Integer.parseInt(s);
			System.out.println("The integer value is " +k);
		}
		catch(NumberFormatException e){
			System.out.println("Found an error " +e.getMessage());
		}
		return k;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the text");
		String word = sc.nextLine();
		numForException(word);
	}
}
