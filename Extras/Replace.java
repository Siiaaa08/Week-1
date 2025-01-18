import java.util.Scanner;
//Creating the class
public class Replace {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();
        sentence = sentence.trim();
        System.out.print("Enter the word to replace: ");
        String wordToReplace = input.nextLine();
        System.out.print("Enter the replacement word: ");
        String replacementWord = input.nextLine();
		String modifiedSentence = replaceWord(sentence, wordToReplace, replacementWord);
        System.out.println("Modified Sentence: \"" + modifiedSentence + "\"");
    }

    // Method to replace all occurrences of a word in a sentence
    public static String replaceWord(String sentence, String wordToReplace, String replacementWord) {
        return sentence.replaceAll("\\b" + wordToReplace + "\\b", replacementWord);
    }
}