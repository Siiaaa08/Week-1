import java.util.*;
public class Height{
  public static void main(String[] args){
/*Write a program that takes your height in centimeters and converts it into feet and inches
Hint => 1 foot = 12 inches and 1 inch = 2.54 cm
I/P => height
O/P => Your Height in cm is ___ while in feet is ___ and inches is ___*/
Scanner sc = new Scanner(System.in);
System.out.println("Enter height");
double heightCm = sc.nextInt();
double heightFeet = heightCm / 30.48;
double heightInches = (heightFeet - (int)heightFeet)*12;
System.out.println("Your height in cm is " +heightCm+ " while in feet is " +(int)heightFeet+ " and inches is " +(int)heightInches);
  }
}



