import java.util.*;

public class CompareString {
    // Method to compare two strings using charAt
    public static boolean compareTwoStrings(String str1, String str2) {
        // If lengths are different, strings are not equal
        if (str1.length() != str2.length()) {
            return false;
        }
        // Compare each character
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true; // Strings are equal
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter the first string");
        String str1 = sc.next();
        System.out.println("Enter the second string");
        String str2 = sc.next();

        // Comparing using charAt method
        boolean charAtCompare = compareTwoStrings(str1, str2);

        // Comparing using equals method
        boolean equalsMethod = str1.equals(str2);

        // Output the results
        if (charAtCompare == equalsMethod) {
            if (charAtCompare) {
                System.out.println("The strings are equal.");
            } else {
                System.out.println("The strings are not equal.");
            }
        } else {
            System.out.println("Mismatch in results between charAt and equals methods.");
        }

    }
}

	