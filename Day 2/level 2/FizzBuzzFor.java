//Create a class FizzBuzzFor
// importing Scanner class for taking input
import java.util.Scanner;
public class FizzBuzzFor {
    public static void main(String[] args) {
		//Create a Scanner object to take user input	
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a positive integer for FizzBuzz: ");
        int number = scanner.nextInt();

        //Control flow statements
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
           
              for (int i = 1; i <= number; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
        }
    }
}
