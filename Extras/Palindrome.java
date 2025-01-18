//importing util package
import java.util.*;
//Creating the class Palindrome
public class Palindrome{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        str = str.trim(); 
        boolean isPalindrome = checkPalindrome(str);
        if (isPalindrome) {
            System.out.println("The entered string is a palindrome.");
        } else {
            System.out.println("The entered string is not a palindrome.");
        }
    }

    // Method for checking if the string is a palindrome
    public static boolean checkPalindrome(String str) {
        int start = 0; 
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++; 
            end--; 
        }
        return true; 
    }
}