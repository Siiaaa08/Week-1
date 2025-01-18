//importing util package
import java.util.*;
//Creating the class ThreeNumbers
public class ThreeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = takeInput(input, 1);
        int num2 = takeInput(input, 2);
        int num3 = takeInput(input, 3);
        int maximum = findMaximum(num1, num2, num3);
        System.out.println("The maximum of the three numbers is: " + maximum);
    }

    // Method to take input from the user for a specific number
    public static int takeInput(Scanner input, int numberPosition) {
        System.out.print("Enter number " + numberPosition + ": ");
        return input.nextInt(); 
    }

    // Method to find the maximum of three numbers
    public static int findMaximum(int num1, int num2, int num3) {
        int max = num1; 
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
       return max; 
    }
}