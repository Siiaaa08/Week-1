//importing util package
import java.util.*;
//Creating the class FrequentCharacter
public class FrequentCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
        String str = input.nextLine();
        str = str.trim();
		char mostFrequentChar = findMostFrequentCharacter(str);
        System.out.println("Most Frequent Character: '" + mostFrequentChar + "'");
    }

    // Method to find the most frequent character in a string
    public static char findMostFrequentCharacter(String str) {
        int[] frequency = new int[256];
        int maxFrequency = 0; 
        char mostFrequentChar = '\0';
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); 
            frequency[ch]++; 
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); 
            if (frequency[ch] > maxFrequency) {
                maxFrequency = frequency[ch];
                mostFrequentChar = ch; 
            }
        }

        return mostFrequentChar; 
    }
}