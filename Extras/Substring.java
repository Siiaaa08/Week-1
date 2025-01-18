import java.util.Scanner;
//Creating the class
public class Substring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String mainString = input.nextLine();
        mainString = mainString.trim();

        System.out.print("Enter the substring to find: ");
        String subString = input.nextLine();
        subString = subString.trim(); 
        int count = countSubstringOccurrences(mainString, subString);
        System.out.println("The substring \"" + subString + "\" occurs " + count + " time(s) in the main string.");
    }

    // Method to count occurrences of a substring in a string
    public static int countSubstringOccurrences(String mainString, String subString) {
        if (subString.isEmpty()) {
            return 0; // If substring is empty, return 0
        }
        int count = 0; 
        int index = 0;
        while ((index = mainString.indexOf(subString, index)) != -1) {
            count++;
            index += subString.length();
        }
        return count; 
    }
}