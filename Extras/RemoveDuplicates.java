import java.util.Scanner;
//Creating the class
public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        str = str.trim(); 
        
       
        String modifiedStr = removeDuplicates(str);
        System.out.println("String after removing duplicates: " + modifiedStr);
    }

    // Method for removing duplicate characters from the string
    public static String removeDuplicates(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i); 
            if (result.indexOf(currentChar) == -1) { 
                result += currentChar; 
            }
        }
        return result; 
    }
}