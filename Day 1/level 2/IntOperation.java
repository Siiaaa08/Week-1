import java.util.*;
public class IntOperation{
     public static void main(String[] args){
/*Write an IntOperation program by taking a, b, and c as input values and print the following integer operations a + b *c, a * b + c, c + a / b, and a % b + c. Please also understand the precedence of the operators. 
Hint => 
Create variables a, b, c of int data type.
Take user input for a, b, and c.
Compute 3 integer operations and assign result to a variable
Finally print the result and try to understand operator precedence.
I/P => fee, discountPercent
O/P => The results of Int Operations are —-, -—, and —-*/
Scanner sc = new Scanner(System.in);
System.out.println("Enter numbers");
//taking inputs
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();
// declaring variables
double operation1 = (a + b) *c;
double operation2 = (a * b) + c;
double operation3 = (c + a) / b;
double operation4 = (a % b) + c;
// printing results
System.out.println("The results of Int Operations are " +operation1+ "," +operation2+ "," +operation3+ " and " +operation4);
	 }
}
