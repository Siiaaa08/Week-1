import java.util.*;
public class NullPointer{
	public static void generate(){
		String word = "";
		try{
			System.out.println("Null pointer exception is" +word.length());
		}
		catch(Exception e){
			System.out.println("Null pointer exception is" +e.getMessage());
		}
	}
	public static void main(String[]args){
		generate();
	}
}
