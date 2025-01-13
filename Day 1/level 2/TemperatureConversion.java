import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the temperature in Celsius
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        // Convert Celsius to Fahrenheit
        double fahrenheitResult = (celsius * 9/5) + 32;

        // Output the result
        System.out.println("The " + celsius + " Celsius is " + fahrenheitResult + " Fahrenheit");

    }
}
