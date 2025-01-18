import java.util.*;
public class VowelConsonant{

    
    // Method to count the number of vowels and consonants in a given string.
    public static void countVowelsAndConsonants(String str) {
        int vowelCount = 0;
        int consonantCount = 0;
        str = str.toLowerCase();
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        System.out.println("Vowel Count: " + vowelCount);
        System.out.println("Consonant Count: " + consonantCount);
    }

    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        String word = input.next();
        System.out.println("Input String: " + word);
        countVowelsAndConsonants(word);
    }
}