import java.util.Scanner;
//Creating the class
public class ToggleCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        str = str.trim();
        String toggledStr = toggleCase(str);
        System.out.println("String after toggling case: " + toggledStr);
    }

    // Method to toggle the case of each character in the string
    public static String toggleCase(String str) {
        StringBuilder toggledStr = new StringBuilder(); 
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (Character.isUpperCase(currentChar)) { 
                toggledStr.append(Character.toLowerCase(currentChar)); 
            } else if (Character.isLowerCase(currentChar)) { 
                toggledStr.append(Character.toUpperCase(currentChar));e
            } else {
                toggledStr.append(currentChar); 
            }
        }
        return toggledStr.toString(); 
    }
}