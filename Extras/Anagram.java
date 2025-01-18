//importing util package
import java.util.*;
//Creating the class Anagram
public class Anagram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		System.out.print("Enter the first string: ");
        String str1 = input.nextLine();
        str1 = str1.trim(); 
        System.out.print("Enter the second string: ");
        String str2 = input.nextLine();
        str2 = str2.trim(); 

        boolean areAnagrams = checkAnagram(str1, str2);
        if (areAnagrams) {
            System.out.println("The two strings are anagrams.");
        } else {
            System.out.println("The two strings are not anagrams.");
        }
    }

    // Method to check if two strings are anagrams of each other
    public static boolean checkAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        java.util.Arrays.sort(charArray1);
        java.util.Arrays.sort(charArray2);

        // Compare sorted arrays
        return java.util.Arrays.equals(charArray1, charArray2);
    }
}