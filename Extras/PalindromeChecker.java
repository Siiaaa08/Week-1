//importing util package
import java.util.*;
//Creating the class PalindromeChecker
public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = takeInput(input);
        boolean isPalindrome = checkPalindrome(str);
        displayResult(isPalindrome);
    }

    // Method to take input from the user
    public static String takeInput(Scanner input) {
        System.out.print("Enter a string: ");
        return input.nextLine().trim(); // Taking the string and trimming extra spaces
    }

    // Method to check if the string is a palindrome
    public static boolean checkPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true; 
    }

    // Method to display the result
    public static void displayResult(boolean isPalindrome) {
        if (isPalindrome) {
            System.out.println("The given string is a palindrome.");
        } else {
            System.out.println("The given string is not a palindrome.");
        }
    }
}