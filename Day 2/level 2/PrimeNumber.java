//Create a class PrimeNumbern to check if the given number is a prime number or not
// importing Scanner class for taking input
import java.util.Scanner;
public class PrimeNumber{
    public static void main(String[] args) {
		//Create a Scanner object to take user input	
         Scanner scanner = new Scanner(System.in);
         System.out.print("Enter a number to check if it is a prime number: ");
        int number = scanner.nextInt();

       //Control flow statements
        if (number <= 1) {
            System.out.println(number + " is not a prime number.");
        } else {
            boolean isPrime = true; 

            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) { 
                    isPrime = false;
                    break;
                }
            }

            
            if (isPrime) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        }
    }
}