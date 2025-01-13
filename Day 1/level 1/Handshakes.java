import java.util.*;
public class Handshakes{
  public static void main(String[] args){
/*Create a program to find the maximum number of handshakes among N number of students.
Hint => 
Get integer input for numberOfStudents variable.
Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
Display the number of possible handshakes.*/
Scanner sc = new Scanner(System.in);
System.out.println("Enter number of students");
int n = sc.nextInt();
int possibleHandshakes = (n*(n-1))/2;
System.out.println(possibleHandshakes);
  }
}

