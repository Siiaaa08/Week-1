import java.util.*;
public class StringIndex{
	public static void generate(String s){
	String text = s;
	for(int i=0;i<(s.length()+10);i++){
       try{
            System.out.println("The character " +i+ s.charAt(i));
			
	   }
        catch(Exception e){
            System.out.println("found an error " + e.getMessage());
			break;
		}
	}
	}

public static void main(String[]args){		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word");
		String word = sc.nextLine();
		generate(word);
}
}
		
