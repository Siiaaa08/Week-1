import java.util.*;
public class ReturnCharacters{
    public static returnTheCharacters{
		char[]result = new char[s.length()];
		for(int i=0;i<s.length();i++){
			result=+s.charAt(i);
		}
		return result;
	}
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the text");
		String text = sc.nextLine();
		
		boolean r = true;
		char temp = text.toCharArray(i);
		char ans = returnTheCharacters(text);
		
		for(int i=0;i<text.length();i++){
			if(temp[i]!=ans[i]){
				return false;
			}
		}
		for(int i=0;i<text.length();i++){
			System.out.println(temp[i]);
		}
		for(int i=0;i<text.length();i++){
			System.out.println(ans[i]);
		}
		System.out.println(r);
	}
}
       		