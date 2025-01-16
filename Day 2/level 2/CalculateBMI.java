 //Create a class CalculateBMI to find the BMI of a person
// importing Scanner class for taking input
import java.util.Scanner;
public class CalculateBMI {
    public static void main(String[] args) {
		//Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your weight (in kg): ");
        double weight = sc.nextDouble();
		System.out.print("Enter your height (in cm): ");
        double heightInCm = sc.nextDouble();
        double heightInMeters = heightInCm / 100.0;
        double bmi = weight / (heightInMeters * heightInMeters);
        System.out.println("\nYour BMI is: " + bmi);
        String weightStatus;
        
		//Control flow statements
        if (bmi < 18.4) {
            weightStatus = "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            weightStatus = "Normal weight";
        } else if (bmi >= 25 && bmi < 39.9) {
            weightStatus = "Overweight";
        } else {
            weightStatus = "Obesity";
        }
        System.out.println("The weight status of the person: " + weightStatus);

            }
}