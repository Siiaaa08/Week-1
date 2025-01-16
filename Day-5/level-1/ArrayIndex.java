import java.util.*;
public class ArrayIndex{
	public static void outOfBound(String[] s){
		for(int i=0;i<(s.length+4);i++){
			try{
				System.out.println("The name of " +i+ " person is" +s[i]);
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Found an error" + e.getMessage());
			}
		}
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word");
		int n = sc.nextInt();
		
		String [] names = new String[n];
		for(int i=0;i<n;i++){
			System.out.println("Enter name " +(i+1));
			names[i] = sc.nextLine();
		}
		outOfBound(names);
	}
}