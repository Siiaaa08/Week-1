//Create a class CalculatorUsingSwitch to create a calculator using switch...case.
// importing Scanner class for taking input
import java.util.Scanner;
public class CalculatorUsingSwitch{
	public static void main(String []args){
		//Create a Scanner object to take user input
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		double x=sc.nextDouble();
        System.out.println("Enter 2nd number: ");
		double y=sc.nextDouble();
		System.out.println("Enter operator (+, -, /, *): ");
		char op=sc.next().charAt(0);

         //Control flow statements
		switch(op){
			case '+': System.out.printf("Sum of two integers is %.2f ",x+y);break;
			case '-': System.out.printf("Substraction of two integers is %.2f ",x-y);break;

			case '*': System.out.printf("Multiplication of two integers is %.2f ",x*y);break;

			case '/': System.out.printf("Division of two integers is %.2f ",x/y);break;
		}
		System.out.println("\n");
	}
}