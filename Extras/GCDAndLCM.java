//importing util package
import java.util.*;
//Creating the class GCDAndLCM
public class GCDAndLCM{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        int gcd = calculateGCD(num1, num2);
        int lcm = calculateLCM(num1, num2, gcd);
        displayResult(gcd, lcm);
    }

    // Method to calculate the Greatest Common Divisor (GCD)
    public static int calculateGCD(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1; 
    }

    // Method to calculate the Least Common Multiple (LCM)
    public static int calculateLCM(int num1, int num2, int gcd) {
        return (num1 * num2) / gcd;
    }

    // Method to display the results
    public static void displayResult(int gcd, int lcm) {
        System.out.println("The Greatest Common Divisor (GCD) is: " + gcd);
        System.out.println("The Least Common Multiple (LCM) is: " + lcm);
    }
}