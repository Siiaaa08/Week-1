import java.util.*;
public class QuotientRemiander{
     public static void main(String[] args){
/*Write a program to take 2 numbers and print their quotient and reminder
Hint => Use division operator (/) for quotient and moduli operator (%) for reminder
I/P => number1, number2
O/P => The Quotient is ___ and Reminder is ___ of two number ___ and ___*/
Scanner sc = new Scanner(System.in);
//taking inputs
System.out.println("Enter numbers");
int number1 = sc.nextInt();
int number2 = sc.nextInt();
//declaring variables
double quotient = number1*number2;
int remainder = number1%number2;
//the result
System.out.println("The quotient is " +quotient+ " and remainder is " +remainder+ " of two numbers " +number1+ " and " +number2);
	 }
}

