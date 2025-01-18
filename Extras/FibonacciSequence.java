//importing util package
import java.util.*;
//Creating the class Fibonacci
public class Fibonacci{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of terms in the Fibonacci sequence: ");
        int terms = input.nextInt();
        generateFibonacci(terms);
    }

    // Method to generate and print the Fibonacci sequence up to the specified number of terms
    public static void generateFibonacci(int terms) {
        if (terms <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }
        int first = 0, second = 1;
        if (terms >= 1) {
            System.out.print(first);
        }
        if (terms >= 2) {
            System.out.print(" " + second);
        }
        for (int i = 3; i <= terms; i++) {
            int nextTerm = first + second;
            System.out.print(" " + nextTerm);
            first = second;
            second = nextTerm;
        }

        System.out.println(); 
    }
}