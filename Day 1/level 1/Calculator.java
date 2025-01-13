import java.util.*;
public class Calculator{
  public static void main(String[] args){
/*Write a program to create a basic calculator that can perform addition, subtraction, multiplication, and division. The program should ask for two numbers (floating point) and perform all the operations
Hint => 
Create a variable number1 and number 2 and take user inputs.
Perform Arithmetic Operations of addition, subtraction, multiplication and division and assign the result to a variable and finally print the result
I/P => number1, number2
O/P => The addition, subtraction, multiplication and division value of 2 numbers ___ and ___ is ___, ____, ____, and ___*/
 Scanner sc = new Scanner(System.in);
 
        System.out.println("Enter the numbers:");
 
        // Take the inputs
       double number1 = sc.nextDouble();
       double number2 = sc.nextDouble();
		System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " +number1+ " and " +number2+ "is" +(number1+number2)+ " , " +(number1-number2)+ " , " +(number1*number2)+ " , " +(number1/number2));
  }
}
 
        