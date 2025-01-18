//importing util package
import java.util.*;
//Creating the class LongestWord
public class LongestWord{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();
        sentence = sentence.trim();
        String longestWord = findLongestWord(sentence);
        System.out.println("The longest word in the sentence is: " + longestWord);
    }

    // Method for finding the longest word in the sentence
    public static String findLongestWord(String sentence) {
        String[] words = sentence.split(" "); 
        String longestWord = ""; 
        for (String word : words) {
            if (word.length() > longestWord.length()) { 
                longestWord = word; 
        }
		// Return the longest word
        return longestWord; 
    }
}