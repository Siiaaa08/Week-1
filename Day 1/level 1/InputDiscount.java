import java.util.*;
public class InputDiscount{
  public static void main(String[] args){
/*Write a new program similar to the program # 6 but take user input for Student Fee and University Discount
Hint => 
Create a variable named fee and take user input for fee.
Create another variable discountPercent and take user input.
Compute the discount and assign it to the discount variable.
Compute and print the fee you have to pay by subtracting the discount from the fee.
I/P => fee, discountPrecent
O/P => The discount amount is INR ___ and final discounted fee is INR ___*/

Scanner sc = new Scanner(System.in);
System.out.println("Enter fee");
int fee = sc.nextInt();
System.out.println("Enter Discount");
double discountPercent = sc.nextDouble();
double discountAmount = (double)fee*discountPercent/100;
double discountPrice = fee-discountAmount;
System.out.println("The discountAmount is INR " + discountAmount+ " and the final  discounted fee is INR " +discountPrice);
  }
}
