import java.util.Scanner;
//Creating the class
public class SpecificCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();
        str = str.trim(); 
        System.out.print("Enter the character to remove: ");
        char charToRemove = input.next().charAt(0);
        String modifiedStr = removeCharacter(str, charToRemove);
        System.out.println("Modified String: \"" + modifiedStr + "\"");
    }

    // Method to remove all occurrences of a specific character from the string
    public static String removeCharacter(String str, char charToRemove) {
        StringBuilder result = new StringBuilder(); 
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (currentChar != charToRemove) {
                result.append(currentChar);
            }
        }

        return result.toString(); 
    }
}