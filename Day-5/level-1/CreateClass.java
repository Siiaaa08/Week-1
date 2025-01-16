import java.util.*;
public class CreateClass{
	public static String createUsingCharAt(String s, int start, int end){
		String result = "";
		for(int i=start;i<end;i++){
			result = result+s.charAt(i);
		}
		return result;
	}
	
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word");
		String word = sc.next();
		System.out.println("Enter the first index");
		int firstIndex = sc.nextInt();
		System.out.println("Enter the second index");
		int lastIndex = sc.nextInt();
		
		if(createUsingCharAt(word,firstIndex,lastIndex).equals(word.substring(firstIndex,lastIndex))){
			System.out.println("The strings are equal");
		}
		else
			System.out.println("The strings are not equal");
	}
}