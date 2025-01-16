import java.util.*;
public class DoubleOpt{
     public static void main(String[] args){
/*Similarly, write the DoubleOpt program by taking double values and doing the same operations.*/

Scanner sc = new Scanner(System.in);
System.out.println("Enter numbers");
//taking inputs
double a = sc.nextDouble();
double b = sc.nextDouble();
double c = sc.nextDouble();
// declaring variables
double operation1 = (a + b) *c;
double operation2 = (a * b) + c;
double operation3 = (c + a) / b;
double operation4 = (a % b) + c;
// printing results
System.out.println("The results of Int Operations are " +operation1+ "," +operation2+ "," +operation3+ " and " +operation4);
	 }
}
